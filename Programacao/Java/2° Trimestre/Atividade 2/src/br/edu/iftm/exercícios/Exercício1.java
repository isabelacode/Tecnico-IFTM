package br.edu.iftm.exercícios;

import java.util.Scanner;

public class Exercício1 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = ent.nextInt();

        if (num >= 0 && num <= 500) {
            if (num >= 100 && num <= 200) {
                System.out.println("“Você digitou um número entre 100 e 200”");
            } else {
                System.out.println("“Você digitou um número fora da faixa”");
            }
        } else {
            System.out.println("Você digitou um número fora da faixa");
        }
        ent.close();
    }
}