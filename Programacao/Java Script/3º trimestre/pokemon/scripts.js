//Inicial
let selectPokemon = document.querySelector("#selectPokemon");
var url = window.location.href;

// Dividir a URL em partes usando '?' como separador
var parts = url.split('?');

// Verificar se a URL tem pelo menos duas partes
if (parts.length >= 2) {
    // Acessar a terceira parte, que é "pokemon"
    var pokemonValue = parts[parts.length - 1];
    pesquisaPokemon(pokemonValue);
}
// Select - Lista

fetch("https://pokemon.danielpimentel.com.br/v1/pokemon/lista")
    .then(resposta => resposta.json())
    .then(function (lista) {
        for (var i = 0; i < lista.pokemon.length; i++) {
            let pokemon = lista.pokemon[i].nome;
            selectPokemon.innerHTML += `<option value="${pokemon}">${pokemon}</option>`;
        }
    })
    .catch(erro => console.log(erro));
    
//Buscar

let bntBuscar = document.querySelector("#btnBuscar");

bntBuscar.addEventListener("click", clickBuscarPokemon);

function clickBuscarPokemon() {
    pesquisaPokemon(selectPokemon.value)
}
function pesquisaPokemon(nome) {
    fetch(`https://pokemon.danielpimentel.com.br/v1/pokemon/nome/${nome}`)
        .then(resposta => resposta.json())
        .then(pokemon => mostrarPokemon(pokemon.pokemon))
        .catch(erro => console.log(erro));
}

//Monstrar informações

function mostrarPokemon(pokemon) {
    document.getElementById('nome').innerHTML = pokemon.nome;
    document.getElementById('valorNumero').innerHTML = pokemon.numero;
    document.getElementById('valorAltura').innerHTML = pokemon.altura;
    document.getElementById('valorPeso').innerHTML = pokemon.peso;
    document.getElementById('valorGeracao').innerHTML = pokemon.geracao;
    document.getElementById('valorHp').innerHTML = pokemon.hp;
    document.getElementById('valorAtk').innerHTML = pokemon.atk;
    document.getElementById('valorDef').innerHTML = pokemon.def;
    document.getElementById('valorSpatk').innerHTML = pokemon.spatk;
    document.getElementById('valorSpdef').innerHTML = pokemon.spdef;
    document.getElementById('valorSpeed').innerHTML = pokemon.speed;
    document.getElementById('valorEvolucoes').innerHTML = pokemon.evolucoes;

    mostraInformacoes(pokemon)
    mostraElementos(pokemon.tipo);
    monstraCarrossel(pokemon);
}


function mostraInformacoes() {
    document.querySelector(".informacoes").style.visibility = 'visible';
}

function mostraElementos(tipo) {
    const tipos = tipo.split(',');
    let icons = document.querySelector(".icons");
    icons.innerHTML = '';
    for (var i = 0; i < tipos.length; i++) {
        icons.innerHTML += `<div class="icon ${tipos[i]}">
                    <img src="icons/${tipos[i]}.svg"/></div>`;
    }
}

//Carrossel
var swiper = new Swiper(".mySwiper", {
    navigation: {
        nextEl: ".swiper-button-next",
        prevEl: ".swiper-button-prev",
    },
});

function monstraCarrossel(pokemon) {

    carrossel = document.querySelector(".swiper-wrapper");
    carrossel.innerHTML = '';
    carrossel.innerHTML += `<div class="swiper-slide"><img src="${pokemon.img}" alt=""></div>`
    carrossel.innerHTML += `<div class="swiper-slide"><img src="${pokemon.img_3d}" alt=""></div>`
    carrossel.innerHTML += `<div class="swiper-slide"><img src="${pokemon.img_shiny}" alt=""></div>`
}


