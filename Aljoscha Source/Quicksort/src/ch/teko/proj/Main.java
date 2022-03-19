package ch.teko.proj;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

	Quicksort quick = new Quicksort();

    int [] sortiereMich = {89, 81, 99, 26, 80, 59, 60, 20, 15, 47, 70, 90, 12, 62, 68, 53, 46, 34, 17, 67, 12, 18, 57, 100, 30};
    int arraysLänge = sortiereMich.length - 1;


    System.out.println(Arrays.toString(sortiereMich));
    quick.quicksort(sortiereMich, 0, arraysLänge);
    System.out.println(Arrays.toString(sortiereMich));
    }
}
