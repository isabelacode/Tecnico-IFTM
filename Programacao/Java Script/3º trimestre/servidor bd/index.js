let express = require('express');
let cors = require('cors');
let porta = 3000;

//BD
let bd = require('./bd');

// Iniciar o servidor
let app = express();

//Configurar o servidor
app.use(cors());
app.use(express.json());

//Rotas
app.get('/', (req, res) => {
    return res.status(200).json({ msg: 'Rota inicial...' });
})
//Pegar todos os filmes
app.get('/filmes', async (req, res) => {
    // SQL: SELECT id, titulo FROM filmes
    let filmes = await bd.query('SELECT id, titulo FROM filmes ORDER BY TITULO');
    return res.status(200).json(filmes);
});

// Pegar um filme de um id especifico
app.get('/filmes/:id', async(req, res) =>{
    let id = req.params.id;

    let filme = await bd.query('SELECT * FROM filme WHERE id = ?', [id]);
    // let filme = await bd.query('SELECT * FROM filme WHERE id = ? AND year = ?', [id, year]);

})

// Filtrar por nota
// /filmes/maior/:nota
app.get('/filmes/maior/:nota', async(req, res) =>{
    let nota = req.params.nota;

    let filme = await bd.query('SELECT * FROM filme WHERE nota = ?', [nota]);
    // let filme = await bd.query('SELECT * FROM filme WHERE id = ? AND year = ?', [id, year]);

})


app.listen(porta, () => {
    console.log(`Rodando em http://localhost:${porta}`);
});


