package Tree;

class Node{
    int key ;
    Node left , right;

    public Node(int item){
        key = item;
        left = null;
        right = null;
    }

}



public class BinaryTreeConstruction {
    Node root;

    BinaryTreeConstruction(int key) {
        root = new Node(key);
    }

    BinaryTreeConstruction() {
        root = null;
    }
    public static void main(String[] args) {
        BinaryTreeConstruction tree = new BinaryTreeConstruction();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        System.out.println(tree.root.left);
        System.out.println(tree.root.right);
    }
}
