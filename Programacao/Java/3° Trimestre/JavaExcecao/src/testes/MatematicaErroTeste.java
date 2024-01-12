package testes;

import erros.Matematica;

public class MatematicaErroTeste {

    public static void main(String[] args) {
        Matematica m = new Matematica();
        System.out.println("Mensagem antes do erro");
        try {
            m.divisao(15, 3);
        } catch (Exception e) {
            System.out.println("Houve um Erro: ");
            e.printStackTrace();
        }
        System.out.println("Mensagem após o erro.");
    }

}
