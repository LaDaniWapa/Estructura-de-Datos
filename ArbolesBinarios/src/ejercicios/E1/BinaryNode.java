package ejercicios.E1;

public class BinaryNode<E>{
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
}