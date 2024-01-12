import java.util.Scanner;

public class Exercício1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Nome do produto: ");
        String Nome = entrada.next();

        System.out.print("Modelo: ");
        String Modelo = entrada.next();

        System.out.print("Tamanho: ");
        float Tamanho = entrada.nextFloat();

        System.out.print("Preço: ");
        double Preco = entrada.nextDouble();

        System.out.print("Quantidade: ");
        int Quantidade = entrada.nextInt();

        System.out.println(Nome + ";\n" + Modelo + ";\n" + Tamanho + ";\n" + Preco + ";\n" + Quantidade);

        entrada.close();
    }
}