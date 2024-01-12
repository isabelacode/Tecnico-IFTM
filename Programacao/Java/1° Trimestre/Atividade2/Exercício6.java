import java.util.Scanner;

public class Exercício6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Graus em Celsius: ");
        float c = entrada.nextFloat();

        float f = c * 9 / 5 + 32;
        System.out.println(c + "°C = " + f + "°F");

        entrada.close();
    }
}