package ch.teko.proj;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Quicksort quick = new Quicksort();

        int [] sortiereMich = {32, 235, 107, 106, 139, 52, 9, 24, 219, 192, 146, 191, 41, 71, 20, 127, 7, 167, 141, 5};

        int arraysLaenge = sortiereMich.length - 1;  //Um nicht immer die Arraylänge nachtragen zu müssen, wird hier die passende Indexzahl ermittelt um es später einfügen zu können


        System.out.println(Arrays.toString(sortiereMich));
        quick.quicksort(sortiereMich, 0, arraysLaenge);
        System.out.println(Arrays.toString(sortiereMich));
    }
}
