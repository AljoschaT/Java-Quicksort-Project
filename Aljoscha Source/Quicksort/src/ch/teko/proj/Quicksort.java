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

            /*
            * Elemente tauschen
            * 1. die funktion "temp" behält den linken Wert
            * 2. Der Wert der linken Position wird auf den rechten Wert geändert
            * 3. Der rechte Wert wird auf den Temporären linken Wert geändert
            * 4. Auf der linken Seite wird ein Element weiter gegangen
            * 5. Auf der rechten seite wird ein Element nach hinten verlegt
            */

            if (linkePosition <= rechtePosition ) {
                int temp = liste[linkePosition]; //Die Position links neben dem Pivot wird sich gemerkt (Als Temporäre Stelle)
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
