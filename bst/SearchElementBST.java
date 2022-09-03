package bst;

public class SearchElementBST {

    
    
    public static void main(String[] args) {
        int []nodes = {15,7,4,5,9,21,18,34,8,13};
        Node root = null;
        for(int i=0;i<nodes.length;i++){
            root = insertBST(root, nodes[i]);
        }
        inOrder(root);
        System.out.println();

    }

    //insert node in BST
    public static Node insertBST(Node root,int data){
        if(root==null)
            return new Node(data);
        if(root.data>data)
            root.left = insertBST(root.left, data);
        if(root.data<data)
            root.right = insertBST(root.right, data);
        return root;
    }

    public static void inOrder(Node root){
        if(root!=null){
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
    }
}
