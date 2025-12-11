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

    public void setLeft(E ele) {
        this.left = new BinaryNode<>(ele);
    }

    public void setRight(BinaryNode<E> right) {
        this.right = right;
    }

    public void setRight(E ele) {
        this.right = new BinaryNode<>(ele);
    }
}