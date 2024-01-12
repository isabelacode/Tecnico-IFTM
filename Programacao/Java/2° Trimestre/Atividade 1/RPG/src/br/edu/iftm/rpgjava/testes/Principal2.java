package br.edu.iftm.rpgjava.testes;

import br.edu.iftm.rpgjava.classes.*;

import java.util.Random;
import java.util.Scanner;

public class Principal2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Armadura armG = new Armadura("Armadura de prata", 12, 4, 20);
        Armadura armA = new Armadura("Armadura Acolchoada", 8, 2, 25);
        Armadura armM = new Armadura("Cota de Talas", 12, 1, 12);

        Arma maG = new Arma("Adaga", 50, 70);
        Arma maA = new Arma("Arco", 58, 90);
        Arma maM = new Arma("Alabarda", 55, 50);

        System.out.println("Vamos criar o Arqueiro");
        System.out.print("Digite o nome do Arqueiro: ");
        String nomea = entrada.next();
        Arqueiro a = new Arqueiro(nomea, 6, 25, 40, 20, 5, 10, 50, 20, 10, 0);
        a.setArmadura(armA);
        a.setArma(maA);

        System.out.println("Vamos criar o Guerreiro");
        System.out.print("Digite o nome do Guerreiro: ");
        String nomeg = entrada.next();
        Guerreiro g = new Guerreiro(nomeg, 25, 10, 0, 20, 5, 25, 50, 20, 10, 0);
        g.setArmadura(armG);
        g.setArma(maG);

        System.out.println("Vamos criar o mago");
        System.out.print("Digite o nome do Mago ");
        String nomem = entrada.next();
        Mago m = new Mago(nomem, 25, 20, 25, 45, 0, 40, 50, 10, 25, 45);
        m.setArmadura(armM);
        m.setArma(maM);

        // Lutas:

        int round = 1;
        Random dado = new Random();

        System.out.println(
                "Para facilitar os combates na hora de atacar digite apenas a inicial do personagem, como por exemplo: mago = m");
        while ((g.getVida() > 0 && a.getVida() > 0) || (g.getVida() > 0 && m.getVida() > 0)
                || (a.getVida() > 0 && m.getVida() > 0)) {
            System.out.println("Oponente 1: " + g.getNome());
            System.out.println("Oponente 2: " + a.getNome());
            System.out.println("Oponente 3: " + m.getNome());

            // Primeiro Turno
            System.out.println("\nRound: " + round);
            System.out.println("Primeiro jogardor: Guerreiro");
            System.out.println("Quem deseja atacar? M ou A ");
            char oponente = entrada.next().charAt(0);

            if (oponente == 'a') {

                int valorDado = dado.nextInt(6);
                System.out.println("Valor do dado: " + valorDado);
                int valorAtaque = g.atacar(valorDado, a.getResistencia());
                a.defender(valorAtaque);
                round++;

            } else if (oponente == 'm') {

                int valorDado = dado.nextInt(6);
                System.out.println("Valor do dado: " + valorDado);
                int valorAtaque = g.atacar(valorDado, m.getResistencia());
                m.defender(valorAtaque);
                round++;

            }

            // Segundo turno
            System.out.println("\nRound: " + round);
            System.out.println("Segundo jogardor: Arqueiro");
            System.out.println("Quem deseja atacar? G ou M ");
            oponente = entrada.next().charAt(0);

            if (oponente == 'g') {

                int valorDado = dado.nextInt(6);
                System.out.println("Valor do dado: " + valorDado);
                int valorAtaque = a.atacar(valorDado, g.getResistencia());
                g.defender(valorAtaque);
                round++;

            } else if (oponente == 'm') {

                int valorDado = dado.nextInt(6);
                System.out.println("Valor do dado: " + valorDado);
                int valorAtaque = a.atacar(valorDado, m.getResistencia());
                m.defender(valorAtaque);
                round++;

            }

            // Terceiro turno
            System.out.println("\nRound: " + round);
            System.out.println("Terceiro jogardor: Mago");
            System.out.println("Quem deseja atacar? A ou G ");
            oponente = entrada.next().charAt(0);

            if (oponente == 'a') {

                int valorDado = dado.nextInt(6);
                System.out.println("Valor do dado: " + valorDado);
                int valorAtaque = m.atacar(valorDado, a.getResistencia());
                a.defender(valorAtaque);
                round++;

            } else if (oponente == 'g') {

                int valorDado = dado.nextInt(6);
                System.out.println("Valor do dado: " + valorDado);
                int valorAtaque = m.atacar(valorDado, g.getResistencia());
                g.defender(valorAtaque);
                round++;

            }
            if (m.getVida() <= 0) {
                System.out.println(m.getNome() + " morreu!");
                m = new Mago();
            }
            if (g.getVida() <= 0) {
                System.out.println(g.getNome() + " morreu!");
                g = new Guerreiro();
            }
            if (a.getVida() <= 0) {
                System.out.println(a.getNome() + " morreu!");
                a = new Arqueiro();
            }
            entrada.close();
        }
    }
}