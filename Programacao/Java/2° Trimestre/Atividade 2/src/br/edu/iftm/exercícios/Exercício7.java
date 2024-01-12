package br.edu.iftm.exercícios;

import java.util.Scanner;

public class Exercício7 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        System.out.println("Digite a quantidade de numero a ser digitado:");
        int tam = ent.nextInt();

        int[] vetor = new int[tam];

        float media = 0.0f;
        int contadorM = 0;
        int soma = 0;
        int numero = 0;

        for (int i = 0; i < tam; i++) {
            do {
                System.out.println("Digite num numero inteiro e positivo");
                numero = ent.nextInt();

                if (numero < 0) {
                    System.out.println("Numero digitado é negativo! Digite um numero positivo");
                }
            } while (numero < 0);

            if (numero >= 0) {
                vetor[i] = numero;
                if (vetor[i] % 3 == 0) {
                    soma = soma + vetor[i];

                    contadorM = contadorM + 1;
                }
            }
        }
        media = ((float) soma) / contadorM;
        System.out.println("O valor da média é: " + media);
        ent.close();
    }
}
