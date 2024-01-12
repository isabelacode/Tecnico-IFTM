public class IMC {

    // metodo
    double indice;
    boolean abaixoDoPeso;
    boolean pesoIdeal;
    boolean obeso;
    String grauObesidade;

    // sobre escrita de metodo
    @Override
    public String toString() {
        return "IMC [abaixoDoPeso=" + abaixoDoPeso + ", grauObesidade=" + grauObesidade + ", indice=" + indice
                + ", obeso=" + obeso + ", pesoIdeal=" + pesoIdeal + "]";
    }

}