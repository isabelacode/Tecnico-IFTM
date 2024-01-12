let pessoa = {
    nome: "Adriano",
    idade: 17,
    cidade: "Ituiutaba",
    presente: true
}
console.log(pessoa["idade"])
// console.log(pessoa.idade)

let escola = {
    info: {
        nome: "informática",
        criacao: 2010,
        turmas: [
            {
                ano: 1,
                alunos: 70,
                diciplina: [
                    {
                        nome: "LP1",
                        professor: "Alexandre"
                    },
                    {
                        nome: "Sistemas Digitais",
                        professor: "Marcelo"
                    }
                ]
            },
            {
                ano: 2,
                alunos: 36,
                diciplina: [
                    {
                        nome: "Engenharia de software",
                        professor: "Reane"
                    },
                    {
                        nome: "Laboratorio de Hardware",
                        professor: "Marcelo"
                    }
                ]
            },
            {
                ano: 3,
                alunos: 33,
                diciplina: [
                    {
                        nome: "LP3",
                        professor: "Daniel"
                    },
                    {
                        nome: "Redes II",
                        professor: "Ailton"
                    }
                ]
            }
        ]
    }
}
console.log("Nome:", escola.info.nome);
console.log("Alunos 3º:", escola.info.turmas[2].alunos);
console.log("Professor de LP3:", escola.info.turmas[2].diciplina[0].professor);

//Mostrar quantos alunos cada turma possui, use um FOR para percorrer a lista de turma automaticamente
for (let i = 0; i < escola.info.turmas.length; i++) {
    console.log("Turma do", i + 1, "º ano, possui", escola.info.turmas[i].alunos, "alunos")
}

//JSON: JavaScript Object Notation
// Pegar um objeto em texto
let texto = JSON.stringify(escola);
console.log(texto);

// Converte texto em objeto
let objeto = JSON.parse(texto);
console.log(objeto);



//ATIVIDADE

//  Exiba o nome da série, o resumo e a nota. 
let nome = document.querySelector("#nome");
let resumo = document.querySelector("#resumo");
let nota = document.querySelector("#nota");

nome.innerHTML = (bd.nome);
resumo.innerHTML = (bd.resumo);
nota.innerHTML = (bd.nota);

//  Exiba o pôster da série. 
let poster = document.querySelector("#poster");
poster.innerHTML = `<img src="${bd.fotoPoster}" width= "200" />`

//  Exiba todos os gêneros da série. 
let generos = document.querySelector("#generos");
for (let i = 0; i < bd.generos.length; i++) {
    generos.innerHTML += bd.generos[i] + "<br />";
};

//  Exiba a foto de todos os atores da série 
let atores = document.querySelector("#atores");
for (let i = 0; i < bd.elenco.length; i++) {
    atores.innerHTML += `<img src= "${bd.elenco[i].foto}" width= "100" />`

}

//  Exiba o pôster de cada temporada e o número de episódios, abaixo do pôster. 
let temporadas = document.querySelector("#temporadas");
for (let temp of bd.temporadas) {
    temporadas.innerHTML += `
    <img src="${temp.poster}" width="200" /><br />
    ${temp.numero_episodios} episodios<br />`
}

//  Liste o nome de cada um dos episódios da segunda temporada
let episodios = document.querySelector("#episodios")

for (let ep of bd.temporadas[1].episodios) {
    episodios.innerHTML += `
    <p>${ep.nome} </p>`
}