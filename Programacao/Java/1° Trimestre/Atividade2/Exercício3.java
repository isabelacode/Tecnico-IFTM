import java.util.Scanner;

public class Exercício3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o ano atual: ");
        int ano = entrada.nextInt();

        System.out.print("Digite a sua idade ou a que você vai fazer este ano: ");
        int idade = entrada.nextInt();

        int ano_nasc = ano - idade;

        System.out.println("O seu ano de nascimento é " + ano_nasc);

        entrada.close();

    }
}