let express = require('express');
let cors = require('cors');
let porta = 3000;

// Banco de dados
let bd = require("./bd")

// Iniciar o servidor
let app = express();

// Configurar o servidor
app.use(cors());
app.use(express.json());

// Rotas
app.get('/', (req, res) => {
    return res.status(200).json({ msg: 'Rota Inicial' });
})

// /tipos - Retorna todos os tipos dos Pokémon.
app.get('/v1/tipos', async (req, res) => {
    let tipos = await bd.query('SELECT id, nome FROM tipos');

    return res.status(200).json({ tipos: tipos });
});

// /regioes - Retorna todas as regiões dos Pokémon.
app.get('/v1/regioes', async (req, res) => {
    let regioes = await bd.query('SELECT id, nome FROM regioes');

    return res.status(200).json({ regioes: regioes });
});

// /pokemon/nome/{nomeDoPokemon} - Retorna um único Pokémon com o nome informado.
app.get('/v1/nome/:nomeDoPokemon', async (req, res) => {
    let nomeDoPokemon = req.params.nomeDoPokemon;

    let pokemon = await bd.query('SELECT * FROM pokemon WHERE nome = ?', [nomeDoPokemon]);

    return res.status(200).json({ pokemon: pokemon });
});

// /pokemon/numero/{numeroDoPokemon} - Retorna um único Pokémon com o número informado.
app.get('/v1/pokemon/numero/:numeroDoPokemon', async (req, res) => {
    let numeroDoPokemon = req.params.numeroDoPokemon;

    let pokemon = await bd.query('SELECT * FROM pokemon WHERE id = ?', [numeroDoPokemon]);

    return res.status(200).json({ pokemon: pokemon });
});

// /pokemon/tipo/{nomeDoTipo}/{quantidade}/{pagina} - Retorna uma lista de Pokémon do tipo informado.
app.get('/v1/pokemon/tipo/:nomeDoTipo/:quantidade/:pagina', async (req, res) => {
    let nomeDoTipo = req.params.nomeDoTipo;
    let quantidade = req.params.quantidade;
    let pagina = req.params.pagina;

    // O máximo 50 por página
    quantidade = Math.min(quantidade, 50);

    // Calcula o offset(desvio) com base na quantidade e na página
    let offset = (pagina - 1) * quantidade;

    // Consulta no banco de dados
    let query = 'SELECT * FROM pokemon WHERE FIND_IN_SET(?, tipo) LIMIT ?, ?';
    let pokemons = await bd.query(query, [nomeDoTipo, offset, parseInt(quantidade)]);

    return res.status(200).json({ pokemons: pokemons });
});

// /pokemon/geracao/{numeroDaGeracao}/{quantidade}/{pagina} - Retorna uma lista de Pokémon que pertencem à geração informada. 
app.get('/v1/pokemon/geracao/:nomeDaGeracao/:quantidade/:pagina', async (req, res) => {
    let nomeDaGeracao = req.params.nomeDaGeracao;
    let quantidade = req.params.quantidade;
    let pagina = req.params.pagina;

    // O máximo 50 por página
    quantidade = Math.min(quantidade, 50);

    // Calcula o offset(desvio) com base na quantidade e na página
    let offset = (pagina - 1) * quantidade;

    // Consulta no banco de dados
    let query = 'SELECT * FROM pokemon WHERE FIND_IN_SET(?, geracao) LIMIT ?, ?';
    let pokemons = await bd.query(query, [nomeDaGeracao, offset, parseInt(quantidade)]);

    return res.status(200).json({ pokemons: pokemons });
});

// /pokemon/lista/{numeroDaGeracao} - Retorna uma lista com apenas nome e número dos Pokémon da região(creio que da geração) informada.
app.get('/v1/pokemon/lista/:numeroDaGeracao', async (req, res) => {
    let numeroDaGeracao = req.params.numeroDaGeracao;

    let pokemon = await bd.query('SELECT nome, numero FROM pokemon WHERE geracao = ?', [numeroDaGeracao]);

    return res.status(200).json({ pokemon: pokemon });
});

// /pokemon/lista/ - Retorna uma lista com apenas nome e número de todos os Pokémon.
app.get('/v1/pokemon/lista', async (req, res) => {
    let pokemons = await bd.query('SELECT * FROM pokemon')

    return res.status(200).json({ pokemons: pokemons })
});


//Rodar a porta
app.listen(porta, () => {
    console.log(`Rodando em http://localhost:${porta}`);
})