public class Celsius {
    float valor;

    Kelvin cPk() {
        Kelvin converter = new Kelvin();

        double conversao = valor + 273;
        System.out.println(valor + "°C = " + conversao + "°K.");

        return converter;
    }

    Fahrenheit cPf() {
        Fahrenheit converter = new Fahrenheit();

        double conversao = (1.8f * valor) + 32;
        System.out.println(valor + "°C = " + conversao + "°F.");

        return converter;
    }
}