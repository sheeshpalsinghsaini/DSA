package binarytree.basics;

import java.util.Scanner;

public class ConstructTree {

    public static Scanner input(){
        return new Scanner(System.in);
    }
    
    public static Node constructTree(){

        System.out.println("Enter data");
        int data = input().nextInt();

        if(data==-1)
            return null;

        Node root = new Node(data);
        System.out.println("Enter left for "+data);
        root.left = constructTree();
        System.out.println("Enter right for "+data);
        root.right = constructTree();

        return root;
    }

    public static int index = -1;
    public static Node constructByPreOrder(int []nodes){
        index++;
        if(nodes[index]==-1)
            return null;
        
        Node root = new Node(nodes[index]);
        root.left = constructByPreOrder(nodes);
        root.right = constructByPreOrder(nodes);
        return root;
    }

   


}
