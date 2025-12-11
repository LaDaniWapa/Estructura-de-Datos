package ejercicios.ABB;

import ejercicios.E1.IBinaryTree;

public interface IBinarySearchTree<E> extends IBinaryTree<E> {
    /**
     * Adds an element to the tree.
     * @param ele the element to add
     */
    void addElement(E ele);

    /**
     * Removes an element from the tree.
     * @param ele the element to remove
     * @return the removed element
     */
    E removeElement(E ele);

    /**
     * Removes all occurrences of an element from the tree.
     * @param ele the element to remove
     */
    void removeAllOcurrences(E ele);

    /**
     * Removes the minimum element from the tree.
     * @return the removed minimum element
     */
    E removeMin();

    /**
     * Removes the maximum element from the tree.
     * @return the removed maximum element
     */
    E removeMax();

    /**
     * Finds the minimum element in the tree.
     * @return the minimum element
     */
    E findMin();

    /**
     * Finds the maximum element in the tree.
     * @return the maximum element
     */
    E findMax();

    /**
     * Checks if an element exists in the tree.
     * @param eleToFind the element to find
     * @return true if the element exists, false otherwise
     */
    boolean find(E eleToFind);
}
