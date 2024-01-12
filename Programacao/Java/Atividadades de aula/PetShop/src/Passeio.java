public class Passeio {
    public static void main(String[] args) {
        Caminhada caminhada = new Caminhada();

        Cachorro dog = new Cachorro();
        dog.nome = "Haru";
        dog.raca = "Vira-lata";
        dog.sexo = 'M';

        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Isabela";
        pessoa.cachorro = dog;

        caminhada.andar(pessoa);

    }
}
