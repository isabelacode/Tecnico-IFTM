public class Exercício7 {
    public static void main(String[] args) {
        float premio = 730000;
        float ganhador1 = 7300 * 46;
        float ganhador2 = 7300 * 36;
        float ganhador3 = (premio - ganhador1) - ganhador2;
        System.out.println("O primeiro ganhador vai receber: " +
                ganhador1 + "\nO segundo ganhador vai receber: "
                + ganhador2 + "\nO terceiro ganhador vai receber: " + ganhador3);
    }
}