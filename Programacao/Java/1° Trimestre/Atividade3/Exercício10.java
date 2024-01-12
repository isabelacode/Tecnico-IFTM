import java.util.Scanner;

public class Exercício10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite 1 para efetuar uma média geométrica");
        System.out.println("Digite 2 para efetuar uma média poderada");
        System.out.println("Digite 3 para efetuar uma média aritmética\n");

        System.out.print("Digite o número escolhido: ");
        int comando = entrada.nextInt();

        System.out.print("Digite o primeiro número: ");
        int x = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        int y = entrada.nextInt();

        System.out.print("Digite o terceiro número: ");
        int z = entrada.nextInt();

        switch (comando) {
            case 1:
                System.out.println("O resultado desta média geométrica é: " + (x * y * z));
                break;

            case 2:
                System.out.println("O resultado desta média ponderada é: " + ((x + 2 * y + 3 * z) / 6));
                break;

            case 3:
                System.out.println("O resultado desta média aritmética é: " + ((x + y + z) / 3));
                break;
            default:
                System.out.println("Opação invalida");
        }
        entrada.close();
    }
}