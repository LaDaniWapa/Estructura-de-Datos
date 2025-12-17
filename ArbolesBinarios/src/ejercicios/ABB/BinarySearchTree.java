package ejercicios.ABB;

import ejercicios.E1.BinaryNode;
import ejercicios.E1.BinaryTree;

import java.util.Comparator;

public class BinarySearchTree<E> extends BinaryTree<E> implements IBinarySearchTree<E> {
    private final Comparator<E> comparator;

    // Constructor: inicializa un BST vacío con un comparador
    public BinarySearchTree(Comparator<E> comparator) {
        super();
        this.comparator = comparator;
    }

    // Constructor: inicializa un BST con un elemento raíz
    public BinarySearchTree(Comparator<E> comparator, E rootElement) {
        super(rootElement);
        this.comparator = comparator;
    }

    // Constructor: inicializa un BST con un nodo raíz existente
    public BinarySearchTree(Comparator<E> comparator, BinaryNode<E> root) {
        super(root);
        this.comparator = comparator;
    }

    /**
     * Añade un elemento al árbol binario de búsqueda
     * Mantiene la propiedad BST: izquierda <= nodo < derecha
     */
    @Override
    public void addElement(E ele) {
        // Validación: no permitir elementos nulos
        if (ele == null) throw new IllegalArgumentException("El elemento no puede ser nulo");

        // Si el árbol está vacío, el nuevo elemento es la raíz
        if (this.isEmpty()) {
            super.root = new BinaryNode<>(ele);
            super.size++;
        } else {
            // Si no, insertamos recursivamente
            insertRecursive(super.root, ele);
        }
    }

    /**
     * Metodo auxiliar recursivo para insertar un elemento
     * Recorre el árbol comparando valores hasta encontrar la posición correcta
     */
    private void insertRecursive(BinaryNode<E> current, E ele) {
        // Si ele <= current, va al subárbol izquierdo
        if (comparator.compare(ele, current.getElement()) <= 0) {
            if (!current.hasLeft()) {
                // Si no hay hijo izquierdo, insertamos aquí
                current.setLeft(new BinaryNode<>(ele));
                super.size++;
            } else {
                // Si hay hijo izquierdo, seguimos buscando recursivamente
                insertRecursive(current.getLeft(), ele);
            }
        }
        // Si ele > current, va al subárbol derecho
        else {
            if (!current.hasRight()) {
                // Si no hay hijo derecho, insertamos aquí
                current.setRight(new BinaryNode<>(ele));
                super.size++;
            } else {
                // Si hay hijo derecho, seguimos buscando recursivamente
                insertRecursive(current.getRight(), ele);
            }
        }
    }

    /**
     * Elimina la primera ocurrencia de un elemento del árbol
     * Retorna el elemento eliminado o null si no se encuentra
     */
    @Override
    public E removeElement(E ele) {
        if (ele == null || this.isEmpty()) return null;

        // Buscamos el nodo a eliminar y su padre
        BinaryNode<E> parent = null;
        BinaryNode<E> current = super.root;

        // Búsqueda del nodo
        while (current != null && comparator.compare(ele, current.getElement()) != 0) {
            parent = current;
            if (comparator.compare(ele, current.getElement()) < 0) {
                current = current.getLeft();
            } else {
                current = current.getRight();
            }
        }

        // Si no se encuentra el elemento
        if (current == null) return null;

        E removedElement = current.getElement();

        // CASO 1: Nodo sin hijos (hoja)
        if (!current.hasLeft() && !current.hasRight()) {
            if (parent == null) {
                // Es la raíz
                super.root = null;
            } else if (parent.getLeft() == current) {
                parent.setLeft(null);
            } else {
                parent.setRight(null);
            }
        }
        // CASO 2: Nodo con un solo hijo
        else if (!current.hasLeft() || !current.hasRight()) {
            BinaryNode<E> child = current.hasLeft() ? current.getLeft() : current.getRight();

            if (parent == null) {
                // Es la raíz
                super.root = child;
            } else if (parent.getLeft() == current) {
                parent.setLeft(child);
            } else {
                parent.setRight(child);
            }
        }
        // CASO 3: Nodo con dos hijos
        else {
            // Buscamos el sucesor inorden (mínimo del subárbol derecho)
            BinaryNode<E> successorParent = current;
            BinaryNode<E> successor = current.getRight();

            // El sucesor es el nodo más a la izquierda del subárbol derecho
            while (successor.hasLeft()) {
                successorParent = successor;
                successor = successor.getLeft();
            }

            // Reemplazamos el elemento del nodo actual con el del sucesor
            current.setElement(successor.getElement());

            // Eliminamos el sucesor (que tiene máximo un hijo derecho)
            if (successorParent == current) {
                successorParent.setRight(successor.getRight());
            } else {
                successorParent.setLeft(successor.getRight());
            }
        }

        super.size--;
        return removedElement;
    }

