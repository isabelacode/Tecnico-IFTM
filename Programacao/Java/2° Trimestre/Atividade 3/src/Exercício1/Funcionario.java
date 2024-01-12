package Exercício1;

public class Funcionario {
    private String nome;
    private float valor;

    public Funcionario() {
    }

    public Funcionario(String nome, float valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public void pagamento(int horasTrab) {
        float total = valor * horasTrab;
        System.out.println("O pagamento para " + this.nome + " deve ser " + total);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

}
