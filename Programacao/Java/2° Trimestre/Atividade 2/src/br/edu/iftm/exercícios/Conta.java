package br.edu.iftm.exercícios;

public class Conta {
    private String nome;
    private int id;
    private double saldo;

    public Conta() {
    }

    public Conta(String nome, int id, double saldo) {
        this.nome = nome;
        this.id = id;
        this.saldo = saldo;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public double getSaldo() {
        return saldo;
    }
}