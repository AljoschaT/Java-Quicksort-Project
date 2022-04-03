package ch.teko.proj;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Quicksort quick = new Quicksort();
        int kleineZahl = -20; //Deklariert die kleinst mögliche Zahl
        int grosseZahl = 20; // Deklariert die grösst mögliche Zahl
        int arrayLange = 10; // Deklariert die Array länge

        // Deklaration des Random Array's 
        int [] sortiereMich = new Random().ints(kleineZahl, grosseZahl).limit(arrayLange).toArray(); //Erstellung eines zufälligen Arrays

        // Deklaration des Fixen Array's 
        // int [] sortiereMich = {32, 235, 107, 106, 139, 52, 9, 24, 219, 192, 146, 191, 41, 71, 20, 127, 7, 167, 141, 5};

        /*
         * Um nicht immer die Array länge nachtragen zu müssen,
         * wird hier die passende Indexzahl ermittelt um es später einfügen zu können
         */
        int arrayLang = sortiereMich.length - 1;

        System.out.println(Arrays.toString(sortiereMich)); //Gibt das unsortierte Array aus
        quick.quicksort(sortiereMich, 0, arrayLang);
        System.out.println(Arrays.toString(sortiereMich)); //Gibt das sortierte Array aus

    }
} 