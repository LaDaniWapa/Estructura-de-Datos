package ejercicios.E1;

import java.util.Collection;
import java.util.Iterator;

public interface IBinaryTree<E> {
    /**
     * Devuelve el número de nodos en el árbol.
     * @return número de nodos.
     */
    int size();

    /**
     * Indica si el árbol está o no vacío.
     * @return true si está vacío.
     */
    boolean isEmpty();

    /**
     * Devuelve un iterador con todos los elementos del árbol recorrido en inorden.
     * @return iterador con los elementos en inorden.
     */
    Iterator<E> elementsInOrder();

    /**
     * Devuelve un iterador con todos los elementos del árbol recorrido en preorden.
     * @return iterador con los elementos en preorden.
     */
    Iterator<E> elementsPreOrder();

    /**
     * Devuelve un iterador con todos los elementos del árbol recorrido en postorden.
     * @return iterador con los elementos en postorden.
     */
    Iterator<E> elementsPostOrder();

    /**
     * Devuelve un iterador con todos los nodos del árbol recorrido en inorden.
     * @return iterador con los nodos en inorden.
     */
    Iterator<BinaryNode<E>> nodesInOrder();

    /**
     * Devuelve un iterador con todos los nodos del árbol recorrido en preorden.
     * @return iterador con los nodos en preorden.
     */
    Iterator<BinaryNode<E>> nodesPreOrder();

    /**
     * Devuelve un iterador con todos los nodos del árbol recorrido en postorden.
     * @return iterador con los nodos en postorden.
     */
    Iterator<BinaryNode<E>> nodesPostOrder();

    /**
     * Devuelve el nodo raíz del árbol.
     * @return el nodo raíz.
     */
    BinaryNode<E> root();

    /**
     * Devuelve el nodo padre de un nodo dado.
     * @param node nodo del que se quiere saber el padre.
     * @return el nodo padre.
     */
    BinaryNode<E> parent(BinaryNode<E> node);

    /**
     * Devuelve una colección iterable con los nodos hijos de un nodo dado.
     * @param node nodo del que se quieren saber los hijos.
     * @return colección con los hijos.
     */
    Collection<BinaryNode<E>> children(BinaryNode<E> node);

    /**
     * Devuelve si el nodo dado es interno.
     * @param node nodo a comprobar.
     * @return true si es interno.
     */
    boolean isInternal(BinaryNode<E> node);

    /**
     * Devuelve si el nodo dado es externo.
     * @param node nodo a comprobar.
     * @return true si es externo.
     */
    boolean isExternal(BinaryNode<E> node);

    /**
     * Devuelve si el nodo dado es el nodo raíz del árbol.
     * @param node nodo a comprobar.
     * @return true si es la raíz.
     */
    boolean isRoot(BinaryNode<E> node);

    /**
     * Devuelve el nodo hijo izquierda de un nodo dado.
     * @param node nodo del que se quiere saber el hijo izquierdo.
     * @return el hijo izquierdo.
     */
    BinaryNode<E> left(BinaryNode<E> node);

    /**
     * Devuelve el nodo hijo derecha de un nodo dado.
     * @param node nodo del que se quiere saber el hijo derecho.
     * @return el hijo derecho.
     */
    BinaryNode<E> right(BinaryNode<E> node);

    /**
     * Si el nodo dado tiene o no nodo hijo izquierdo.
     * @param node nodo a comprobar.
     * @return true si tiene hijo izquierdo.
     */
    boolean hasLeft(BinaryNode<E> node);

    /**
     * Si el nodo dado tiene o no nodo hijo derecho.
     * @param node nodo a comprobar.
     * @return true si tiene hijo derecho.
     */
    boolean hasRight(BinaryNode<E> node);

    /**
     * Inserta un elemento como hijo izquierdo del nodo dado
     * @param node nodo padre
     * @param element elemento a insertar
     * @return el nuevo nodo creado, o null si no se pudo insertar
     */
    //BinaryNode<E> insertLeft(BinaryNode<E> node, E element) throws IllegalStateException;

    /**
     * Inserta un elemento como hijo derecho del nodo dado
     * @param node nodo padre
     * @param element elemento a insertar
     * @return el nuevo nodo creado, o null si no se pudo insertar
     */
    //BinaryNode<E> insertRight(BinaryNode<E> node, E element) throws IllegalStateException;

    /**
     * Busca un nodo por su elemento
     * @param element elemento a buscar
     * @return el nodo encontrado, o null si no se encuentra
     */
    BinaryNode<E> searchByElement(E element);

    /**
     * Elimina un nodo y sus hijos a partir de su elemento
     * @param elemento elemento del nodo a eliminar
     * @return true si se eliminó el nodo, false en caso contrario
     */
    boolean removeSubtree(E elemento);

    /**
     * Encuentra el camino desde el nodo con elemento 'start'
     * hasta el nodo con elemento 'end'
     * @param start elemento del nodo inicial
     * @param end elemento del nodo final
     * @return lista de nodos en el camino (incluyendo start y end),
     *         o lista vacía si no hay camino
     * @throws NullPointerException si alguno de los elementos es null
     */
    Collection<BinaryNode<E>> findPath(E start, E end) throws NullPointerException;
}
