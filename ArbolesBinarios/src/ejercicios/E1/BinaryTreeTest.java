package ejercicios.E1;

import java.util.Collection;
import java.util.Iterator;

public class BinaryTreeTest {
    public static void main(String[] args) {
        System.out.println("=== PRUEBA DE BINARYTREE ===\n");

        // 1. Crear árbol
        System.out.println("1. Creando árbol binario...");
        BinaryTree<String> tree = new BinaryTree<>("A");

        BinaryNode<String> nodeA = tree.root();
        System.out.println("   Raíz: " + nodeA.element);
        System.out.println("   Tamaño: " + tree.size());
        System.out.println("   Vacío: " + tree.isEmpty());

        // 2. Insertar nodos
        System.out.println("\n2. Insertando nodos...");
        BinaryNode<String> nodeB = tree.insertLeft(nodeA, "B");
        BinaryNode<String> nodeC = tree.insertRight(nodeA, "C");

        tree.insertLeft(nodeB, "D");
        tree.insertRight(nodeB, "E");

        tree.insertLeft(nodeC, "F");
        BinaryNode<String> nodeG = tree.insertRight(nodeC, "G");

        System.out.println("   Árbol después de inserciones:");
        System.out.println("        A");
        System.out.println("       / \\");
        System.out.println("      B   C");
        System.out.println("     / \\ / \\");
        System.out.println("    D  E F  G");
        System.out.println("   Tamaño: " + tree.size());

        // 3. Recorridos
        System.out.println("\n3. Recorridos:");

        System.out.print("   Inorden (elementos): ");
        Iterator<String> inOrderElements = tree.elementsInOrder();
        while (inOrderElements.hasNext()) {
            System.out.print(inOrderElements.next() + " ");
        }

        System.out.print("\n   Preorden (nodos): ");
        Iterator<BinaryNode<String>> preOrderNodes = tree.nodesPreOrder();
        while (preOrderNodes.hasNext()) {
            System.out.print(preOrderNodes.next().element + " ");
        }

        // 4. Operaciones con nodos
        System.out.println("\n\n4. Operaciones con nodos:");
        System.out.println("   ¿B es interno? " + tree.isInternal(nodeB));
        System.out.println("   ¿D es externo? " + tree.isExternal(tree.left(nodeB)));
        System.out.println("   ¿A es raíz? " + tree.isRoot(nodeA));
        System.out.println("   Hijos de B: " + tree.children(nodeB).stream().map(n -> n.element).toList());

        // 5. Buscar camino
        System.out.println("\n5. Buscando caminos:");

        // Camino de D a G
        System.out.print("   Camino D -> G: ");
        Collection<BinaryNode<String>> path1 = tree.findPath("D", "G");
        if (path1.isEmpty()) {
            System.out.println("No existe camino");
        } else {
            path1.forEach(n -> System.out.print(n.element + " "));
        }

        // Camino de E a F
        System.out.print("\n   Camino E -> F: ");
        Collection<BinaryNode<String>> path2 = tree.findPath("E", "F");
        path2.forEach(n -> System.out.print(n.element + " "));

        // 6. Eliminar subárbol
        System.out.println("\n\n6. Eliminando subárbol B...");
        boolean removed = tree.removeSubtree("B");
        System.out.println("   ¿Eliminado? " + removed);
        System.out.println("   Tamaño después: " + tree.size());

        System.out.print("   Inorden después de eliminar: ");
        tree.elementsInOrder().forEachRemaining(e -> System.out.print(e + " "));

        // 7. Casos especiales
        System.out.println("\n\n7. Casos especiales:");

        // Buscar elemento que no existe
        System.out.println("   Buscar 'X': " + tree.searchByElement("X"));

        // Camino con mismo inicio y fin
        System.out.print("   Camino A -> A: ");
        tree.findPath("A", "A").forEach(n -> System.out.print(n.element + " "));

        // 8. Árbol vacío
        System.out.println("\n\n8. Probando árbol vacío...");
        BinaryTree<Integer> emptyTree = new BinaryTree<>();
        System.out.println("   Tamaño: " + emptyTree.size());
        System.out.println("   Vacío: " + emptyTree.isEmpty());

        System.out.println("\n=== PRUEBAS COMPLETADAS ===");
    }
}