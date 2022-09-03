package binarytree.basics;

import java.util.LinkedList;
import java.util.Queue;

public class BuildTreePreOrderSeq {
    
    public static void main(String[] args) {
        System.out.println("Build Binary tree by preOrder traversal...");
        int[]nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root = buildTreePreOrderSeq(nodes);
        print(root);
    }

    static int index=-1;
    public static Node buildTreePreOrderSeq(int[]nodes){
        index++;
        if(nodes[index]==-1)
            return null;
        Node root = new Node(nodes[index]);
        
        root.left = buildTreePreOrderSeq(nodes);
        root.right = buildTreePreOrderSeq(nodes);
        return root;
    }

    public static void print(Node root){
        if(root==null) return;

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
