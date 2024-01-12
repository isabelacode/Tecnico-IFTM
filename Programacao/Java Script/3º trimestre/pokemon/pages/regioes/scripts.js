let selectRegioes = document.querySelector("#selectRegioes");
let pageIni = 1;
let catalogoRegioes = document.getElementById("catalogoRegioes");
let bntBuscar = document.getElementById("bntBuscar");
let bntMostrarM = document.getElementById("bntMostrarM");

bntMostrarM.addEventListener("click", mostrarMais);
bntBuscar.addEventListener("click", buscarRegiao);

fetch("https://pokemon.danielpimentel.com.br/v1/regioes")
    .then(resposta => resposta.json())
    .then(function (regioes) {
        for (var i = 0; i < regioes.regioes.length; i++) {
            let valorRegioes = regioes.regioes[i].nome;
            selectRegioes.innerHTML += `<option value="${valorRegioes}">${valorRegioes}</option>`;
        }
    })
    .catch(erro => console.log(erro));

function buscarRegiao() {
    bntMostrarM.style.visibility = 'visible';
    if (pageIni == 1) {
        carregarRegioes();
    } else {
        catalogoRegioes.innerHTML = "";
        pageIni = 1;
    }


}

function htmlRegiao(regiao) {
    for (let i = 1; i < regiao.pokemon.length; i++) {
        let htmlCatalogo = `
        <a href="../../index.html?${regiao.pokemon[i].nome}" class="ficha">
            <span class="img"><img src="${regiao.pokemon[i].img}"></span> </br>
            <span class="nome">Nome: ${regiao.pokemon[i].nome}</span> </br>
            <span class="num">Número ${regiao.pokemon[i].numero}</span>
        </a>
    `;
        catalogoRegioes.innerHTML += htmlCatalogo;
    }
}

function carregarRegioes() {
    fetch(`https://pokemon.danielpimentel.com.br/v1/pokemon/regiao/${selectRegioes.value}/50/${pageIni}`)
        .then(resposta => resposta.json())
        .then(regiao => htmlRegiao(regiao))
        .catch(erro => console.log(erro));
    pageIni++;
}

function mostrarMais() {
    carregarRegioes()
}
