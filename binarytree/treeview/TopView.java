package binarytree.treeview;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

import binarytree.basics.ConstructTree;
import binarytree.basics.Node;
import binarytree.basics.TreeTraversal;

public class TopView {
    
    public static void main(String[] args) {
        
        int []nodes = {1,2,-1,3,-1,4,-1,-1,-1};
        // int []nodes = {4,7,-1,-1,6,-1,2,5,-1,-1,1,3,-1,-1,-1};
        
        Node root = ConstructTree.constructByPreOrder(nodes);
        TreeTraversal.levelOrder(root);
        System.out.println();
        ArrayList<Integer> topView = new ArrayList<>();
        topView = topView(root);
        for(Integer item : topView){
            System.out.print(item+" ");
        }

        System.out.println();

    }

    public static ArrayList<Integer> topView(Node root){
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null) return ans;
        Map<Integer,Integer> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();

        q.add(new Pair(root, 0));

        while(!q.isEmpty()){
            Pair it = q.remove();
            int hd = it.hd;
            Node temp = it.node;

            if(map.get(hd)==null) 
                map.put(hd, temp.data);

            if(temp.left!=null)
                q.add((new Pair(temp.left, hd-1)));
            if(temp.right!=null)
                q.add(new Pair(temp.right, hd+1));
        }
        map.forEach((key,value)->{
            ans.add(value);
        });
        return ans;
    }

    static class Pair{
        int hd;
        Node node;

        Pair(Node node,int hd){
            this.node = node;
            this.hd = hd;
        }
    }
}
