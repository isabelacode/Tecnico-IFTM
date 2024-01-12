package Exercício2;

import java.util.Scanner;

public class Lojinha {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Preço unitário do produto: ");
        float preco = entrada.nextFloat();

        System.out.println("Quantidade comprada: ");
        float qt = entrada.nextFloat();

        System.out.println("Dinheiro recebido: ");
        float dinheiro = entrada.nextFloat();

        Lojinha.troco(preco, qt, dinheiro);

        entrada.close();
    }

    public static void troco(float preco, float qt, float dinheiro) {
        float total = qt * preco;
        float troco = dinheiro - total;
        System.out.println("TROCO = " + troco);
    }
}
