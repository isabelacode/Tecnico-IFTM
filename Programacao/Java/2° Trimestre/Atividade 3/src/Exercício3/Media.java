package Exercício3;

public class Media {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.informacoes("primeira");

        Pessoa p2 = new Pessoa();
        p2.informacoes("segunda");

        float media = (p1.getIdade() + p2.getIdade()) / 2;

        System.out.println("A idade média de " + p1.getNome() + " e " + p2.getNome() + " é de " + media + " anos.");

    }

}
