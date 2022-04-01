package ch.teko.proj;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Quicksort quick = new Quicksort();

                  
        // Deklaration des Array's
        int [] sortiereMich = new Random().ints().limit(10).toArray();

        /*
        * Um nicht immer die Arraylänge nachtragen zu müssen,
        * wird hier die passende Indexzahl ermittelt um es später einfügen zu können
        */
        int arraysLaenge = sortiereMich.length - 1;  


        System.out.println(Arrays.toString(sortiereMich)); //Gibt das unsortiere Array aus
        quick.quicksort(sortiereMich, 0, arraysLaenge);
        System.out.println(Arrays.toString(sortiereMich)); //Gibt das sortiere Array aus

    }
}
