package binarytree.problems;

import java.util.LinkedList;
import java.util.Queue;

import binarytree.basics.CreateBT;
import binarytree.basics.Node;
import binarytree.basics.Print;

public class SumKthLevel {
    
    
    public static void main(String[] args) {
        //consider root at level 0
        int k=2;
        int[]nodes = {1,2,4,-1,-1,5,8,12,-1,-1,-1,9,13,-1,-1,14,-1,-1,3,6,-1,-1,7,10,15,-1,-1,16,-1,-1,11,-1,-1};
        Node root = CreateBT.createTree(nodes);
        Print.print(root);
        int sum = sumKthLevel(root, 2);
        System.out.println("Sum of "+k+" level = "+sum);
    }

    public static int sumKthLevel(Node root,int k){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        int sum = 0;
        int count =0;
        if(count==k)
            return root.data;
        
        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode==null){
                if(count==k)    
                    break;
                count++;
                if(q.isEmpty())
                    break;
                q.add(null);
            }else{
                if(count==k){
                    sum += currNode.data;
                }
                if(currNode.left!=null)
                    q.add(currNode.left);
                if(currNode.right!=null)
                    q.add(currNode.right);
            }
        }
        return sum;
    }
}
