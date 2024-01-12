public class Paciente {
    double peso;
    double altura;

    IMC calculaIMC() {
        IMC imc = new IMC();

        double indice = peso / (altura * altura);
        imc.indice = indice;

        if (indice < 18.5) {
            imc.abaixoDoPeso = true;
        } else if (indice < 25) {
            imc.pesoIdeal = true;
        } else if (indice > 25) {
            imc.obeso = true;

            if (indice < 30) {
                imc.grauObesidade = "Acima do peso";
            } else if (indice < 35) {
                imc.grauObesidade = "Obesidade Grau I";
            } else if (indice < 40) {
                imc.grauObesidade = "Obsesidade Grau II";
            } else {
                imc.grauObesidade = "Obsesidade Grau III";
            }
        }
        return imc;
    }

    double calculaIndiceMassaCorporal() {
        double indice = peso / (altura * altura);

        if (indice < 18.5) {
            System.out.println("Você está abaixo do peso.");
        } else if (indice < 25) {
            System.out.println("Você está no peso ideal.");
        } else if (indice > 25) {
            System.out.println("Você está obeso");

            if (indice < 30) {
                System.out.println("Acima do peso");
            } else if (indice < 35) {
                System.out.println("Obesidade Grau I");
            } else if (indice < 40) {
                System.out.println("Obsesidade Grau II");
            } else {
                System.out.println("Obsesidade Grau III");
            }
        }
        return indice;
    }

}
