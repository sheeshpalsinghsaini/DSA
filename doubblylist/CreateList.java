package doubblylist;

public class CreateList {
    //create DLL Node 
    public static Node createNode(int data){
        return new Node(data);
    }

    //create DLL
    public static Node createList(int []nodes){
        Node head = null;
        Node temp = head;

        for(int i=0;i<nodes.length;i++){
            if(head==null){
                head = createNode(nodes[i]);
                temp = head;
            }else{
                Node t = createNode(nodes[i]);
                temp.next = t;
                t.prev = temp;
                temp = temp.next;
            }
        }
        return head;
    }
}
