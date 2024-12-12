package day42_collections_maps;

import java.util.Deque;
import java.util.LinkedList;

public class C01_Deque {

    public static void main(String[] args) {

        // Double ended Queue
        // Iki Uclu kuyruk
        // Queue'nun child'idir, dolayisiyla Queue'dan daha cok method'a sahiptir.
        // Double ended ozelligi sebebiyle
        // pek cok methodun ..first() ve ..end() seklinde iki ayri uygulamasi vardir.

        Deque<Integer> deque = new LinkedList<>();

        deque.add(45);
        deque.addFirst(23);
        deque.addLast(13);

        System.out.println(deque);

        deque.removeFirstOccurrence(3);








    }



}
