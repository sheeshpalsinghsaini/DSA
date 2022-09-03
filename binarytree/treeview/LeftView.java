package binarytree.treeview;
import java.util.HashMap;
import binarytree.basics.ConstructTree;
import binarytree.basics.Node;
import binarytree.basics.TreeTraversal;

public class LeftView {
    
    public static void main(String[] args) {
        
        int []nodes = {4,7,-1,-1,6,-1,2,5,-1,-1,1,3,-1,-1,-1};

        Node root = ConstructTree.constructByPreOrder(nodes);
        TreeTraversal.levelOrder(root);
        System.out.println();
        printLeftView(root);
        System.out.println();

    }
    
    public static void printLeftView(Node root){
       HashMap<Integer,Node> map = new HashMap<>();
    
        printLeftViewUntil(root,map,0);

        map.forEach((key,value)->{
            System.out.print(value.data+" ");
        });
        System.out.println();
    }


    public static void printLeftViewUntil(Node root,HashMap<Integer,Node> map,int level){
        if(root==null)
            return;
        
        if(!map.containsKey(level)){
            map.put(level, root);
        }

        printLeftViewUntil(root.left, map, level+1);        //first add left node,if not present then right.
        printLeftViewUntil(root.right, map, level+1);

    }
}
