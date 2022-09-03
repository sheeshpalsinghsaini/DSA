package binarytree.basics;

// import java.security.KeyStore.Entry;
// import java.util.ArrayDeque;
import java.util.ArrayList;
// import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class VerticalTraversal {
    public static void main(String[] args) {
        
        // int []nodes = {1,2,4,8,-1,-1,9,-1,-1,5,10,-1,-1,11,-1,-1,3,6,12,-1,-1,13,-1,-1,7,14,-1,-1,15,-1,-1};
        int []nodes = {10,20,-1,50,-1,40,-1,-1,30,-1,-1};
        // int []nodes = {1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
        Node root = ConstructTree.constructByPreOrder(nodes);
        TreeTraversal.levelOrder(root);
        System.out.println();
        System.out.println("-------------------------------");
        ArrayList<Integer> list = verticalTraversal(root);
        System.out.println(list);
    }

    public static ArrayList<Integer> verticalTraversal(Node root){
        Queue<Pair> q = new LinkedList<>();
        Map<Integer,ArrayList<Integer>> map = new TreeMap<>();  //we want key wise sorted map.

        q.add(new Pair(0,root));

        while(!q.isEmpty()){
            Pair curr = q.poll();
            if(map.containsKey(curr.hd)){
                // ArrayList<Integer> al = map.get(curr.hd);
                // al.add(curr.node.data);
                // map.put(curr.hd, al);
                map.get(curr.hd).add(curr.node.data);
            }else{
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(curr.node.data);
                map.put(curr.hd, temp);
            }
            if(curr.node.left!=null)
                q.add(new Pair(curr.hd-1, curr.node.left));
            if(curr.node.right!=null)
                q.add(new Pair(curr.hd+1, curr.node.right));
        }

        ArrayList<Integer> ans = new ArrayList<>();

        for(Map.Entry<Integer,ArrayList<Integer>> entry: map.entrySet()){
            // ans.addAll(entry.getValue());
            ArrayList<Integer> list = entry.getValue();
            Collections.sort(list);
            ans.addAll(list);
        }
        

        return ans;

    }
    static class Pair{
        int hd;
        Node node;
        public Pair(int hd,Node node){
            this.hd = hd;
            this.node = node;
        }
    }
}
