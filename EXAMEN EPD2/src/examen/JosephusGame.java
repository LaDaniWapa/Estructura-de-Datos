package examen;

public class JosephusGame {
    ArrayQueue c;
    ArrayQueue t;
    ArrayQueue o;
    int pasos;
    int soldados;

    public JosephusGame(int soldados, int pasos) {
        c = new ArrayQueue();
        t = new ArrayQueue();
        o = new ArrayQueue();
        this.pasos = pasos;
        this.soldados = soldados;
    }

    public void play() throws EmptyQueueException {
        for (int i = 1; i <= soldados; i++) {
            c.enqueue(i);
        }

        while (c.size() > 1) {
            while (!c.isEmpty()) {
                for (int i = 0; i < this.pasos; i++) {
                    t.enqueue(c.dequeue());
                }
                if (!c.isEmpty())
                    o.enqueue(c.dequeue());
            }
            o.enqueue(t.dequeue());
            c = t;
            t = new ArrayQueue();
        }
        o.enqueue(c.dequeue());
        System.out.println(o);

        while (o.size() > 1)
            System.out.println("Se ejecuta al soldado " + o.dequeue());

        System.out.println("Sobrevive el soldado " + o.dequeue());
    }
}
