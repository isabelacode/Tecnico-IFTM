package br.edu.iftm.testes;

import br.edu.iftm.exercícios.Conta;
import br.edu.iftm.exercícios.Contador;
import br.edu.iftm.exercícios.Lâmpada;

public class Principal {
    public static void main(String[] args) {
        Contador c1 = new Contador(52);
        c1.incrementar();
        c1.retornar();
        c1.zerar();
        c1.retornar();

        Contador c2 = new Contador(2);
        c2.incrementar();
        c2.retornar();

        Contador c3 = new Contador(2);
        c3.zerar();
        c3.retornar();

        Lâmpada l1 = new Lâmpada(false);
        l1.ligar();
        l1.estado();
        l1.desligar();
        l1.estado();

        Lâmpada l2 = new Lâmpada(true);
        l2.estado();

        Lâmpada l3 = new Lâmpada(false);
        l3.ligar();
        l3.estado();

        Conta con1 = new Conta("João", 1, 520.20f);
        con1.depositar(1100);
        con1.sacar(25.30f);
        System.out.println(con1.getId() + " " + con1.getNome() + " " + con1.getSaldo());

        Conta con2 = new Conta("Maria", 2, 1200);
        con2.depositar(560);
        System.out.println(con1.getId() + " " + con1.getNome() + " " + con1.getSaldo());
    }
}
