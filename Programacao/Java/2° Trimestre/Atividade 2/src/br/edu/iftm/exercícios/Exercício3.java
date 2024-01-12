package br.edu.iftm.exercícios;

import java.util.Scanner;

public class Exercício3 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = ent.nextInt();

        int f = 1;
        for (int i = 1; i <= num; i++) {
            f = f * i;
        }

        System.out.println(num + "! = " + f);

        ent.close();
    }

}