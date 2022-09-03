package singlylist;

public class Insertion {
    
    // insert at the head
    public static Node insertHead(Node head,int data){
        Node newNode = CreateList.createNode(data);         //create a Node

        if(head==null)
            return newNode;
        newNode.next = head;
        return newNode;
    }

    //insert at the tail
    public static Node insertTail(Node head, int data){
        Node newNode = CreateList.createNode(data);

        if(head==null)
            return newNode;

        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
        return head;    
    }

    //insert after a specific node
    public static Node insertAfterGivenNode(Node head,int data,int node){
        Node newNode = CreateList.createNode(data);

        Node temp = head;

        while(temp!=null){
            if(temp.data==node){
                newNode.next = temp.next;
                temp.next = newNode;
                return head;
            }
            temp = temp.next;
        }
        System.out.println(node +" doesn't exist, please give a valid node");
        return head;
    }

    //insert after a given position
    public static Node insertAtPos(Node head,int data,int pos){
        Node newNode = CreateList.createNode(data);
        if(pos == 1){
            if(head == null)
                return newNode;
            newNode.next = head;
            return newNode;
        }else{
            //we assume linkedlist containe nodes more than position.
            Node temp = head;
            for(int i=1;i<pos-1 && temp!=null;i++){
                temp = temp.next;
            }
            if(temp==null){
                System.out.println("You are out of the range !!, we can't insert it");
                return head;
            }else{
                newNode.next = temp.next;
                temp.next = newNode;
            }
        }
        return head;
    }
}
