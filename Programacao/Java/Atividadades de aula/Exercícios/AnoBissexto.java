import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ano: ");
        int ano = entrada.nextInt();

        float conta1 = (ano % 400);
        float conta2 = (ano % 4);
        float conta3 = (ano % 100);

        if (conta1 == 0) {
            System.out.println("Este ano é bissexto.");
        } else if (conta2 == 0) {
            System.out.println("Este ano é bissexto.");
        } else if (conta3 == 0) {
            System.out.println("Esse ano não é bissexto.");
        } else {
            System.out.println("Esse ano não é bissexto.");
        }
        entrada.close();

    }
}