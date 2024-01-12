package Exercício8;

import java.util.Scanner;

public class Empregado {
    Scanner entrada = new Scanner(System.in);

    private String nome;
    private double salarioBruto;
    private double imposto;

    public Empregado() {
    }

    public Empregado(String nome, double salarioBruto, double imposto) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.imposto = imposto;
    }

    public double buscasSalarioLiquido() {
        double salarioLiquido = this.salarioBruto - this.imposto;
        System.out.println("Funcionário: " + this.nome + " salario liquido: " + salarioLiquido);
        return salarioLiquido;
    }

    public void aumentarSalario(double porcentagem) {

        double aumento = this.salarioBruto * (porcentagem / 100);
        this.salarioBruto = salarioBruto + aumento;
        double salarioLiquido = this.salarioBruto - this.imposto;

        System.out.println("Dados atualizados: " + this.nome + ", " + salarioLiquido);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

}
