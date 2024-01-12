package Exercício6;

import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a senha: ");
        int senhaUser = entrada.nextInt();
        int senha = 2002;

        while (senhaUser != senha) {
            System.out.print("Senha Inválida! Tente Novamente: ");
            senhaUser = entrada.nextInt();
        }
        if (senhaUser == senha) {
            System.out.print("Acesso permitido!");
        }
        entrada.close();
    }
}
