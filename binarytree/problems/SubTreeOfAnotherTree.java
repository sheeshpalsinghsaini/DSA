package binarytree.problems;

import binarytree.basics.CreateBT;
import binarytree.basics.Node;
import binarytree.basics.Print;

public class SubTreeOfAnotherTree {

    public static boolean isIdentical(Node root,Node subRoot){
        if(root==null && subRoot==null)
            return true;
        if(root==null || subRoot==null)
            return false;
        if(root.data==subRoot.data)
            return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
        return false;
    }


    public static boolean isSubtree(Node root,Node subRoot){
        if(subRoot==null)
            return true;
        if(root==null)
            return false;
        if(root.data==subRoot.data){
            if(isIdentical(root,subRoot))
                return true;
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot); 
    }
    
    public static void main(String[] args) {
        
        int []nodes1 = {1,2,4,-1,-1,5,8,-1,-1,9,-1,-1,3,6,-1,-1,7,-1,-1};
        int []nodes2 = {5,8,-1,-1,9,-1,-1};


        CreateBT.index = -1;
        Node root1 = CreateBT.createTree(nodes1);
        CreateBT.index = -1;
        Node root2 = CreateBT.createTree(nodes2);
        Print.print(root1);  
        Print.preOrder(root1);
        System.out.println();
        Print.print(root2);

        System.out.println(isSubtree(root1,root2));

    }

}
