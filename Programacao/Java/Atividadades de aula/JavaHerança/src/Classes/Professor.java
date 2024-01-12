package Classes;

public class Professor extends Pessoa {

    private String especialidade;
    private double salario;

    public Professor(String nome, int idade, String string, String especialidade, double salario) {
        super(nome, idade, salario);
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public void receberAumento() {
        this.salario = this.salario + this.salario * 0.1;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
