package examen;

public class Examen {
    public static void main(String[] args) {
        int numeroSoldados = 8;
        int pasos = 2;
        JosephusGame g = new JosephusGame(numeroSoldados, pasos);

        try {
            g.play();
        } catch (EmptyQueueException e) {
            System.err.println("ha explotado");
        }

        /*ArrayQueue q = new ArrayQueue();
        System.out.println("Cola vacia = " + q);

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        System.out.println(q);

        try {
            int a = q.dequeue();
            int b = q.dequeue();
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println(q);
        } catch (EmptyQueueException e) {
            System.err.println("No hay elemento que decolar");
        }


        try {
            System.out.println("q.front() = " + q.front());
        } catch (EmptyQueueException e) {
            System.err.println("Cola vacia, no tiene front");
        }*/
    }
}
