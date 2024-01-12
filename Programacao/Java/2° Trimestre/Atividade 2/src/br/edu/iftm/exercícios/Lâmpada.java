package br.edu.iftm.exercícios;

public class Lâmpada {

    private boolean estado = false;

    public Lâmpada() {
    }

    public Lâmpada(boolean estado) {
        this.estado = estado;
    }

    public void ligar() {
        estado = true;
    }

    public void desligar() {
        estado = false;
    }

    public void estado() {
        System.out.println(estado);
    }
}
