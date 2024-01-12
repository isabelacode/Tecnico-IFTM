import Classes.Aluno;
import Classes.Pedagoga;
import Classes.Professor;

public class Principal {
    public static void main(String[] args) {
        Aluno a = new Aluno("Pedro", 17, 'M', "123456", "Tecnico em informática");

        Professor p = new Professor("André", 36, "M", "Programação", 1000000);

        Pedagoga pe = new Pedagoga("Maria", 25, 'F', "Setor Pedagico", "Tecnico em informática");

        a.fazerAniversario();
        p.fazerAniversario();
        System.out.println("Salario do professor e de: " + p.getSalario());
        p.receberAumento();
        System.out.println("Salario do professor e de: " + p.getSalario());
        pe.fazerAniversario();
        pe.mudarTrabalho("Tecnico em química");
    }
}
