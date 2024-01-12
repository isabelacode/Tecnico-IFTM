import java.util.Scanner;

public class Exercício7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        float valor = entrada.nextFloat();

        System.out.print("Digite a sigla do estado de destino: ");
        String estado = entrada.next();

        float imposto;
        float total;

        switch (estado) {
            case "MG":
                imposto = valor * 0.07f;
                total = valor + imposto;
                System.out.println("O valor do produto vai ser: " + total);
                break;

            case "SP":
                imposto = valor * 0.12f;
                total = valor + imposto;
                System.out.println("O valor do produto vai ser: " + total);
                break;

            case "RJ":
                imposto = valor * 0.15f;
                total = valor + imposto;
                System.out.println("O valor do produto vai ser: " + total);
                break;

            case "MS":
                imposto = valor * 0.08f;
                total = valor + imposto;
                System.out.println("O valor final do produto é: " + total);
                break;
        }

        entrada.close();
    }
}