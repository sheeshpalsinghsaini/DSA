package binarytree.basics;

import java.util.LinkedList;
import java.util.Queue;

public class TreeTraversal {
    
    /* there are lot of traversal technique in tree. but four are mostly used.
     *  1. PreOrder Traversal   :   RLR[root-left-right]
     *  2. InOrder Traversal    :   LRR[left-root-right]
     *  3. PostOrder Traversal  :   LRR[left-right-root]
     *  4. Level order traversal:   levey by level 
     * 
     * for testing use finger method : 
     *      1. preOrder : ->
     *      2. inOrder  : ^
     *      3. postOrder : <-
     * 
     */


     //preOrder traversal Tn = O(N)
     
     public static void preOrder(Node root){
        if(root!=null){
            System.out.print(root.data+" "); //print root
            preOrder(root.left);    //print left sub tree
            preOrder(root.right);   //print right sub tree
        }
     }

     //inOrder traversal   Tn = O(N)
     public static void inOrder(Node root){
        if(root!=null){
            inOrder(root.left);     //print left sub tree
            System.out.print(root.data+" "); //print root node
            inOrder(root.right);    //print right sub tree
        }
        System.out.println();
     }

     //postOrder traversal : Tn = O(N)
     public static void postOrder(Node root){
        if(root!=null){
            postOrder(root.left);   //print left sub tree
            postOrder(root.right);  //print right sub tree
            System.out.print(root.data+" "); //print right sub tree
        }
        System.out.println();
     }


     // level order traversal : we will use iterative method, Tn = O(N)
     public static void levelOrder(Node root){
        if(root==null)
            return ;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);        //for next line

        while(!q.isEmpty()){
            Node currNode = q.remove();
            // Node currNode = q.poll();
            if(currNode==null){
                System.out.println();
                if(q.isEmpty())
                    break;
                else
                    q.add(null);
            }else{
                System.out.print(currNode.data+" ");
                if(currNode.left!=null)
                    q.add(currNode.left);
                if(currNode.right!=null)
                    q.add(currNode.right);
            }
        }
     }
}
