package br.edu.iftm.exercícios;

public class Contador {
    private int valor;

    public Contador() {
    }

    public Contador(int valor) {
        this.valor = valor;
    }

    public void zerar() {
        valor = 0;
    }

    public void incrementar() {
        valor++;
    }

    public void retornar() {
        System.out.println(valor);
    }
}
