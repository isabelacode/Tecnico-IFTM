package br.edu.iftm.exercícios;

import java.util.Scanner;

public class Exercício5 {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        System.out.println("Deseja ligar? S/N ");
        char comando1 = ent.next().charAt(0);

        boolean prog;

        if (comando1 == 'S') {
            prog = true;
            while (prog == true) {

                System.out.println("(a)Adicionar contanto");
                System.out.println("(b)Buscar contato");
                System.out.println("(c)Remover contato");
                System.out.println("(d)Editar contanto");
                System.out.println("(e)Sair");
                char comando = ent.next().charAt(0);

                switch (comando) {
                    case 'a':
                    case 'A':
                        break;
                    case 'b':
                    case 'B':
                        break;
                    case 'c':
                    case 'C':
                        break;
                    case 'd':
                    case 'D':
                        break;
                    case 'e':
                    case 'E':
                        prog = false;
                        break;
                    default:
                }
            }
        } else if (comando1 == 'N') {
            prog = false;
        }
        ent.close();
    }
}