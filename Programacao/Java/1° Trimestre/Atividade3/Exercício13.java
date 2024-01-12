import java.util.Scanner;

public class Exercício13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o número: ");

        int num = entrada.nextInt();

        int div3 = num % 3;
        int div5 = num % 5;

        if (div5 == 0 && !(div3 == 0)) {
            System.out.println("Este número é divisível somente por 5.");
        } else if (div3 == 0 && !(div5 == 0)) {
            System.out.println("Este número é divisível por 3.");
        } else {
            System.out.println("Esta ação não pode ser efetuado");
        }

        entrada.close();
    }
}