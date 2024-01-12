import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int idade = entrada.nextInt();

        String indicacao = (idade >= 18) ? "adulto"
                : "Criança/adolecente";
        System.out.println("Resultado: " + indicacao);

        entrada.close();
    }
}
