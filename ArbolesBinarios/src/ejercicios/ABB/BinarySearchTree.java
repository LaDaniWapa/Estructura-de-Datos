package ejercicios.ABB;

import ejercicios.E1.BinaryNode;
import ejercicios.E1.BinaryTree;

import java.util.Comparator;


public class BinarySearchTree<E> extends BinaryTree<E> implements IBinarySearchTree<E> {
    private Comparator<E> comparator;

    public BinarySearchTree(Comparator<E> comparator) {
        super();
        this.comparator = comparator;
    }

    public BinarySearchTree(Comparator<E> comparator, E rootElement) {
        super(rootElement);
        this.comparator = comparator;
    }

    public BinarySearchTree(Comparator<E> comparator, BinaryNode<E> root) {
        super(root);
        this.comparator = comparator;
    }

    @Override
    public void addElement(E ele) {
        if (ele == null) throw new IllegalArgumentException("El elemento no puede ser nulo");

        if (this.isEmpty())
            super.root = new BinaryNode<>(ele);

        insertRecursive(super.root, ele);
    }

    private void insertRecursive(BinaryNode<E> current, E ele) {
        // ele <= current
        if (comparator.compare(ele, current.getElement()) <= 0) {
            if (!current.hasLeft()) {
                current.setLeft(ele);
                super.size++;
            } else {
                insertRecursive(current.getLeft(), ele);
            }
        }

        // ele > current
        else {
            if (!current.hasRight()) {
                current.setRight(ele);
                super.size++;
            } else {
                insertRecursive(current.getRight(), ele);
            }
        }
    }

    @Override
    public E removeElement(E ele) {
        return null;
    }

    @Override
    public void removeAllOcurrences(E ele) {

    }

    @Override
    public E removeMin() {
        return null;
    }

    @Override
    public E removeMax() {
        return null;
    }

    @Override
    public E findMin() {
        return null;
    }

    @Override
    public E findMax() {
        return null;
    }

    @Override
    public boolean find(E eleToFind) {
        return false;
    }
}
