let catalogo = document.getElementById("catalogo");
let inicial = 1;
let quantidade = 13;
let bntMostrarM = document.getElementById("bntMostrarM");

bntMostrarM.addEventListener("click", mostrarMais);

async function mostraCatalogos(min, max) {
    for (let i = min; i < max; i++) {
        try {
            const resposta = await fetch(`https://pokemon.danielpimentel.com.br/v1/pokemon/numero/${i}`);
            const pokemon = await resposta.json();
            mostraCatalogo(pokemon);
        } catch (erro) {
            console.log(erro);
        }
    }
    inicial = max;
}

function mostraCatalogo(pokemon) {
    let htmlCatalogo = `
    
        <a href="../../index.html?${pokemon.pokemon.nome}" class="ficha">
            <span class="img"><img src="${pokemon.pokemon.img}"></span> </br>
            <span class="nome">Nome: ${pokemon.pokemon.nome}</span> </br>
            <span class="num">Número ${pokemon.pokemon.numero}</span>
        </a>
    `;
    catalogo.innerHTML += htmlCatalogo;
}

function mostrarMais() {
    console.log(inicial);
    mostraCatalogos(inicial, inicial + quantidade);
}

mostraCatalogos(inicial, quantidade);
