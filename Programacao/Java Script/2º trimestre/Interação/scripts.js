// Pegar os elementos HTML que vc quer interagir 
let caixa = document.querySelector("#caixa");
let btnMsgAuto = document.querySelector("#btnMsgAuto");
let txtMsg = document.querySelector("#txtMsg");
let btnEnviaMsg = document.querySelector("#btnEnviaMsg");
let btnVisual = document.querySelector("#btnVisual");

// Ação no botão
// Listeners: ouvinte (vigia)
// elementoViagiado.addEventListener("evento", funcaoASerChamada);
btnMsgAuto.addEventListener("click", enviarMsgAutomatica);

btnEnviaMsg.addEventListener("click", enviarMsg);

btnVisual.addEventListener("click", mudarVisual);

// Funções :
function enviarMsgAutomatica(evento) {
    //Alterar o HTML de um elemento
    caixa.innerHTML = "Este <u>texto</u> é automático <br /> <img src='imagem.jfif'>";
}

function enviarMsg(evento) {
    let msg = txtMsg.value; // Pegando / Get
    caixa.innerHTML += msg + "<br />";

    // Limpar a caixa de texto
    txtMsg.value = ""; // Definindo / Set
}

function mudarVisual(evento) {
    caixa.style.backgroundColor = "#ffcc00";
    caixa.style.borderStyle = "dashed";
}