package binarytree.basics;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTreeDemo {


    
    
    public static void main(String[] args) {
        System.out.println("Hi");
        Node root = buildTree();
        print(root);


    }

    public static Node buildTree(){
        
        System.out.println("Enter data ");
        int data = input().nextInt();
        if(data == -1)
            return null;
        Node root = new Node(data);
        System.out.println("Enter node for left "+data);
        root.left = buildTree();
        System.out.println("Enter node for right "+data);
        root.right = buildTree();

        return root;
        
    }

    // function for taking input from user
    public static Scanner input(){
        return new Scanner(System.in);
    }

    //print tree, level order traversal
    public static void print(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode==null){     //if currNode is null then
                if(q.isEmpty())
                    break;
                System.out.println();
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
