package Tree;

import java.util.LinkedList;
import java.util.Queue;

import javax.management.Query;

public class DeletionOfANodeInTree {
    static class Node{
        int key ;
        Node left , right;
        public Node(int key) {
            this.key = key;
            left = null;
            right = null;
        }
    
    }

    static Node root;
    static Node temp = root;

    static void inorderTraversalForDeletionOfNode(Node temp){
        if(temp==null){
            return;
        }
        inorderTraversalForDeletionOfNode(temp.left);
        System.out.print(temp.key + " ->");
        inorderTraversalForDeletionOfNode(temp.right);

    }


    public static void main(String[] args) {
        root = new Node(10);
        root.left = new Node(11);
        root.left.left = new Node(7);
        root.right = new Node(9);
        root.right.left = new Node(15);
        root.right.right = new Node(8);
        System.out.println("before deletion of the element i am calling inorderTraversal()");
        inorderTraversalForDeletionOfNode(root);
        System.out.println("I am calling the delete() for a given element");
        int key = 11;
        delete(root,key);
        inorderTraversalForDeletionOfNode(root);
    }


    private static void delete(Node root, int key) {
        if(root==null){
            return ;
        }
        if(root.left==null && root.right==null){
            if(root.key==key){
                root = null;
                return;
            }
            else{
                return;
            }
        }

        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        Node temp = null;
        Node keyNode = null;

        while(!q.isEmpty()){
            temp = q.peek();q.remove();
            if(temp.key==key){
                keyNode = temp;
            }
            if(temp.left!=null){
                q.add(temp.left);
            }
            if(temp.right!=null){
                q.add(temp.right);
            }
        }

        if(keyNode !=null){
            int x = temp.key;
            deleteDeepestNode(root,temp);
            keyNode.key = x;
        }
    }


    private static void deleteDeepestNode(Node root2, Node temp2) {
    }


  
}
