import java.util.Scanner;

public class Exercício9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a sua altura(em metros): ");
        float h = entrada.nextFloat();

        System.out.print("Digite o seu peso: ");
        float p = entrada.nextFloat();

        if (h <= 1.20f) {
            if (p < 60) {
                System.out.println("A");
            } else if (p >= 60 && p <= 90) {
                System.out.println("D");
            } else if (p > 90) {
                System.out.println("G");
            }
        } else if (h > 1.20f && h <= 1.70f) {
            if (p < 60) {
                System.out.println("B");
            } else if (p >= 60 && p <= 90) {
                System.out.println("E");
            } else if (p > 90) {
                System.out.println("H");
            }
        } else if (h > 1.70) {
            if (p < 60) {
                System.out.println("C");
            } else if (p >= 60 && p <= 90) {
                System.out.println("F");
            } else if (p > 90) {
                System.out.println("I");
            }
        }

        entrada.close();
    }
}