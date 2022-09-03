package binarytree.problems;

import java.util.LinkedList;
import java.util.Queue;

import binarytree.basics.Node;

public class TreeDiameter {
    
    //diameter of tree : no of nodes in the longest path between any 2 nodes.
    //two possibility : through root, not through root.
    //approach : 1
    public static int diameter(Node root){  //Tn = O(n^2)
        if(root ==null) return 0;

        int diam1 = diameter(root.left);
        int diam2 = diameter(root.right);
        int diam3 = TreeHeight.height(root.left)+ TreeHeight.height(root.right)+1;

        return Math.max(diam3, Math.max(diam1, diam2));
    }


    //approach : 2, calculater height parallaly. Tn = O(n);
    static class TreeInfo{
        int height;
        int diam;
        TreeInfo(int height,int diameter){
            this.height = height;
            this.diam = diameter;
        }
    }
    public static TreeInfo diameter2(Node root){

        if(root==null)
            return new TreeInfo(0, 0);

        TreeInfo left= diameter2(root.left);
        TreeInfo right = diameter2(root.right);
        int myHeight = Math.max(left.height, right.height)+1;

        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.height+right.height+1;
        
        int mydiam = Math.max(Math.max(diam1, diam2), diam3);
        TreeInfo myInfo = new TreeInfo(myHeight, mydiam);
        return myInfo;

    }
    public static void main(String[] args) {
        
        int []nodes = {1,2,4,-1,-1,5,6,7,-1,-1,-1,-1,3,8,-1,-1,9,-1,10,-1,-1};
        Node root = buildTree(nodes);
        print(root);
        // int diameter = diameter(root);
        System.out.println("Diameter : "+diameter2(root).diam);


    }

    //build tree
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

    //print tree
    public static void print(Node root){
        if(root==null) return ;
        Queue<Node> q = new LinkedList<>();

        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currNode = q.remove();

            if(currNode==null){
                System.out.println();
                if(q.isEmpty())
                    break;
                q.add(null);
            }else{
                System.out.print(currNode.data+" ");
                if(currNode.left!=null)
                    q.add(currNode.left);
                if(currNode.right!=null)
                    q.add(currNode.right);
            }
        }
        System.out.println();
    }

}
