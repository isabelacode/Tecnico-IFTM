import java.util.Scanner;

public class Exercício11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite  o número do mês: ");
        int nmes = entrada.nextInt();

        String mes;

        switch (nmes) {
            case 1:
                mes = "Janeiro";
                System.out.println(mes);
                break;
            case 2:
                mes = "Fevereiro";
                System.out.println(mes);
                break;
            case 3:
                mes = "Março";
                System.out.println(mes);
                break;
            case 4:
                mes = "Abril";
                System.out.println(mes);
                break;
            case 5:
                mes = "Maio";
                System.out.println(mes);
                break;
            case 6:
                mes = "Junho";
                System.out.println(mes);
                break;
            case 7:
                mes = "Julho";
                System.out.println(mes);
                break;
            case 8:
                mes = "Agosto";
                System.out.println(mes);
                break;
            case 9:
                mes = "Setembro";
                System.out.println(mes);
                break;
            case 10:
                mes = "Outubro";
                System.out.println(mes);
                break;
            case 11:
                mes = "Novembro";
                System.out.println(mes);
                break;
            case 12:
                mes = "Dezembro";
                System.out.println(mes);
                break;

        }

        entrada.close();
    }
}