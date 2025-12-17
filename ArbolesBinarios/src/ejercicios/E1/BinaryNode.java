package ejercicios.E1;

public class BinaryNode<E> {
    E element;
    BinaryNode<E> left;
    BinaryNode<E> right;

    public BinaryNode() {
        this.element = null;
        this.left = null;
        this.right = null;
    }

    public BinaryNode(E ele) {
        this.element = ele;
        this.left = null;
        this.right = null;
    }

    public BinaryNode(E ele, BinaryNode<E> l, BinaryNode<E> r) {
        this.element = ele;
        this.left = l;
        this.right = r;
    }

    public E getElement() {
        return element;
    }

    public boolean hasLeft() {
        return left != null;
    }

    public boolean hasRight() {
        return right != null;
    }

    public BinaryNode<E> getLeft() {
        return this.left;
    }

    public BinaryNode<E> getRight() {
        return this.right;
    }

    public void setLeft(BinaryNode<E> left) {
        this.left = left;
    }

    public void setRight(BinaryNode<E> right) {
        this.right = right;
    }

    public void setElement(E ele) {
        this.element = ele;
    }

    public int getNHijos() {
        int hijos = 0;
        if (left != null) hijos++;
        if (right != null) hijos++;
        return hijos;
    }
}