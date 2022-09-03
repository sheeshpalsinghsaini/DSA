"

What ?
    -> Linear data structure
    -> collection of nodes.
    -> node is a data and address of next node.

    Types of LinkedList:
        1. Single LL
        2. Doubly LL
        3. Circular LL
        4. Circular Doubly LL

    
    # Question of loop in linked list.
        1. check loop is present or not in LL.
            run to loop fast and slow if they meet any time then loop is present.
        2. find begning node of loop.
            when slow and fast meet stop loop and then run tow pointer from head and where they meet.
            now when they meet that would be the start node of linkedlist loop.
        3. remove loop in linkedlist
            stop before first node of loop[after inside loop] and put node.next ==null

    # Remove duplicate from sorted and unsorted linkedlist.
        1. remove from sorted.
            -> curr = head
                if((cur.next!=null)&&curr.data!=curr.next.data)
                    curr = curr.next
                else{
                    curr.next = curr.next.next;         //delete next node. which is same.
                }

        2. Remove duplicates from Unsorted LL.
            solution:1
                -> take a node and check whole LL if present then remove it.
                -> Tn = O(n^2)
            solution:2
                -> use hashmap and keep every node in the hashmap.
                    map.put(1,true) like is present then remote otherwise continue.

    # given circular linked list split it into two circular LL.

    # Sort 0,1,2 in LL.
        solution 1: using data replacement.
            -> count 0,1,2 and put in that time in LL>
        
            int zeroCount=0;
            int oneCount=0;
            int twoCount=0;

            Node temp = head;
            while(temp!=null){
                if(temp.data==0)
                    zeroCount++;
                else if(temp.data==1)
                    oneCount++;
                else if(temp.data==2)
                    twoCount++;
                temp = temp.next;
            }
            temp = head;
            while(temp!=null){
                if(zeroCount!=null)
                    temp.data = 0;zeroCount--;
                else if(oneCount!=null)
                    temp.data = 1;oneCount--;
                else if(twoCount!=null)
                    temp.data = 2;twoCount--;
            }
            return head;


            Solution: create three seperated LL for 0,1,2 and merge them


    # Merge two sorted LL.
        -> take a dummy node and add one by one all node which is less than other
            until anyone is not null
        -> if anyone null than add other whole LL to dummy end.
        -> return dummy.next;

        
     
    # Palindrome LL check
     Solution 1:   -> create arr and copy elements in it and check arr is palindrome or not
    
     solution 2: -> find middle and next LL 
                -> reverse LL after it
                -> and check each node.

    # Add 2 Numbers represented by linkedList
            head1->5->4->null
            head2->5->4->3->null
            return head->5->9->7->null

            reverse LL   and start adding 

    





































"