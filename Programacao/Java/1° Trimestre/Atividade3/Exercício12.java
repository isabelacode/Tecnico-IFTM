import java.util.Scanner;

public class Exercício12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o número de um dia da semana: ");
        int semana = entrada.nextInt();

        String dia;

        switch (semana) {
            case 1:
                dia = "Domingo";
                System.out.println(dia);
                break;
            case 2:
                dia = "Segunda";
                System.out.println(dia);
                break;
            case 3:
                dia = "Terça";
                System.out.println(dia);
                break;
            case 4:
                dia = "Quarta";
                System.out.println(dia);
                break;
            case 5:
                dia = "Quinta";
                System.out.println(dia);
                break;
            case 6:
                dia = "Sexta";
                System.out.println(dia);
                break;
            case 7:
                dia = "Sábado";
                System.out.println(dia);
                break;

        }

        entrada.close();
    }
}