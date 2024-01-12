import java.util.Scanner;

public class Exercício4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Velocidade em km/h: ");
        float k = entrada.nextFloat();

        float m = k / 36;

        System.out.println(m);

        entrada.close();
    }
}