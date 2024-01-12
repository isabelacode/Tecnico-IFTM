package Classes;

public class Funcionario extends Pessoa {
    protected String setor;
    protected String trabalhando;

    public Funcionario(String nome, int idade, char sexo, String setor, String trabalhando) {
        super(nome, idade, sexo);
        this.setor = setor;
        this.trabalhando = trabalhando;
    }

    public void mudarTrabalho(String novoTrabalho) {
        trabalhando = novoTrabalho;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(String trabalhando) {
        this.trabalhando = trabalhando;
    }

}
