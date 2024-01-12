public class Principal {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();

        Proprietario dono = new Proprietario();

        dono.nome = "João da Silva";
        dono.cpf = "123.123.123.12";
        dono.logradouro = "rua 20, numero 123";
        dono.bairro = "flores";
        dono.cidade = "Ituiutaba";

        meuCarro.fabricante = "Lamborghni";
        meuCarro.modelo = "Aventador";
        meuCarro.cor = "Amarelo";
        meuCarro.anoFab = 2009;
        meuCarro.valorDeMercado = 10000f;
        meuCarro.flex = true;
        meuCarro.tipoDeCombustivel = "Alcool/gasolina";
        meuCarro.dono = dono;
        meuCarro.ligar();
        meuCarro.aleraModeloEcor("Fusca", "Azul");
        float valor = meuCarro.retormaValorMercado();
        System.out.println("valor do carro: " + valor);

        System.out.println("Meu carro");
        System.out.println("-------------------------------------------");
        System.out.println("Modelo: " + meuCarro.modelo);
        System.out.println("Cor:" + meuCarro.cor);
        System.out.println("Ano: " + meuCarro.anoFab);
        System.out.println();

        Carro seuCarro = new Carro();

        seuCarro.fabricante = "Honda";
        seuCarro.modelo = "Civic";
        seuCarro.anoFab = 2009;
        seuCarro.cor = "Preto";
        seuCarro.flex = false;
        seuCarro.tipoDeCombustivel = "gasolina";
        // seuCarro.dono = dono;
        seuCarro.recebeProprietario(dono);

        System.out.println("Seu carro");
        System.out.println("-------------------------------------------");
        System.out.println("Modelo: " + seuCarro.modelo);
        System.out.println("Ano: " + seuCarro.anoFab);
        System.out.println("Cor:" + seuCarro.cor);

    }
}