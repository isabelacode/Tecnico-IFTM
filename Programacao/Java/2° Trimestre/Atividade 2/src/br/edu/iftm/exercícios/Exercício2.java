package br.edu.iftm.exercícios;

import java.util.Scanner;

public class Exercício2 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = ent.nextInt();
        if (num >= 0 && num <= 100) {
            if (num % 2 == 0) {
                System.out.println("Número par");
            } else if (num % 2 != 0) {
                System.out.println("Número ímpar");
            }
        } else {
            System.out.println("Número inválido");
        }
        ent.close();
    }
}
