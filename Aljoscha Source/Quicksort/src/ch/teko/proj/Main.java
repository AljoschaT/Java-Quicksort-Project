package ch.teko.proj;

import java.util.Arrays;



public class Main {

    public static void main(String[] args) {

        Quicksort quick = new Quicksort();

        
        
        // Deklaration des Array's
        int [] sortiereMich = new int[100];

        for (int i = 0; i < sortiereMich.length; i++) {
            sortiereMich[i] = (int) (Math.random()*100); // Jedes Element erhält eine Random Zahl.
        }

        /*
        * Um nicht immer die Arraylänge nachtragen zu müssen,
        * wird hier die passende Indexzahl ermittelt um es später einfügen zu können
        */
        int arraysLaenge = sortiereMich.length - 1;



        System.out.println("Unsortiert: " + Arrays.toString(sortiereMich)); //Gibt das unsortiere Array aus
        quick.quicksort(sortiereMich, 0, arraysLaenge);
        System.out.println("Sortiert: " + Arrays.toString(sortiereMich)); //Gibt das sortiere Array aus
    }
}
