package br.edu.iftm.exercícios;

public class Elevador {
    private int andarAt = 0;
    private int andarTot;
    private int capacidade;
    private int quantDePessoas = 0;

    public Elevador(int andarTot, int capacidade) {
        this.andarTot = andarTot;
        this.capacidade = capacidade;
    }

    public void entrar() {
        if (quantDePessoas <= capacidade) {
            quantDePessoas++;
        } else {
            System.out.println("Limite atingido");
        }
    }

    public void sair() {
        quantDePessoas--;
    }

    public void subir() {
        if (andarAt <= andarTot) {
            andarAt++;
        } else {
            System.out.println("Você chegou ao último andar! ");
        }
    }

    public void descer() {
        if (andarAt > 0) {
            andarAt--;
        } else if (andarAt <= 0) {
            System.out.println("Você chegou ao térreo");
        }
    }
}
