public class Carro {
    String fabricante;
    String modelo;
    int anoFab;
    String cor;
    String tipoDeCombustivel;
    boolean flex;
    float valorDeMercado;
    Proprietario dono;

    float retormaValorMercado() {
        return valorDeMercado;
    }

    void recebeProprietario(Proprietario proprietario) {
        proprietario = dono;
    }

    void aleraModeloEcor(String m, String c) {
        if (this.modelo != null) {
            modelo = m;
            cor = c;
        }
    }

    // metodo java em orientaçõ a objeto
    void ligar() {
        System.out.println("Ligando o carro");
    }

}