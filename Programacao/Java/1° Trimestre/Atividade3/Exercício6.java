import java.util.Scanner;

public class Exercício6 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Digite a sua altura em metros: ");

    float h = entrada.nextFloat();

    System.out.print("Qual é o seu sexo? F/M: ");
    char sexo = entrada.next().charAt(0);

    float pesoIdeal;

    switch (sexo) {
      case 'F':
      case 'f':
        pesoIdeal = (62.1f * h) - 44.7f;
        System.out.println("Seu peso ideal é: " + pesoIdeal + " kg.");
        break;

      case 'M':
      case 'm':
        pesoIdeal = (72.2f * h) - 58;
        System.out.println("Seu peso ideal é: " + pesoIdeal + " kg.");
        break;
    }

    entrada.close();
  }
}