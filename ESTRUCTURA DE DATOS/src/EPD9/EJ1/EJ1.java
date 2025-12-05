package EPD9.EJ1;

import datastructures.AdjacencyMapGraph;
import datastructures.Graph;
import datastructures.Vertex;

import java.sql.SQLOutput;

public class EJ1 {
    public static void main(String[] args) {
        Graph<String, Integer> grafoNoDireccionado = new AdjacencyMapGraph<>(false);
        Graph<String, Integer> grafoDireccionado = new AdjacencyMapGraph<>(true);

        final Vertex<String> nSFO = grafoNoDireccionado.insertVertex("SFO");
        final Vertex<String> nLAX = grafoNoDireccionado.insertVertex("LAX");
        final Vertex<String> nDFW = grafoNoDireccionado.insertVertex("DFW");
        final Vertex<String> nORD = grafoNoDireccionado.insertVertex("ORD");

        grafoNoDireccionado.insertEdge(nSFO, nLAX, 337);
        grafoNoDireccionado.insertEdge(nSFO, nORD, 1843);
        grafoNoDireccionado.insertEdge(nORD, nLAX, 1743);
        grafoNoDireccionado.insertEdge(nDFW, nLAX, 1233);
        grafoNoDireccionado.insertEdge(nDFW, nORD, 802);

        final Vertex<String> dSFO = grafoDireccionado.insertVertex("SFO");
        final Vertex<String> dLAX = grafoDireccionado.insertVertex("LAX");
        final Vertex<String> dDFW = grafoDireccionado.insertVertex("DFW");
        final Vertex<String> dORD = grafoDireccionado.insertVertex("ORD");

        grafoDireccionado.insertEdge(dSFO, dLAX, 0);
        grafoDireccionado.insertEdge(dLAX, dORD, 0);
        grafoDireccionado.insertEdge(dDFW, dLAX, 0);
        grafoDireccionado.insertEdge(dDFW, dSFO, 0);
        grafoDireccionado.insertEdge(dORD, dSFO, 0);
        grafoDireccionado.insertEdge(dORD, dDFW, 0);

        if (areAdjacent(grafoNoDireccionado, nSFO, nORD )) {
            System.out.println("ESTAN CONECTADOS");
        } else
            System.out.println("NO ESTAN CONECTADOS");
    }

    public static <V, E> boolean areAdjacent(Graph<V, E> grafo, Vertex<V> vertex, Vertex<V> vertex2) {
        boolean res = false;


        try {
            grafo.getEdge(vertex, vertex2);
            res = true;
        } catch (Exception e) {
            System.err.println("No existe conextion " + vertex + " => " + vertex2);
        }

        if (!res) {
            try {
                grafo.getEdge(vertex2, vertex);
                res = true;
            } catch (Exception e) {
                System.err.println("No existe conextion " + vertex2 + " => " + vertex);
            }
        }

        return res;
    }
}
