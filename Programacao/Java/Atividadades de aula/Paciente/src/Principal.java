public class Principal {
    public static void main(String[] args) {
        Paciente p = new Paciente();

        p.altura = 1.72;
        p.peso = 54;

        p.calculaIndiceMassaCorporal();

        /// double imc = p.calculaIndiceMassaCorporal();
        // System.out.println("O valor de IMC é: " + imc + ".");
        IMC imc = p.calculaIMC();
        System.out.println(imc);

    }

}
