import java.util.Scanner;

public class Exercício14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        int a = entrada.nextInt();

        System.out.print("Digite o valor de b: ");
        int b = entrada.nextInt();

        System.out.print("Digite o valor de c: ");
        int c = entrada.nextInt();

        int delta = (b * b) - 4 * a * c;

        double raiz;

        raiz = Math.sqrt(b);

        if (delta < 0) {
            System.out.println("Não possui raiz");

        } else if (delta == 0) {
            double resultado = (-b + raiz) / (2 * a);
            System.out.println("As raizes são iguais");
            System.out.println("x1 e x2 = " + resultado);

        } else if (delta > 0) {
            double resultado1 = (-b + raiz) / (2 * a);
            double resultado2 = (-b - raiz) / (2 * a);

            System.out.println("x1 = " + resultado1);
            System.out.println("x2 = " + resultado2);
        }

        entrada.close();
    }
}