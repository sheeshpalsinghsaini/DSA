package binarytree.problems;

import binarytree.basics.Node;

public class SumTreeNodes {
    
    public static void main(String[] args) {
        int []nodes = {3,4,-1,5,-1,-1,2,1,9,-1,-1,-1,7,-1,-1};
        Node root = buildTree(nodes);
        print(root);
        System.out.println();
        int nodesSum = nodesSum(root);
        System.out.println("Sum of Nodes : "+nodesSum);
    }

    public static int nodesSum(Node root){
        if(root==null)
            return 0;

        int leftSum = nodesSum(root.left);
        int rightSum = nodesSum(root.right);

        return leftSum+rightSum+root.data;
    }
    

    //build tree 
    static int index=-1;
    public static Node buildTree(int[]nodes){
        index++;
        if(nodes[index]==-1)
            return null;
        
        Node root = new Node(nodes[index]);
        root.left = buildTree(nodes);
        root.right = buildTree(nodes);
        return root;
        
    }
    //print tree
    public static void print(Node root){
        if(root!=null){
            System.out.print(root.data+" ");
            print(root.left);
            print(root.right);
        }
    }

}
