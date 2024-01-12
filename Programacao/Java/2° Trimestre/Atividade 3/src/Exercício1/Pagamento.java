package Exercício1;

import java.util.Scanner;

public class Pagamento {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Funcionario f = new Funcionario();

        System.out.println("Nome: ");
        String nome = entrada.nextLine();
        f.setNome(nome);

        System.out.println("Valor por hora: ");
        float valor = entrada.nextFloat();
        f.setValor(valor);

        System.out.println("Horas trabalhadas: ");
        int horasTrab = entrada.nextInt();
        f.pagamento(horasTrab);

        entrada.close();
    }
}
