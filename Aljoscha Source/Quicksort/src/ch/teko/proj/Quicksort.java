package ch.teko.proj;
public class Quicksort {

    public int aufteilung(int[] liste, final int erstesElement, final int letztesElement) {

        /*
         * Der Pivot wird ermittelt, in dem der Index ganz links (meist 0)
         * und der Index ganz rechts addiert und danach durch zwei geteilt werden
         * so wird eine Median Pivot ermittelt
         * sollte eine ungerade Array genommen werden, wird die Zahl abgerundet
         */
        int pivot = liste[(erstesElement + letztesElement) /2];

        // Setzt das erste Element in der Liste fest
        int linkePosition = erstesElement;

        //Deklariert das letzte Element der Liste
        int rechtePosition = letztesElement;


        while (linkePosition <= rechtePosition) {

            /*
             * Solange das zu bearbeitende Element auf der linken Seite
             * des Pivot kleiner ist, soll die Position um eins erhöht werden
             */
            while (liste[linkePosition] < pivot){
                linkePosition++;
            }

            /*
             * Solange das zu bearbeitete Element auf der rechten Seite
             * des Pivot grösser ist, soll die Position um eins verringert werden
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
                int temp = liste[linkePosition]; //Die Position links neben dem Pivot wird sich gemerkt (Als temporäre Stelle)
                liste[linkePosition] = liste[rechtePosition];
                liste[rechtePosition] = temp;
                linkePosition++;
                rechtePosition--;
            }
        }

        return linkePosition;

    }

    public  void quicksort(int[] liste, final int erstesElement, final int letztesElement) {

        /*
         * Das Array wird in zwei Seiten aufgeteilt
         * Einer linken Seite, welche kleiner als das Pivot ist
         * und einer rechten Seite, welche grösser als das Pivot ist
         */
        int index = aufteilung(liste, erstesElement, letztesElement);

        /*
         * Die linke Seite vom Pivot wird repräsentiert
         */
        if (erstesElement < index -1){
            quicksort(liste, erstesElement, index-1);
        }

        /*
         * Die rechte Seite vom Pivot wird repräsentiert
         */
        if (index < letztesElement) {
            quicksort(liste, index, letztesElement);
        }
    }

}