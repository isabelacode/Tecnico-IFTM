public class Kelvin {
    float valor;

    Celsius kPc() {
        Celsius converter = new Celsius();

        double conversao = valor - 273;
        System.out.println(valor + "°K = " + conversao + "°C.");

        return converter;
    }

    Fahrenheit kPf() {
        Fahrenheit converter = new Fahrenheit();

        double conversao = (valor - 273) * 1.8f + 32;
        System.out.println(valor + "°K = " + conversao + "°F.");

        return converter;
    }
}