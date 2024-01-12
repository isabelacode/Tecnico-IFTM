let express = require('express');
let cors = require('cors');
let porta = 3001;

//BD
let bd = require('./bd_spotify.json')

// Iniciar o servidor
let app = express();

//Configurar o servidor
app.use(cors());
app.use(express.json());

//Rotas
app.get('/', (req, res) => {
    return res.status(200).json({ msg: 'Rota inicial...' });
})

// /artistas
app.get('/artistas', (req, res) => {
    let artistas = [];
    //  Percorrendo artistas
    for (let artista of bd) {
        artistas.push(artista.nome)
    }
    return res.status(200).json(artistas);
});


// /artista/:nome
app.get('/artista/:nome', (req, res) => {
    let nomeArtista = req.params.nome;
    let infoArtistas = [];
    for (let artista of bd) {
        if (nomeArtista == artista.nome) {
            infoArtistas.push({
                id: artista.id,
                nome: artista.nome,
                foto: artista.foto,
                seguidores: artista.seguidores,
                generos: artista.generos,
                popularidade: artista.popularidade
            })
        }
    }
    return res.status(200).json(infoArtistas);
});

// /albuns/:artista

app.get('/albuns/:nome', (req, res) => {
    let nomeArtista = req.params.nome;
    let infoArtistas = [];
    let numFaixas = [];


    for (let artista of bd) {
        if (nomeArtista == artista.nome) {
            for (let cd of artista.albums) {
                numFaixas = cd.faixas
                infoArtistas.push({
                    nome: cd.nome,
                    foto: cd.foto,
                    lancamento: cd.lancamento,
                    faixas: numFaixas.length
                })
            }
        }
        return res.status(200).json(infoArtistas);
    }
});

// /musicas/:album
app.get('/musicas/:album', (req, res) => {

    let album = req.params.album;
    let musicas = [];

    for (let artista of bd) {
        for (let cd of artista.albums) {
            if (cd.nome == album) {
                musicas = cd.faixas;
                //Percorrer cada musica
                // for(let musica of cd.faixas){
                //     musicas.push(musica.nome)
                // }
            }

        }
    }
    return res.status(200).json(musicas);
});

// /genero/:nome 
app.get('/genero/:nome', (req, res) => {
    let nomeGenero = req.params.nome;
    let artistas = [];

    for (let artista of bd) {
        for (let genero of artista.generos) {
            if (nomeGenero == genero) {
                artistas.push({
                    id: artista.id,
                    nome: artista.nome,
                    foto: artista.foto,
                    seguidores: artista.seguidores,
                    popularidade: artista.popularidade
                })
            }
        }
    }
    return res.status(200).json(artistas);
});

app.listen(porta, () => {
    console.log(`Rodando em http://localhost:${porta}`);
})

