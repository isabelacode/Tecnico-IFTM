import java.util.Scanner;

public class IncrementoDecremento {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idade = entrada.nextInt();
        System.out.print("Digite o ano futuro: ");
        int ano = entrada.nextInt();

        int aux = ano - 2022;
        int idadeFutura = idade + aux;

        System.out.println("Minha idade em: " + ano + " é " + idadeFutura);

        entrada.close();

    }
}
