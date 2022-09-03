package binarytree.problems;

import binarytree.basics.ConstructTree;
import binarytree.basics.Node;
import binarytree.basics.TreeTraversal;

public class PrintLeafNodes {
    
    public static void main(String[] args) {
        
        int []nodes = {1,2,4,8,-1,-1,9,-1,-1,5,10,-1,-1,11,-1,-1,3,6,12,-1,-1,13,-1,-1,7,14,-1,-1,15,-1,-1};

        Node root = ConstructTree.constructByPreOrder(nodes);
        TreeTraversal.levelOrder(root);
        System.out.println();
        printLeafNodes(root);
        System.out.println();

    }

    public static void printLeafNodes(Node root){
        if(root.left==null && root.right==null){
            System.out.print(root.data+" ");
            return;
        }
        printLeafNodes(root.left);
        printLeafNodes(root.right);

    }
}
