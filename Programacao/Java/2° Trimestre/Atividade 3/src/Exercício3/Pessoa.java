package Exercício3;

import java.util.Scanner;

public class Pessoa {
    protected String nome;
    protected float idade;

    Scanner entrada = new Scanner(System.in);

    public Pessoa() {
    }

    public Pessoa(String nome, float idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void informacoes(String pessoa) {
        System.out.println("Dados da " + pessoa + " pessoa: ");
        System.out.println("Nome: ");
        this.nome = entrada.nextLine();
        System.out.println("Idade: ");
        this.idade = entrada.nextFloat();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getIdade() {
        return idade;
    }

    public void setIdade(float idade) {
        this.idade = idade;
    }

}
