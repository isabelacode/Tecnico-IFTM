import java.util.Scanner;

public class Exercício2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = entrada.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num3 = entrada.nextInt();

        int soma = num1 + num2 + num3;
        System.out.println("A soma destes números é igual a " + soma);

        entrada.close();
    }
}