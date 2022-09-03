package circularlist;


public class Insertion {
    //insert at the head
    public static Node insertHead(Node head,int node){
        Node newNode = Create.createNode(node);
        if(head==null){
            newNode.next = newNode;
            return newNode;
        }

        // Node temp = head;

        // while(temp.next!=head){
        //     temp = temp.next;
        // }
        // temp.next = newNode;
        // newNode.next = head;
        // return newNode;

        newNode.data = head.data;
        head.data = node;
        newNode.next = head.next;
        head.next = newNode;

        return head;
    }

    //insert at the end
    public static Node insertTail(Node head,int node){
        Node newNode = Create.createNode(node);
        if(head==null){
            newNode.next =newNode;
            return newNode;
        }
        Node temp = head;

        while(temp.next!=head) temp = temp.next;
        temp.next = newNode;
        newNode.next = head;
        return head;
    }

    //insert at given position
    public static Node insertGivenPosition(Node head,int node,int pos){
        Node newNode = Create.createNode(node);
        if(pos==1 && head==null){
            newNode.next = newNode;
            return newNode;
        }
        
        if(pos==1){
            node = head.data;
            head.data = newNode.data;
            newNode.data = node;
            newNode.next = head.next;
            head.next = newNode;
            return head;
        }
        Node temp = head;

        for(int i=1;i<pos-1;i++){
            temp = temp.next;
        }

        if(temp.next==head){
            temp.next = newNode;
            newNode.next = head;
        }else{
            newNode.next = temp.next;
            temp.next = newNode;
            return head;
        }

        System.out.println("Position is not in the range..");
        return head;
        
    }
}
