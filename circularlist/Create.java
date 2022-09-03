package circularlist;

public class Create {

    public static Node createNode(int data){
        return new Node(data);
    }

    //create circular list.
    public static Node createList(int []nodes){
        Node head = null;
        Node temp = head;

        for (int i = 0; i < nodes.length; i++) {
            if(head==null){
                head = createNode(nodes[i]);
                temp = head;
            }else{
                temp.next = createNode(nodes[i]);
                temp = temp.next;
            }
        }
        temp.next = head;
        return head;
    }
    
}
