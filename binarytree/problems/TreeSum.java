package binarytree.problems;

import binarytree.basics.ConstructTree;
import binarytree.basics.Node;
import binarytree.basics.TreeTraversal;

public class TreeSum {
    
    public static void main(String[] args) {
        int []nodes = {1,2,4,-1,-1,5,6,-1,-1,7,-1,-1,3,-1,-1};

        Node root = ConstructTree.constructByPreOrder(nodes);
        TreeTraversal.levelOrder(root);
        System.out.println();
        System.out.println("Sum :"+treeSum(root));

    }

    public static int treeSum(Node root){
        if(root == null)
            return 0;
        
            
        int leftSum = treeSum(root.left);
        int rightSum = treeSum(root.right);
        return leftSum+rightSum+root.data;
    }
}
