package binarytree.problems;
import binarytree.basics.Node;

public class CountNodes {
    
    public static void main(String[] args) {
       
        int []nodes = {1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
        Node root = buildTree(nodes);
        print(root);
        System.out.println();
        int countNodes = countNodes(root);
        System.out.println("Total nodes in tree : "+countNodes);
    }



    //counts total nodes in tree : Tn : O(N)
    public static int countNodes(Node root){
        if(root==null)
            return 0;
        int leftNodes = countNodes(root.left);
        int rightNodes = countNodes(root.right);
        
        return leftNodes+rightNodes+1;
    }

    //print preOrder traversal
    public static void print(Node root){
        if(root!=null){
            System.out.print(root.data+" ");
            print(root.left);
            print(root.right);
        }
    }

    //build tree;
    static int index = -1;
    public static Node buildTree(int[]nodes){
        index++;
        if(nodes[index]==-1)
            return null;
        Node root = new Node(nodes[index]);
        root.left = buildTree(nodes);
        root.right = buildTree(nodes);
        return root;
    }
}
