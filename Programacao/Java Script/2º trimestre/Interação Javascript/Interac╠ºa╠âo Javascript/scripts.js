let like = document.querySelector('.like');
let formulario = document.querySelector('.formulario');
let comentar = document.querySelector('.comentar');
let comentarios = document.querySelector('.comentarios');
let txtMsg = document.querySelector('#txtComentario');
let btnComentar = document.querySelector('#btnComentar');
let foto = document.querySelector('.foto img');


like.addEventListener("click", likeEdeslike);
comentar.addEventListener("click", monstrarForm);
btnComentar.addEventListener("click", enviarComentario);
foto.addEventListener("dblclick", darLike);



function likeEdeslike(evento) {
    if (like.getAttribute('src') == "icones/coracao.png") {
        like.setAttribute('src', "icones/coracao_red.png");
    } else {
        like.setAttribute('src', "icones/coracao.png");
    }
}

function monstrarForm(evento) {
    formulario.style.visibility = 'visible';
}

 function enviarComentario(evento) {
     let msg = txtMsg.value;

     let html = '<div class="comentario"><span>Isabela</span><p>' + msg + '</p></div>';
     comentarios.innerHTML += html;
     txtMsg.value = "";
 }



function darLike(evento) {
    if (like.getAttribute('src') == "icones/coracao.png") {
        like.setAttribute('src', "icones/coracao_red.png");
    } else {
        like.setAttribute('src', "icones/coracao.png");
    }
}
