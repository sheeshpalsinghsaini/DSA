package bst;

public class BuildBinarySearchTreeDemo {
    
    public static Node insertBST(Node root,int data){
        if(root==null) 
            return new Node(data);
        if(root.data>data){
            root.left = insertBST(root.left, data);
        }else{
            root.right = insertBST(root.right, data);
        }
        return root;
    }

    //inOrder traversal
    public static void inOrder(Node root){
        if(root!=null){
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
    }

    public static void main(String[] args) {
        int[] nodes = {5,1,3,4,2,7};
        Node root = null;
        for(int i=0;i<nodes.length;i++){
            root = insertBST(root, nodes[i]);
        }
        inOrder(root);
        System.out.println();
    }
}
