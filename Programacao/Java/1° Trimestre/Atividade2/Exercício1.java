import java.util.Scanner;

public class Exercício1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = entrada.nextInt();

        int antecessor = num - 1;
        int sucessor = num + 1;

        System.out.println("O antecessor deste número é " + antecessor + ", e o sucessor é " + sucessor);

        entrada.close();
    }
}