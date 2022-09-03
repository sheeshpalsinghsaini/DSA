package binarytree.problems;

import java.util.LinkedList;
import java.util.Queue;

import binarytree.basics.Node;

public class TreeHeight {


    public static void main(String[] args) {
         int []nodes = {1,2,4,-1,-1,5,6,7,-1,-1,-1,-1,3,8,-1,-1,9,-1,10,-1,-1};

         Node root = buildTree(nodes);
         print(root);
         System.out.println();
         int height = height(root);
         System.out.println("Height of Tree : "+height);

    }

    //height of tree
    public static int height(Node root){

        if(root == null)
            return 0;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        
        int myHeight = Math.max(leftHeight,rightHeight)+1;
        return myHeight;
    }

    //print tree
    // public static void print(Node root){
    //     if(root!=null){
    //         System.out.print(root.data+" ");
    //         print(root.left);
    //         print(root.right);
    //     }
    // }
    public static void print(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode==null){
                if(q.isEmpty())
                    break;
                System.out.println();
                q.add(null);
            }else{
                System.out.print(currNode.data);
                if(currNode.left!=null)
                    q.add(currNode.left);
                if(currNode.right!=null)
                    q.add(currNode.right);
            }
        }
    }

    //build tree
    static int ind = -1;
    public static Node buildTree(int[]nodes){
        ind++;
        if(nodes[ind]==-1)
            return null;
        
        Node root = new Node(nodes[ind]);
        root.left = buildTree(nodes);
        root.right = buildTree(nodes);
        return root;
    }
}
