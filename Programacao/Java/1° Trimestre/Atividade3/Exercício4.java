import java.util.Scanner;

public class Exercício4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o salário: ");
        float salario = entrada.nextFloat();

        System.out.print("Digite o valor do emprestimo: ");
        float emprestimo = entrada.nextFloat();

        float porcentagem = salario * 0.2f;

        if (emprestimo <= porcentagem) {
            System.out.println("Empréstimo concedido. ");
        } else {
            System.out.println("Empréstimo não concedido. ");
        }

        entrada.close();
    }
}