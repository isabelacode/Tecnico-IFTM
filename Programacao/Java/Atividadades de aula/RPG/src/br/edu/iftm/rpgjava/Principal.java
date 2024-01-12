package br.edu.iftm.rpgjava;

import java.util.Random;

public class Principal {
    public static void main(String[] args) {

        // Métodos contrutores:

        // Objeto Guerreiro
        Guerreiro g = new Guerreiro("Vladimir", 80, 30, 50, -3, 2, 80, 100, 90, 10, 63);

        // Objeto Mago
        Mago m = new Mago("Agostinho Carrara", 10, 90, 0, 95, 35, 55, 100, 45, 85, 100);

        // Objeto Arqueiro
        Arqueiro a = new Arqueiro("Jhoson", 0, 90, 20, 60, 50, 30, 75, 45, 5, 60);
        a.setCarisma(20);

        Random dado = new Random();

        int round = 1;
        while (g.getVida() > 0 && m.getVida() > 0) {

            System.out.println("-------------Round: " + round + "-------------");
            System.out.println("Oponente 1: " + g.getNome());
            System.out.println("Vida: " + g.getVida());

            System.out.println("");

            System.out.println("Oponente 2: " + m.nome);
            System.out.println("Vida: " + m.vida);

            System.out.println("");

            // Turno do mago(m)
            int valorDado = dado.nextInt(6);
            System.out.println("");

            System.out.println("Valor do dado: " + valorDado);
            System.out.println("");

            int valorAtaque = m.atacar(valorDado);
            System.out.println("");

            g.defender(valorAtaque);

            // Turno do guerreiro(g)
            valorDado = dado.nextInt(6);
            System.out.println("Valor do dado: " + valorDado);
            System.out.println("");

            valorAtaque = g.atacar(valorDado);
            System.out.println("");

            m.defender(valorAtaque);

            round++;

            if (m.vida <= 0) {
                System.out.println("O guerreiro " + g.getNome() + " ganhou!");
            } else if (g.getVida() <= 0) {
                System.out.println("O mago " + m.nome + " ganhou!");
            } else {
                System.out.println("Empate!");
            }
        }

    }
}