    /**
     * Elimina todas las ocurrencias de un elemento del árbol
     * Útil cuando el BST permite duplicados
     */
    @Override
    public void removeAllOcurrences(E ele) {
        if (ele == null) return;

        // Eliminamos repetidamente mientras el elemento exista
        while (find(ele)) {
            removeElement(ele);
        }
    }

    /**
     * Elimina y retorna el elemento mínimo del árbol
     * El mínimo está en el nodo más a la izquierda
     */
    @Override
    public E removeMin() {
        if (this.isEmpty()) return null;

        // Caso especial: la raíz es el mínimo (no tiene hijo izquierdo)
        if (!super.root.hasLeft()) {
            E min = super.root.getElement();
            super.root = super.root.getRight();
            super.size--;
            return min;
        }

        // Buscamos el nodo más a la izquierda y su padre
        BinaryNode<E> parent = super.root;
        BinaryNode<E> current = super.root.getLeft();

        while (current.hasLeft()) {
            parent = current;
            current = current.getLeft();
        }

        E min = current.getElement();
        // El nodo mínimo puede tener un hijo derecho
        parent.setLeft(current.getRight());
        super.size--;

        return min;
    }

    /**
     * Elimina y retorna el elemento máximo del árbol
     * El máximo está en el nodo más a la derecha
     */
    @Override
    public E removeMax() {
        if (this.isEmpty()) return null;

        // Caso especial: la raíz es el máximo (no tiene hijo derecho)
        if (!super.root.hasRight()) {
            E max = super.root.getElement();
            super.root = super.root.getLeft();
            super.size--;
            return max;
        }

        // Buscamos el nodo más a la derecha y su padre
        BinaryNode<E> parent = super.root;
        BinaryNode<E> current = super.root.getRight();

        while (current.hasRight()) {
            parent = current;
            current = current.getRight();
        }

        E max = current.getElement();
        // El nodo máximo puede tener un hijo izquierdo
        parent.setRight(current.getLeft());
        super.size--;

        return max;
    }

    /**
     * Encuentra y retorna el elemento mínimo sin eliminarlo
     */
    @Override
    public E findMin() {
        if (this.isEmpty()) return null;

        BinaryNode<E> current = super.root;

        // Vamos al nodo más a la izquierda
        while (current.hasLeft()) {
            current = current.getLeft();
        }

        return current.getElement();
    }

    /**
     * Encuentra y retorna el elemento máximo sin eliminarlo
     */
    @Override
    public E findMax() {
        if (this.isEmpty()) return null;

        BinaryNode<E> current = super.root;

        // Vamos al nodo más a la derecha
        while (current.hasRight()) {
            current = current.getRight();
        }

        return current.getElement();
    }

    /**
     * Busca un elemento en el árbol
     * Retorna true si existe, false en caso contrario
     */
    @Override
    public boolean find(E eleToFind) {
        if (eleToFind == null || this.isEmpty()) return false;

        return findRecursive(super.root, eleToFind);
    }

    /**
     * Método auxiliar recursivo para buscar un elemento
     * Aprovecha la propiedad BST para una búsqueda eficiente
     */
    private boolean findRecursive(BinaryNode<E> current, E eleToFind) {
        // Caso base: nodo nulo, elemento no encontrado
        if (current == null) return false;

        int comparison = comparator.compare(eleToFind, current.getElement());

        // Elemento encontrado
        if (comparison == 0) {
            return true;
        }
        // Buscar en el subárbol izquierdo
        else if (comparison < 0) {
            return findRecursive(current.getLeft(), eleToFind);
        }
        // Buscar en el subárbol derecho
        else {
            return findRecursive(current.getRight(), eleToFind);
        }
    }
}

