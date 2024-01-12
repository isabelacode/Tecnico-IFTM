import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        //declarar um objeto c da classe Contato,  está instaciado, pq passou o =
        /*int valor = 3;
        Contato c = new Contato();
        //c.codigo = 1
        c.setCodigo(1);
        System.out.println(c.getCodigo());*/

        //PROGRAMA
        int opcao = 0;
        Scanner entrada = new Scanner(System.in);
        //Contato[] vetor = new Contato[10];
        int contador = 0;
        List<Contato> lista = new ArrayList<>();

        do {
            opcao = Principal.menu(entrada);
            int numero = 0;
            String nome = "";
            String email = "";
            String telefone = "";

            switch (opcao) {
                case 0:
                    System.out.println("Até a próxima");
                    break;
                case 1:
                    Principal.adicionarContato(numero, nome, email, telefone, entrada, lista);
                    break;
                case 2:
                    Principal.adicionarContato(numero, nome, email, telefone, entrada, lista);
                    break;
                case 3:
                    Principal.removerContatoPorNome(contador, nome, entrada, lista);
                    break;
                case 4:
                    Principal.EditarContato(contador, nome, numero, email, telefone, entrada, lista);
                    break;  
                    
                case 5:
                    Principal.listarAgenda(lista);
                    break;
                case 6:
                    System.out.println("O número total de contatos são: " + Contato.numeroDeContatos);
                    break;
                default:
                    System.out.println("Opção inválida. Tente outra vez");
                    break;
            }
        } while (opcao != 0);
        entrada.close();//encerra
    }

    public static int menu(Scanner entrada) {

        System.out.println("-----Menu-----");
        System.out.println("1 - Adicionar contato");
        System.out.println("2 - Buscar contato por número");
        System.out.println("3 - Remover contato por número");
        System.out.println("4 - Listar agenda");
        System.out.println("5 - Editar contato");
        System.out.println("6 - Quantidade de contatos da Agenda");
        System.out.println("0 - sair");
        System.out.println("Escolha uma opção: ");
        int opcao = entrada.nextInt();
        entrada.nextLine();
        return opcao;
    }

    public static void adicionarContato(int numero, String nome, String email, String telefone, Scanner entrada,
            List<Contato> lista) {
        System.out.println("Digite um número: ");
        numero = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Digite um nome: ");
        nome = entrada.nextLine();
        System.out.println("Digite um E-mail:");
        email = entrada.nextLine();
        System.out.println("Digite um telefone: ");
        telefone = entrada.nextLine();
        Contato c = new Contato(numero, nome, email, telefone);
        lista.add(c);
        Contato.numeroDeContatos++;
        // vetor[contador] = c;
        // contador = contador + 1;
        // contador++;
    }

    public static void buscarContatoPorNome(int contador, String nome, Scanner entrada, List<Contato> lista) {
        System.out.println("Digite o nome do contato: ");
        nome = entrada.nextLine();
        for (Contato contato : lista) {
            if (nome.equals(contato.getNome())) {
                System.out.println(contato);
                contador++;
            }
        }

        if (contador == 0) {
            System.out.println("Contato inexistente");
        }
    }

    public static void removerContatoPorNome(int contador, String nome, Scanner entrada, List<Contato> lista) {
        System.out.println("Digite o nome do contato: ");
        nome = entrada.nextLine();
        for (Contato contato : lista) {
            if (nome.equals(contato.getNome())) {
                int posicaoLista = lista.indexOf(contato);
                lista.remove(posicaoLista);
                System.out.println("Contato removido com sucesso");
                contador++;
                Contato.numeroDeContatos--;
            }
            if (lista.size() == 0) {
                break;
            }
        }
        if (contador == 0) {
            System.out.println("Contato inexistente");
        }
    }
    


    public static void EditarContato(int contador, String nome, int numero, String email, String telefone,
            Scanner entrada, List<Contato> lista) {
        System.out.println("Digite o nome do contato: ");
        nome = entrada.nextLine();
        for (Contato contato : lista) {
            if (nome.equals(contato.getNome())) {
                int posicaoLista = lista.indexOf(contato);
                System.out.println("Digite um número: ");
                numero = entrada.nextInt();
                entrada.nextLine();
                System.out.println("Digite um nome: ");
                nome = entrada.nextLine();
                System.out.println("Digite um E-mail:");
                email = entrada.nextLine();
                System.out.println("Digite um telefone: ");
                telefone = entrada.nextLine();
                contato = new Contato(numero, nome, email, telefone);
                lista.set(posicaoLista, contato);
                contador++;
                System.out.println("Contato atualizado com sucesso");
            }
        }

        if (contador == 0) {
            System.out.println("Contato inexistente");
        }

    }

    public static void listarAgenda(List<Contato> lista) {
        // for (int i = 0; i < lista.size(); i++) {
        // System.out.println(lista.get(i));
        // }
        for (Contato contato : lista) {
            System.out.println(contato);
        }
    }
}