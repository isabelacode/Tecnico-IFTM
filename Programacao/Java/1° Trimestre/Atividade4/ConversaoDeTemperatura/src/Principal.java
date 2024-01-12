public class Principal {
    public static void main(String[] args) {
        Celsius c = new Celsius();

        c.valor = 37;

        c.cPk();
        c.cPf();

        Kelvin k = new Kelvin();

        k.valor = 310;

        k.kPc();
        k.kPf();

        Fahrenheit f = new Fahrenheit();

        f.valor = 98.6f;

        f.fPc();
        f.fPk();

    }
}