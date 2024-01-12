package Exercício10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotelPet {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        List<Animal> lista = new ArrayList<Animal>();
        int opcao = 0;
        String tipo = "";

        do {
            opcao = HotelPet.menu(entrada);
            String nome = "";

            switch (opcao) {
                case 1:
                    HotelPet.checkin(tipo, entrada, lista);
                    break;
                case 2:
                    HotelPet.checkout(nome, entrada, lista);
                    break;
                case 0:
                    System.out.println("Até a proxima!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente outra vez");
                    break;
            }
        } while (opcao != 0);
        entrada.close();
    }

    public static int menu(Scanner entrada) {

        System.out.println("---------------------- Menu ----------------------");
        System.out.println("0 - Sair");
        System.out.println("1 - Para check-in do pet");
        System.out.println("2 - Para check-out do pet");

        System.out.println("Escolha uma opção: ");
        int opcao = entrada.nextInt();
        entrada.nextLine();
        return opcao;
    }

    public static void checkin(String tipo, Scanner entrada, List<Animal> lista) {
        System.out.print("Qual é a especíe? ");
        tipo = entrada.nextLine();
        switch (tipo) {
            case "gato":
            case "Gato":
                System.out.println("Nome do gato(a): ");
                String nome = entrada.nextLine();
                Gato g = new Gato(nome);
                g.mia();
                lista.add(g);
                break;
            case "cachorro":
            case "Cachorro":
                System.out.println("Nome do cachorro(a): ");
                nome = entrada.nextLine();
                Cachorro c = new Cachorro(nome);
                c.late();
                lista.add(c);
                break;
            default:
                System.out.println("Não aceitamos esse animal.");
        }
    }

    public static void checkout(String nome, Scanner entrada, List<Animal> lista) {
        System.out.println("Digite o nome do animal: ");
        nome = entrada.nextLine();
        for (Animal animal : lista) {
            if (nome.equals(animal.getNome())) {
                System.out.println("Até mais " + nome + ", volte sempre!");
                lista.remove(animal);
            } else {
                System.out.println("Pet não encontrado.");
            }
        }
    }
}
