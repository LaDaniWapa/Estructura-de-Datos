package examen;

import java.util.ArrayList;
import java.util.Arrays;

// -1 = Empty
// Null = Unusable

public class ArrayQueue implements IQueue<Integer> {
    private final Integer[] cola;
    private int lastIndex = -1;

    public ArrayQueue() {
        // Inicializar la cola con huecos vacios
        cola = new Integer[1000];
    }

    @Override
    public boolean find(Integer o) {
        int i = 0;
        boolean found = false;

        while (i <= lastIndex && !found) {
            if (cola[i] == 0)
                found = true;
            else
                i++;
        }

        return found;
    }

    @Override
    public Integer dequeue() throws EmptyQueueException {
        if (lastIndex == -1) throw new EmptyQueueException();

        Integer head = cola[0];

        // Shift elements
        for (int i = 0; i < lastIndex; i++) {
            cola[i] = cola[i+1];
        }

        cola[lastIndex--] = -1;

        return head;
    }

    @Override
    public void enqueue(Integer o) {
        cola[++lastIndex] = o;
    }

    @Override
    public Integer front() throws EmptyQueueException {
        if (lastIndex < 0) throw new EmptyQueueException();
        return cola[0];
    }

    @Override
    public boolean isEmpty() {
        return lastIndex == -1;
    }

    @Override
    public int size() {
        return lastIndex + 1;
    }

    @Override
    public String toString() {
        StringBuilder items = new StringBuilder("[");

        for (int i = 0; i <=lastIndex; i++) {
            items.append(cola[i]).append(" ");
        }
        items.append("]");

        return items.toString();
    }
}
