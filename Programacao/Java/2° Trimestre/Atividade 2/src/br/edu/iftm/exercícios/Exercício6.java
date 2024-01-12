package br.edu.iftm.exercícios;

import java.util.Scanner;

public class Exercício6 {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        for (int i = 0; i <= 10; i++) {

            System.out.println("Digite um número: ");
            int num = ent.nextInt();

            double raiz = Math.sqrt(num);

            System.out.println("A raiz quadrada deste número é " + raiz);
        }
        ent.close();
    }
}
