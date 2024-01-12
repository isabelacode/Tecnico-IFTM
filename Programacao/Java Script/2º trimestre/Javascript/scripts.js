// alert("Funcionou...");

//Imprime uma mensagem na caixa :
function imprime(msg, limpar) {
    let caixa = document.querySelector("#caixa");
    if (limpar)
        caixa.innerHTML = "";

    caixa.innerHTML += msg + "<br/>";

}
imprime("Boa tarde!")

// Variáveis
// Tipos: int, float, string, boolean,function,
// object, null, undefined
let nome = "Aline";
let idade = 17;
let presente = false;
let sobrenome = "Siqueira";



imprime(nome);

// Concatenação: +

imprime(nome + " tem " + idade + " de idade ");
imprime("O nome completo da aluna é " + nome + " " + sobrenome);


// Operações matemáticas
// +, -, *, /
let anoAtual = 2023;
let anoNascimento = 1994;
let anosDeVida = anoAtual - anoNascimento;

imprime(anosDeVida)
imprime(10 + 10);
//    DIFERENÇA
// imprime(10 + "10");


// Operadores condicionais 
// >, <, >=, <=, ==, != (diferente)

// Operadores lógicos
// && (E), || (OU), ! (NEGAÇÃO)


// Estruturas condicionais :
imprime("------------- IF -------------")
if (idade < 18) {
    imprime("É menor de idade.")
} else if (idade < 70) {
    imprime("É adulto.")
} else {
    imprime("É idoso.")
}

imprime("------------- Voto -------------")
if (idade >= 18 && idade <= 65) {
    imprime("Voto Obrigatório.")
} else if (idade >= 16 && idade < 18 || idade > 65) {
    imprime("Voto Facultativo.")
} else {
    imprime("Não pode votar.")
}


// Estruturas de repetição :
imprime("------------- WHILE -------------")
let cont = 1;
while (cont < 10) {
    imprime(cont);
    cont++;
}

let dinheiro = 43;
let preco = 6;
let qtSalg = 0;

while (dinheiro >= preco) {
    qtSalg++
    dinheiro = (dinheiro - preco)
}

imprime("Você consegue comprar " + qtSalg + " salgados.")

//Ou

// while(dinheiro >= preco){
//     imprime("Comprei um salgado");
//     dinheiro = (dinheiro - preco);
// }

// For é um while que usa contador
imprime("------------- FOR -------------")
for (let i = 0; i < 10; i++) {
    imprime(i);
}

// FUNÇÕES 
// Declar/criar uma função

imprime("------------- FUNÇÕES -------------")
function somar(num1, num2) {
    let resultado = num1+ num2;

    return resultado;
}

// Chamar/usar a função
let conta = somar(10, 30);
conta = somar(conta, 21);
imprime(conta);

let x = 10;
imprime("x fora: " + x);

function testarEscopo(x) {
    imprime("x dentro: " + x);
}

testarEscopo(33);

imprime("x fora: " + x);

//Vetores :
imprime("------------- VETORES -------------")
let frutas = ["abacate", "bergamota", "carambola", "damasco", "estrela", "framboesa"];

console.log(frutas);

let primeiro = frutas[0];

console.log("Primeiro:", primeiro);

let segundo = frutas[2];
console.log("Segundo:", segundo);

let tam = frutas.length;
console.log("Tamanho:", tam)


let ultimo = frutas[tam - 1];
console.log("Último:", ultimo);

frutas[2] = "coco"

console.log(frutas)