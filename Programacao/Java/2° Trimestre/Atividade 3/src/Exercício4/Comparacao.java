package Exercício4;

import java.util.Scanner;

public class Comparacao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        boolean funcionando = true;

        do {
            System.out.println("Digite dois números: ");
            int x = entrada.nextInt();
            int y = entrada.nextInt();

            String sentido = "";

            if (x > y) {
                sentido = "DECRESCENTE!";
            } else if (x < y) {
                sentido = "CRESCENTE!";
            } else if (x == y) {
                sentido = "IGUAIS!";
            }

            System.out.println(sentido);
        } while (funcionando);

        entrada.close();
    }
}
