package testes;

import erros.ControleRemoto;
import erros.ControleRemotoException;

public class ControleRemotoErroTeste {

    public static void main(String[] args) {

        ControleRemoto controle = new ControleRemoto();

        try {
            controle.ligar();
            controle.aumentarVolume();
            controle.aumentarVolume();
            controle.aumentarVolume();
            controle.diminuirVolume();
            controle.diminuirVolume();
            controle.ativarMudo();
            controle.desligarMudo();
            controle.desligar();
            controle.desligar();
            // controle.desligar();
        } catch (ControleRemotoException e) {
            System.out.print("Erro no ");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("mensagem após o tratamento de erro");
    }

}
