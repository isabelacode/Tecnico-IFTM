let a = document.querySelector('.a');
let b = document.querySelector('.b');
let c = document.querySelector('.c');
let btnEnviar = document.querySelector('#btnEnviar');
let btnCopiar = document.querySelector('#btnCopiar')
let btnB = document.querySelector('.btnB');
let btnC = document.querySelector('.btnC');


btnEnviar.addEventListener("click", enviarMsg);
btnCopiar.addEventListener("click", copiarMsg);
btnB.addEventListener("click", limparMsgB);
btnC.addEventListener("click", limparMsgC);



function enviarMsg(evento){
    let msg = txtMsg.value; 
    b.innerHTML += msg + "<br />";

    txtMsg.value = ""; 
}

function copiarMsg(evento){
    let msg = b.innerHTML; 
    c.innerHTML += msg + "<br />";

    b.innerHTML = ""; 
}

function limparMsgB(evento){
    b.innerHTML = " ";
}

function limparMsgC(evento){
    c.innerHTML = " ";
}
