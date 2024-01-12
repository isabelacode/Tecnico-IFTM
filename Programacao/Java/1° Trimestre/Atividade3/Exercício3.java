import java.util.Scanner;

public class Exercício3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = entrada.nextInt();

        System.out.print("Digite segundo número: ");
        int num2 = entrada.nextInt();

        if (num1 < num2) {
            System.out.println("O maior número é " + num2);
        } else if (num1 > num2) {
            System.out.println("O maior número é " + num1);
        } else if (num1 == num2) {
            System.out.println("Eles são iguais");
        }

        entrada.close();
    }

}