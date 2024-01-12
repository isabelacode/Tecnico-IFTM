public class Fahrenheit {
    float valor;

    Celsius fPc() {
        Celsius converter = new Celsius();

        double conversao = (valor - 32) / 1.8f;
        System.out.println(valor + "°F = " + conversao + "°C.");

        return converter;
    }

    Kelvin fPk() {
        Kelvin converter = new Kelvin();

        double conversao = (valor - 32) * 5 / 9 + 273;
        System.out.println(valor + "°F = " + conversao + "°K.");

        return converter;
    }
}