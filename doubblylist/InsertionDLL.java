package doubblylist;

public class InsertionDLL {
    
    //insert at the head
    public static Node insertHead(Node head,int data){
        Node newNode = new Node(data);

        if(head==null)
            return newNode;
        newNode.next = head;
        head.prev = newNode;
        return newNode;
    }

    //insert at the tail
    public static Node insertTail(Node head, int data){
        Node newNode = CreateList.createNode(data);

        Node temp = head;

        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
        return head;
    }

    // insert after given node
    public static Node insertAfterGivenNode(Node head,int node,int data){
        Node newNode = CreateList.createNode(data);
        Node temp = head;

        while(temp!=null){
            if(temp.data==node){
                if(temp.next==null){
                    temp.next = newNode;
                    newNode.prev = temp;
                }else{
                    temp.next.prev = newNode;
                    newNode.next = temp.next;
                    temp.next = newNode;
                    newNode.prev = temp;
                    return head;
                }
            }

            temp = temp.next;
        }
        System.out.println("Given node, not exist, we can not insert it.");
        return head;
    }

    //insert node at given position
    public static Node insertAtGivenPos(Node head,int data,int pos){
        Node newNode = CreateList.createNode(data);
        Node temp = head;
        if(pos==1){
            newNode.next = head;
            head.prev = newNode;
            return newNode;
        }
        for(int i=1;i<pos-1;i++){
            temp = temp.next;
        }

        if(temp.next==null){
            temp.next = newNode;
            newNode.prev = temp;
            return head;
        }else{
            newNode.next = temp.next;
            temp.next.prev = newNode;
            temp.next = newNode;
            newNode.prev = temp;
            return head;
        }

       

    }
}
