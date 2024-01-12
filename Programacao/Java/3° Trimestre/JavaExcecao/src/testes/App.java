package testes;

public class App {
    public static void main(String[] args) throws Exception {
        // int[] vetor = null;
        int[] numeros = new int[] { 1, 2, 3, 4 };
        int[] pesos = new int[] { 5, 0, 4 };
        System.out.println("Execucao antes do erro");
        try {
            for (int i = 0; i < numeros.length; i++) {
                // System.out.println(numeros[i]);
                int resultado = numeros[i] / pesos[i];
                System.out.printf(" %d / %d = %d\n", numeros[i], pesos[i], resultado);
            }
        } catch (ArithmeticException e) {
            System.out.println("Houve um erro de caculo");
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Houve um erro: acesso a posicao inexistente do vetor");
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("houve um erro: valor nulo foi encontrado");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Excecao depois do erro");
    }
}
