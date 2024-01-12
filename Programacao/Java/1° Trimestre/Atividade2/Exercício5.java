import java.util.Scanner;

public class Exercício5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Dolar: ");
        float dolar = entrada.nextFloat();

        float reais = dolar * 5.08f;

        System.out.println(dolar + " dólares = " + reais + " reais.");

        entrada.close();
    }
}
