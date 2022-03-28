package ch.teko.proj;

public class Quicksort {

    public int aufteilung(int liste[], final int ersteselement, final int letzteselement) {

        /*
         * Der Pivot wird ermittelt, in dem der Index ganz links (meist 0)
         * und der Index ganz rechts addiert und danach durch zwei geteilt werden
         * So wird eine Median Pivot ermittelt
         * Sollte eine ungerade Array genommen werden, wird die Zahl abgerundet
         */
        int pivot = liste[(ersteselement + letzteselement) /2];

        // Setzt das erste Element in der Liste fest
        int linkePosition = ersteselement;

        //Deklariert das letzte Element der Liste
        int rechtePosition = letzteselement;


        while (linkePosition <= rechtePosition) {

            /*
            * Solange das zu bearbeiteten Element auf der linken Seite
            * des Picot kleiner ist, soll es die Position um eins erhöht werden
            */
            while (liste[linkePosition] < pivot){
                linkePosition++;
            }

            /*
            * Solange das zu bearbeiteten Element auf der rechten Seite
            * des Picot grösser ist, soll es die Position um eins verringert werden
            */
            while (liste[rechtePosition] > pivot) {
                rechtePosition--;
            }

            if (linkePosition <= rechtePosition ) {
                int temp = liste[linkePosition];
                liste[linkePosition] = liste[rechtePosition];
                liste[rechtePosition] = temp;
                linkePosition++;
                rechtePosition--;
            }
        }

        return linkePosition;

    }

    public  void quicksort(int liste[], final int ersteselement, final int letzteselement) {

        int index = aufteilung(liste, ersteselement, letzteselement);

        if (ersteselement < index -1){
            quicksort(liste, ersteselement, index-1);
        }

        if (index < letzteselement) {
            quicksort(liste, index, letzteselement);
        }
    }

}
