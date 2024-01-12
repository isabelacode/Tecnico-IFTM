public class PetShop {
    public static void main(String[] args) {

        Cachorro seuDog = new Cachorro();

        seuDog.nome = "Jade";
        seuDog.raca = "Shih-tzu";
        seuDog.sexo = 'F';
        seuDog.idade = 2;

        System.out.println("Seu Dog");
        System.out.println("-------------------------------------------");
        System.out.println("Nome: " + seuDog.nome);
        System.out.println("Raça:" + seuDog.raca);
        System.out.println("Sexo:" + seuDog.sexo);
        System.out.println("Idade:" + seuDog.idade);
        System.out.println();

        Cachorro meuDog = new Cachorro();

        meuDog.nome = "Cisco";
        meuDog.raca = "Vira-lata";
        meuDog.sexo = 'F';
        meuDog.idade = 5;

        System.out.println("Meu Dog");
        System.out.println("-------------------------------------------");
        System.out.println("Nome: " + meuDog.nome);
        System.out.println("Raça:" + meuDog.raca);
        System.out.println("Sexo:" + meuDog.sexo);
        System.out.println("Idade:" + meuDog.idade);
        System.out.println();

        Gato meuGato = new Gato();

        meuGato.nome = "Pisquila";
        meuGato.raça = "Vira-lata";
        meuGato.sexo = 'M';
        meuGato.idade = 2;

        System.out.println("Meu Cat");
        System.out.println("-------------------------------------------");
        System.out.println("Nome: " + meuGato.nome);
        System.out.println("Raça:" + meuGato.raça);
        System.out.println("Sexo:" + meuGato.sexo);
        System.out.println("Idade:" + meuGato.idade);
        System.out.println();

    }

}