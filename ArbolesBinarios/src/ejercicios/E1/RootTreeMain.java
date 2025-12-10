package ejercicios.E1;

public class RootTreeMain {
    public static void main(String[] args) {
        BinaryNode root = new BinaryNode("A");
        BinaryNode node1 = new BinaryNode("B1");
        BinaryNode node2 = new BinaryNode("B2");
        BinaryNode node3 = new BinaryNode("C11");
        BinaryNode node4 = new BinaryNode("C21");
        BinaryNode node5 = new BinaryNode("C22");

        BinaryTree tree = new BinaryTree(root);
        root.left = node1;
        root.right = node2;


        System.out.println(tree.size());
    }
}
