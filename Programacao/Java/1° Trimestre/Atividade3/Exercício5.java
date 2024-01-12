import java.util.Scanner;

public class Exercício5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = entrada.nextInt();

        if (num > 0) {
            System.out.println("O quadrado deste número é: " + (num * num));
            System.out.println("A raiz cubica deste número é: " + Math.cbrt(num));
        } else {
            System.out.println("Este número é negativo");
        }

        entrada.close();
    }
}