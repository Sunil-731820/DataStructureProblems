package Tree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

public class TreeTraversing {
    public static void main(String[] args) {
        int Num = 7;
        int Root = 1;
        Vector<Vector<Integer>> adj = new Vector<Vector<Integer>>();
        for(int i=0;i<Num+1;i++){
            adj.add(new Vector<>());
        }

        System.out.println("the adjacent is ");
        System.out.println(adj);

        // Creating the tree 
        adj.get(1).add(2);
       adj.get(2).add(1);
       adj.get(1).add(3);
       adj.get(3).add(1);
       adj.get(1).add(4);
       adj.get(4).add(1);
       adj.get(2).add(5);
       adj.get(5).add(2);
       adj.get(2).add(6);
       adj.get(6).add(2);
       adj.get(4).add(7);
       adj.get(7).add(4);
        System.out.println("after adding the element in the tree is ");
        System.out.println(adj);

        // printing the parent node of the each tree
        System.out.println("the parent of the each node is ");
        printChildren(Root,adj,0);  
    }

    private static void printChildren(int Root, Vector<Vector<Integer>> adj, int i) {
        // Queue for BFS
        Queue<Integer> q = new LinkedList<>();
        // Pushing the root
        q.add(Root);

        // Visit array to keep track of nodes that have been visited

        int vis[] = new int[adj.size()];
        Arrays.fill(vis, 0);
        while(q.size()!=0){
            int node = q.peek();
            q.remove();
            vis[node] = 1;
            System.out.println(node + " ->");
            for(int j=0;j<adj.get(node).size();i++){
                if(vis[adj.get(node).get(j)]==0){
                    System.out.println(adj.get(node).get(j));
                    q.add(adj.get(node).get(j));
                }
            }
            System.out.println();
        }

    }
}
