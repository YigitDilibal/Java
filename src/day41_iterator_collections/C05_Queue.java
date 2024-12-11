package day41_iterator_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C05_Queue {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        // Bu obje her ne kadar LinkedList Constructor'ini kullanmis olsa da
        // data turu Queue oldugundan
        // tum Queue'larin sahip oldugu ortak ozellikleri gosterir

        // Queue (kuyruk) FIFO ozelliklerini gosterir
        // eklemeler sona, silmeler bastan (first in first out)

        queue.add(34);
        queue.add(56);
        queue.add(11);
        queue.add(32);
        queue.add(76);
        queue.add(11);

        System.out.println(queue);

        System.out.println(queue.remove());

        System.out.println(queue); // [56, 11, 32, 76, 11]

        System.out.println(queue.poll());
        System.out.println(queue);

        queue.element();
        queue.peek();



    }

}
