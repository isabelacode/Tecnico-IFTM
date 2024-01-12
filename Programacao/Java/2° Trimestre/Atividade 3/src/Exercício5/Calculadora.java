package Exercício5;

public class Calculadora {
    private int valor;

    public Calculadora() {
    }

    public Calculadora(int valor) {
        this.valor = valor;
    }

    public void tabuada() {
        for (int i = 1; i <= 10; i++) {
            int resultado = this.valor * i;

            System.out.println(this.valor + " x " + i + " = " + resultado);
        }
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

}
