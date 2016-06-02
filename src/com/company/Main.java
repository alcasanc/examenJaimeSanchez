package com.company;

import java.util.Scanner;
import java.util.Random;
/**
 * Classe principal, conté el mètode de Main que executarà i controlarà la execució del programa
 * i conté el mètode "nova_lletra" que permet que funcioni el joc. 
 * @author ies
 */
public class Main {

    static protected String paraules[] = {"hola","programació","casa"};
    static protected int index;
    static protected String p;

    /**
     * Gestiona la execució del programa. Mètode principal, crida els mètodes secundaris.
     * Obté una paraula oculta, demana una lletra a l'usuari, comprova cridant un altre mètode si
     * la lletra està a la paraula. 
     * Gestiona els errors de l'usuari, si te 5 o més el programa acaba.
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Comença el joc!");

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
     * El mètode rep per paràmetre un Caràcter que comprovarà si és a la paraula oculta
     * o no hi es. Si hi es retornarà true, si no retorna false.
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

