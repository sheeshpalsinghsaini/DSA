package singlylist;

public class CreateList {
    //create a new node 
    public static Node createNode(int data){
        return new Node(data);
    }
    //create linked list by array
    public static Node createList(int []nodes){
        Node head=null;
        Node temp=null;

        for(int i=0;i<nodes.length;i++){
            if(head==null){
                head = createNode(nodes[i]);
                temp = head;
            }else{
                temp.next = createNode(nodes[i]);
                temp = temp.next;
            }
        }

        return head;
    }
}
