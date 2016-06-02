package com.company;

import java.util.Scanner;
import java.util.Random;
/**
 * Classe principal, cont� el m�tode de Main que executar� i controlar� la execuci� del programa
 * i cont� el m�tode "nova_lletra" que permet que funcioni el joc. 
 * @author ies
 */
public class Main {

    static protected String paraules[] = {"hola","programaci�","casa"};
    static protected int index;
    static protected String p;

    /**
     * Gestiona la execuci� del programa. M�tode principal, crida els m�todes secundaris.
     * Obt� una paraula oculta, demana una lletra a l'usuari, comprova cridant un altre m�tode si
     * la lletra est� a la paraula. 
     * Gestiona els errors de l'usuari, si te 5 o m�s el programa acaba.
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Comen�a el joc!");

        Random rand = new Random();
        index = rand.nextInt(3);
        for (int i=0; i<paraules[index].length(); i++) {
            p += "_";
        }

        System.out.println(p);

        Scanner reader = new Scanner(System.in);

        int num_errors = 0;

        while (!p.equals(paraules[index]) && num_errors < 5) {
            if (!nova_lletra(reader.next().charAt(0))) {
                num_errors++;
            }
            System.out.println(p);
        }
   }

    /**
     * El m�tode rep per par�metre un Car�cter que comprovar� si �s a la paraula oculta
     * o no hi es. Si hi es retornar� true, si no retorna false.
     * @param nova (char)
     * @return trobada (Boolean)
     * @author ies
     */
    static public boolean nova_lletra(char nova) {
        boolean trobada = false;
        String paraula_old = p;
        p = "";
        for (int i=0; i<paraules[index].length(); i++) {
            if (paraules[index].charAt(i) == nova) {
                p += paraules[index].charAt(i);
                trobada = true;
            }
            else {
                p += paraula_old.charAt(i);
            }
        }
        return trobada;
    }

}

