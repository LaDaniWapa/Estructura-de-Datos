package ejercicios.E1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class BinaryTree<E> implements IBinaryTree<E> {
    protected BinaryNode<E> root;
    protected int size;

    public BinaryTree() {
        root = null;
        size = 0;
    }

    public BinaryTree(BinaryNode<E> root) {
        this.root = root;
        size = 1;
    }

    public BinaryTree(E rootElement) {
        this.root = new BinaryNode<>(rootElement);
        size = 1;
    }

    @Override
    public int size() {
        // return sizeRecursive(root);
        return size;
    }

    private int sizeRecursive(BinaryNode<E> n) {
        if (n == null) return 0;
        return 1 + sizeRecursive(n.left) + sizeRecursive(n.right);
    }

    @Override
    public boolean isEmpty() {
        return root == null;
    }

    @Override
    public Iterator<E> elementsInOrder() {
        ArrayList<E> lista = new ArrayList<>();
        elementsInOrderRecursive(this.root, lista);

        return lista.iterator();
    }

    private void elementsInOrderRecursive(BinaryNode<E> n, ArrayList<E> result) {
        if (n == null) return;

        elementsInOrderRecursive(n.left, result);
        result.add(n.element);
        elementsInOrderRecursive(n.right, result);
    }

    @Override
    public Iterator<E> elementsPreOrder() {
        ArrayList<E> lista = new ArrayList<>();
        elementPreOrderRecursive(this.root, lista);
        return lista.iterator();
    }

    private void elementPreOrderRecursive(BinaryNode<E> n, ArrayList<E> result) {
        if (n == null) return;

        result.add(n.element);
        ;
        elementPreOrderRecursive(n.left, result);
        elementPreOrderRecursive(n.right, result);
    }

    @Override
    public Iterator<E> elementsPostOrder() {
        ArrayList<E> lista = new ArrayList<>();
        elementsPostOrderRecursive(this.root, lista);
        return lista.iterator();
    }

    private void elementsPostOrderRecursive(BinaryNode<E> n, ArrayList<E> result) {
        if (n == null) return;

        elementsPostOrderRecursive(n.left, result);
        elementsPostOrderRecursive(n.right, result);
        result.add(n.element);
    }

    @Override
    public Iterator<BinaryNode<E>> nodesInOrder() {
        ArrayList<BinaryNode<E>> lista = new ArrayList<>();
        nodesInOrderRecursive(this.root, lista);
        return lista.iterator();
    }

    private void nodesInOrderRecursive(BinaryNode<E> n, ArrayList<BinaryNode<E>> result) {
        if (n == null) return;

        nodesInOrderRecursive(n.left, result);
        result.add(n);
        nodesInOrderRecursive(n.right, result);
    }

    @Override
    public Iterator<BinaryNode<E>> nodesPreOrder() {
        ArrayList<BinaryNode<E>> lista = new ArrayList<>();
        nodesPreOrderRecursive(this.root, lista);
        return lista.iterator();
    }

    private void nodesPreOrderRecursive(BinaryNode<E> n, ArrayList<BinaryNode<E>> result) {
        if (n == null) return;

        result.add(n);
        nodesPreOrderRecursive(n.left, result);
        nodesPreOrderRecursive(n.right, result);
    }

    @Override
    public Iterator<BinaryNode<E>> nodesPostOrder() {
        ArrayList<BinaryNode<E>> lista = new ArrayList<>();
        nodesPostOrderRecursive(this.root, lista);
        return lista.iterator();
    }

    private void nodesPostOrderRecursive(BinaryNode<E> n, ArrayList<BinaryNode<E>> result) {
        if (n == null) return;

        nodesPostOrderRecursive(n.left, result);
        nodesPostOrderRecursive(n.right, result);
        result.add(n);
    }

    @Override
    public BinaryNode<E> root() {
        return root;
    }

    @Override
    public BinaryNode<E> parent(BinaryNode<E> node) {
        if (node == null || node == root) return null;

        return recursiveParent(root, node);
    }

    private BinaryNode<E> recursiveParent(BinaryNode<E> current, BinaryNode<E> searched) {
        if (current == null) return null;
        if (current.left == searched) return current;
        if (current.right == searched) return current;

        BinaryNode left = recursiveParent(current.left, searched);
        if (left != null) return left;

        BinaryNode right = recursiveParent(current.right, searched);
        if (right != null) return right;

        return null;
    }

    @Override
    public Collection<BinaryNode<E>> children(BinaryNode<E> node) {
        if (node == null) return null;

        ArrayList<BinaryNode<E>> lista = new ArrayList<>();

        if (node.left != null) lista.add(node.left);
        if (node.right != null) lista.add(node.right);

        return lista;
    }

    @Override
    public boolean isInternal(BinaryNode<E> node) {
        return node != null && (node.left != null || node.right != null);
    }

    @Override
    public boolean isExternal(BinaryNode<E> node) {
        return node != null && node.left == null && node.right == null;
    }

    @Override
    public boolean isRoot(BinaryNode<E> node) {
        return this.root == node;
    }

    @Override
    public BinaryNode<E> left(BinaryNode<E> node) {
        return node.left;
    }

    @Override
    public BinaryNode<E> right(BinaryNode<E> node) {
        return node.right;
    }

    @Override
    public boolean hasLeft(BinaryNode<E> node) {
        return node.left != null;
    }

    @Override
    public boolean hasRight(BinaryNode<E> node) {
        return node.right != null;
    }

    //@Override
    public BinaryNode<E> insertLeft(BinaryNode<E> node, E element) {
        if (node == null || element == null) return null;

        if (node.left != null)
            throw new IllegalStateException("El nodo ya tiene un hijo izquierdo");

        BinaryNode<E> newNode = new BinaryNode<>(element);
        node.left = newNode;

        size++;
        return newNode;
    }

    //@Override
    public BinaryNode<E> insertRight(BinaryNode<E> node, E element) {
        if (node == null || element == null) return null;

        if (node.right != null)
            throw new IllegalStateException("El nodo ya tiene un hijo derecho");

        BinaryNode<E> newNode = new BinaryNode<>(element);
        node.right = newNode;

        size++;
        return newNode;
    }

    @Override
    public BinaryNode<E> searchByElement(E element) {
        return searchByElementRecursive(this.root, element);
    }

    private BinaryNode<E> searchByElementRecursive(BinaryNode<E> n, E element) {
        if (n == null) return null;
        if (n.element.equals(element)) return n;

        BinaryNode<E> leftResult = searchByElementRecursive(n.left, element);
        if (leftResult != null) return leftResult;

        return searchByElementRecursive(n.right, element);
    }

    @Override
    public boolean removeSubtree(E elemento) {
        if (elemento == null) return false;

        BinaryNode<E> nodeToRemove = searchByElement(elemento);

        if (nodeToRemove == null) return false;

        if (this.root != null && elemento.equals(this.root.element)) {
            this.root = null;
            size = 0;
            return true;
        }

        BinaryNode<E> parent = findParent(this.root, nodeToRemove);
        if (parent != null) {
            int removedSize = sizeRecursive(nodeToRemove);

            if (parent.left != null && parent.left == nodeToRemove)
                parent.left = null;
            else
                parent.right = null;

            this.size -= removedSize;
            return true;
        }
        return false;
    }

    private BinaryNode<E> findParent(BinaryNode<E> current, BinaryNode<E> child) {
        if (current == null) return null;

        // Mirar si current es el padre de child
        if (current.left != null && current.left == child ||
                current.right != null && current.right == child)
            return current;

        // Si no, buscar en su izquierda
        BinaryNode<E> leftResult = findParent(current.left, child);
        if (leftResult != null) return leftResult;

        // Y si no, buscar en su derecha
        return findParent(current.right, child);
    }

    @Override
    public Collection<BinaryNode<E>> findPath(E start, E end) {
        BinaryNode<E> startNode = searchByElement(start);
        BinaryNode<E> endNode = searchByElement(end);
        BinaryNode<E> lca = findLCA(this.root, startNode, endNode);

        ArrayList<BinaryNode<E>> startToLCA = new ArrayList<>();

        BinaryNode<E> current = startNode;

        while (current != lca) {
            startToLCA.add(current);
            current = findParent(this.root, current);
            if (current == null) return new ArrayList<>();
        }

        startToLCA.add(lca);

        ArrayList<BinaryNode<E>> endToLCA = new ArrayList<>();
        current = endNode;

        while (current != lca) {
            endToLCA.add(current);
            current = findParent(this.root, current);
            if (current == null) return new ArrayList<>();
        }

        ArrayList<BinaryNode<E>> path = new ArrayList<>();
        path.addAll(startToLCA);
        path.addAll(endToLCA.reversed());

        return path;
    }

    /**
     * Encuentra el Lowest Common Ancestor (LCA) de dos nodos
     */
    private BinaryNode<E> findLCA(BinaryNode<E> root, BinaryNode<E> n1, BinaryNode<E> n2) {
        if (root == null || root == n1 || root == n2) return root;

        // Buscar en el arbol izquierdo
        BinaryNode<E> left = findLCA(root.left, n1, n2);
        // Buscar en el arbol derecho
        BinaryNode<E> right = findLCA(root.right, n1, n2);

        // Si se encuentra un nodo en ambos casos, root es el LCA
        if (left != null && right != null) return root;

        // Si solo se encuentra un nodo en una rama, el LCA esta ahí
        return left != null ? left : right;
    }
}
