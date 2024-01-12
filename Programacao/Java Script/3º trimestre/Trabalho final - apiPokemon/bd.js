// Configurar o seu BD
let mysql = require('serverless-mysql');

let config = {
    host: 'localhost',
    database: 'pokemons',
    user: 'root',
    password: ''
}

let bd = mysql({config});
module.exports = bd;