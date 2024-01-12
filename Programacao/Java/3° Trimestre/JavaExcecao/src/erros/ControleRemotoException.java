package erros;

public class ControleRemotoException extends Exception {

    public ControleRemotoException(String mensagem) {
        super("Controle Remoto: " + mensagem);
    }

}
