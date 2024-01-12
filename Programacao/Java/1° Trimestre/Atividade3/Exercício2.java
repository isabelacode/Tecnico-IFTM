import java.util.Scanner;

public class Exercício2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Comandos:
        System.out.println("Os comandos são:\n Soma = + \n Subtração = -\n multiplicação = *\n divisão = / \n");

        System.out.print("Digite o comando: ");
        char comando = entrada.next().charAt(0);

        System.out.print("Digite um número: ");
        int num1 = entrada.nextInt();

        System.out.print("Digite outro número: ");
        int num2 = entrada.nextInt();

        switch (comando) {
            case '+':
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;

            case '-':
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;

            case '*':
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;

            case '/':
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                break;
            default:
                System.out.println("Operação inválida!");
        }

        entrada.close();
    }
}