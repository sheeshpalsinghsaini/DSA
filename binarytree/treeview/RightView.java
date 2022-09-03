package binarytree.treeview;

import java.util.HashMap;

import binarytree.basics.ConstructTree;
import binarytree.basics.Node;
import binarytree.basics.TreeTraversal;

public class RightView {
    
    public static void main(String[] args) {
        int []nodes = {4,7,-1,-1,6,-1,2,5,-1,-1,1,3,-1,-1,-1};

        Node root = ConstructTree.constructByPreOrder(nodes);
        
        TreeTraversal.levelOrder(root);
        System.out.println();

        printRightView(root);
        
        System.out.println();

    }
    

    public static void printRightView(Node root){
        if(root==null)
            return;

        HashMap<Integer,Node> map = new HashMap<>();

        printRightViewUntil(root,map,0);
        map.forEach((key,value)->{
            System.out.print(value.data+" ");
        });
    }

    public static void printRightViewUntil(Node root,HashMap<Integer,Node> map, int level){
        if(root==null)
            return;

        if(!map.containsKey(level))
            map.put(level, root);

        printRightViewUntil(root.right, map, level+1);
        printRightViewUntil(root.left, map, level+1);
    }
}
