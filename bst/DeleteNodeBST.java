package bst;

public class DeleteNodeBST {
    

    //delete node from BST 
    public static Node delete(Node root,int data){
        if(root.data>data){
            root.left = delete(root.left,data);
        }else if(root.data<data){
            root.right = delete(root.right,data);
        }else{
            //case-1: no child
            if(root.left==null && root.right==null)
                return null;
            //case-2: one child
            if(root.left ==null)
                return root.right;
            else if (root.right==null)
                return root.left;
            //case-3: two child
                //1. find inOrder successor
            Node IS = inOrderSuccessor(root.right);//right inorder successor
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
        
    }

    public static Node inOrderSuccessor(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }
    public static void main(String[] args) {
        int []nodes = {34,12,23,21,14,45,43,67,32};
        Node root = null;
        for(int i=0;i<nodes.length;i++){
            root = insertBST(root, nodes[i]);
        }

        print(root);
        System.out.println();

        System.out.println();
        root = delete(root, 12);
        print(root);
        System.out.println();


    }

    //insert in BST 
    public static Node insertBST(Node root,int data){
        if(root==null)
            return new Node(data);
        
        if(root.data>data){
            root.left = insertBST(root.left, data);
        }
        if(root.data<data){
            root.right = insertBST(root.right,data);
        }
        return root;
    }

    public static void print(Node root){
        if(root!=null){
            print(root.left);
            System.out.print(root.data+" ");
            print(root.right);
        }
    }
}
