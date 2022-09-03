package binarytree.basics;

public class BuildTreePreOrder {
    
    public static void main(String[] args) {
        int []nodes = {1,2,4,-1,-1,5,-1,3,-1,6,-1,-1};
        Node root =  buildTree(nodes);
        System.out.println(root.data);


    }

    //build binary tree by given preOrder sequence 
    static int index = -1;
    public static Node buildTree(int []nodes){
        index++;
        if(nodes[index]==-1){
            return null;
        }
 
        Node newNode = new Node(nodes[index]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);
        return newNode;

    }
    
   
     
}
