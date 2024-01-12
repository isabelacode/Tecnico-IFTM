package br.edu.iftm.rpgjava.testes;

import java.util.Random;

import br.edu.iftm.rpgjava.classes.Arqueiro;
import br.edu.iftm.rpgjava.classes.Guerreiro;
import br.edu.iftm.rpgjava.classes.Mago;

public class Principal {

    public static void main(String[] args) {

        Guerreiro g = new Guerreiro("Vladimir", 80, 50, 30, -3, 0,
                80, 100, 90, 10, 63); // metodo construtor

        System.out.println(g.getNome());

        // Objeto br.edu.iftm.rpgjava.classes.Guerreiro
        /*
         * g.setNome("Vladimir");
         * g.setForca(80);
         * g.setAgilidade(30);
         * g.carisma = 0;
         * g.destreza = 50;
         * g.inteligencia = -3;
         * g.estamina = 90;
         * g.resistencia = 80;
         * g.sorte = 10;
         * g.vida = 100;
         * g.mana = 63;
         */

        Mago m = new Mago("Agostinho Carrara", 0, 90, 0, 95, 0,
                50, 40, 45, 85, 100);
        // Objeto mago
        /*
         * m.nome = "Agostinho Carrara";
         * m.mana = 100;
         * m.vida = 40;
         * m.destreza = 90;
         * m.resistencia = 50;
         * m.sorte = 85;
         * m.inteligencia = 95;
         * m.estamina = 45;
         */

        Arqueiro a = new Arqueiro("Jhoson", 0, 90, 0, 60, 0,
                30, 75, 0, 5, 60);
        a.setCarisma(20);
        // Objeto br.edu.iftm.rpgjava.classes.Arqueiro
        /*
         * a.nome = "Jhoson";
         * a.destreza = 90;
         * a.resistencia = 30;
         * a.estamina = 45;
         * a.sorte = 5;
         * a.vida = 75;
         * a.inteligencia = 60;
         * a.mana = 60;
         */

        // int valorAtaque = g.atacar(6);

        Random dado = new Random();

        int round = 1;
        while (g.getVida() > 0 && m.getVida() > 0) {
            System.out.println("Round: " + round);
            System.out.println("Oponente 1: " + g.getNome());
            System.out.println("Oponente 2: " + m.getNome());

            // turno do mago (m)
            int valorDado = dado.nextInt(6);
            System.out.println("Valor do dado: " + valorDado);
            int valorAtaque = m.atacar(valorDado, g.getResistencia());
            g.defender(valorAtaque);

            // turno do guerreiro (g)
            valorDado = dado.nextInt(6);
            System.out.println("Valor do dado: " + valorDado);
            valorAtaque = g.atacar(valorDado, m.getResistencia());
            m.defender(valorAtaque);
            // round = round +1
            round++;
        }
        if (m.getVida() <= 0) {
            System.out.println("Gerreiro " + g.getNome() + " foi campeão!!!");
        } else if (g.getVida() <= 0) {
            System.out.println("O mago " + m.getNome() + " foi campeão!!!");
        }
    }
}