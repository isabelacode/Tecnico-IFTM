// node --version
// npm --version
//npm init
// npm i express cors
//node index.js
let express = require('express');
let cors = require('cors');

let porta = 3000;

// Iniciar o servidor
let app = express();

//Configurar o servidor
app.use(cors()); // 
app.use(express.json());

//BD
let produtos = [
    { id: 1, nome: 'Alfajor', preco: 15.00 },
    { id: 2, nome: 'Brigadeiro', preco: 4.00 },
    { id: 3, nome: 'Brigadeiro de Paçoca', preco: 2.50 },
    { id: 4, nome: 'Pudim', preco: 20.00 },
];

app.get('/', (req, res) => {
    return res.status(200).json({ msg: 'Rota inicial' });
})

app.get('/produtos', (req, res) => {
    return res.status(200).json({ produtos: produtos });
})


app.get('/produto/:id', (req, res) => {
    let id = req.params.id;
    // for (let i = 0; i < produtos.length; i++) {
    //     if (produtos[i].id == id) {
    //         return res.status(200).json({ produto: produtos[i] })
    //     }
    // }
    //return res.status(200).json({ msg: "Não encontrado" });
    return res.status(200).json({ produto: produtos.find(item => item.id == id) });
})

app.listen(porta, () => {
    console.log(`Rodando em http://localhost:${porta}`);
})

