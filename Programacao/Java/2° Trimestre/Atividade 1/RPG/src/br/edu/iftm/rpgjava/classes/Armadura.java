package br.edu.iftm.rpgjava.classes;

public class Armadura {

    // atributos da classe
    private String nome;
    private int peso;
    private int defesa;
    private int durabilidade;

    // metodo construtor
    public Armadura() {
    }

    public Armadura(String nome, int peso, int defesa, int durabilidade) {
        this.nome = nome;
        this.peso = peso;
        this.defesa = defesa;
        this.durabilidade = durabilidade;
    }

    // metodos da classe
    public int calculaDefesa(int defesaPersonagem) {
        return defesa + defesaPersonagem;
    }

    public int modificadorAgilidade() {
        if (peso > 5) {
            return -5;
        } else if (peso > 5 && peso <= 15) {
            return -10;
        } else if (peso < 20) {
            return -15;
        } else if (peso >= 20) {
            return -20;
        }
        return 0;
    }

    public void diminuiDurabilidade(int danoCausado) {
        // this.durabilidade = this.durabilidade - dano;
        this.durabilidade -= danoCausado;
    }

    public boolean temDurabilidade() {
        if (durabilidade > 0) {
            return true;
        } else {
            return false;
        }
    }

    // metodos getter e setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getDurabilidade() {
        return durabilidade;
    }

    public void setDurabilidade(int durabilidade) {
        this.durabilidade = durabilidade;
    }
}