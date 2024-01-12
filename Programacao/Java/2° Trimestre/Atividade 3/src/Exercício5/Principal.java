package Exercício5;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Calculadora c = new Calculadora();

        System.out.print("Deseja a tabuada para qual valor? ");
        int valor = entrada.nextInt();
        c.setValor(valor);
        c.tabuada();

        entrada.close();
    }
}
