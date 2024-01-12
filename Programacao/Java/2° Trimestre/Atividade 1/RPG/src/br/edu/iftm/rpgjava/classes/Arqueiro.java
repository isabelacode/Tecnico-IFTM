package br.edu.iftm.rpgjava.classes;

public class Arqueiro {

    // atributos da classe
    private String nome;
    private int forca;
    private int destreza;
    private int agilidade;
    private int inteligencia;
    private int carisma;
    private int resistencia;
    private int vida;
    private int estamina;
    private int sorte;
    private int mana;
    private Armadura armadura;
    private Arma arma;

    // metodo construtor
    public Arqueiro() {
    }

    public Arqueiro(String nome, int forca, int destreza, int agilidade, int inteligencia,
            int carisma, int resistencia, int vida, int estamina, int sorte, int mana) {
        this.nome = nome;
        this.forca = forca;
        this.destreza = destreza;
        this.agilidade = agilidade;
        this.inteligencia = inteligencia;
        this.carisma = carisma;
        this.resistencia = resistencia;
        this.vida = vida;
        this.estamina = estamina;
        this.sorte = sorte;
        this.mana = mana;
    }

    // metodos da classe
    public int atacar(int valorDado, int defesaInimigo) {
        int valorAtaque = 0;
        if (valorDado < 2) { // falha critica
            System.out.println("O Ataque falhou!!!");
        } else {
            if (arma != null) {
                valorAtaque = this.arma.calculaAtaque(valorAtaque);
                arma.diminuiDurabilidade(defesaInimigo);
                if (arma.temDurabilidade() == false) {
                    arma = new Arma();
                }
            } else {
                valorAtaque = this.forca + valorDado;
            }
        }
        return valorAtaque;
    }

    public void defender(int valorDoAtaque) {
        int defesaTotal = 0;
        if (armadura != null) {
            defesaTotal = armadura.calculaDefesa(this.resistencia);
            if (valorDoAtaque <= defesaTotal) {
                System.out.println("O Ataque foi defendido!!!");
            } else {
                int danoCausado = valorDoAtaque - defesaTotal;
                System.out.println("O dano causado foi de: " + danoCausado);
                // this.vida = this.vida - danoCausado
                this.vida -= danoCausado;
                armadura.diminuiDurabilidade(danoCausado);
                if (armadura.temDurabilidade() == false) {
                    this.armadura = new Armadura();
                }
            }

        } else {
            defesaTotal = this.resistencia;
            if (valorDoAtaque <= defesaTotal) {
                System.out.println("O Ataque foi defendido!!!");
            } else {
                int danoCausado = valorDoAtaque - defesaTotal;
                System.out.println("O dano causado foi de: " + danoCausado);
                // this.vida = this.vida - danoCausado
                this.vida -= danoCausado;
            }
        }
    }

    // metodos getter e setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getDestreza() {
        return destreza;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public int getAgilidade() {
        return agilidade;
    }

    public void setAgilidade(int agilidade) {
        this.agilidade = agilidade;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getCarisma() {
        return carisma;
    }

    public void setCarisma(int carisma) {
        this.carisma = carisma;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getEstamina() {
        return estamina;
    }

    public void setEstamina(int estamina) {
        this.estamina = estamina;
    }

    public int getSorte() {
        return sorte;
    }

    public void setSorte(int sorte) {
        this.sorte = sorte;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public Armadura getArmadura() {
        return armadura;
    }

    public void setArmadura(Armadura armadura) {
        this.armadura = armadura;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }
}