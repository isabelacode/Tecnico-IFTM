package Exercício7;

import java.util.Scanner;

public class Medidor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a medida da glicose: ");
        float medida = entrada.nextFloat();

        Medidor.classificação(medida);

        entrada.close();
    }

    public static void classificação(float medida) {
        String classificacao = "";

        if (medida <= 100) {
            classificacao = "normal";
        } else if (medida > 100 && medida <= 140) {
            classificacao = "elevado";
        } else if (medida > 140) {
            classificacao = "diabetes";
        }

        System.out.println("Classificação: " + classificacao);
    }
}
