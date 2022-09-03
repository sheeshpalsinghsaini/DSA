package binarytree;
import binarytree.basics.ConstructTree;
import binarytree.basics.Node;
import binarytree.basics.TreeTraversal;



public class Test {
    public static void main(String[] args) {
        
        int []nodes = {1,2,4,-1,-1,-1,3,5,7,-1,-1,8,-1,-1,6,-1,-1};
        // int []nodes = {1,2,3,-1,-1,4,-1,-1,5,6,-1,-1,7,-1,-1};
        Node root = ConstructTree.constructByPreOrder(nodes);

        // TreeTraversal.preOrder(root);
        // System.out.println();
        TreeTraversal.levelOrder(root);
        System.out.println();
        
    }
}
