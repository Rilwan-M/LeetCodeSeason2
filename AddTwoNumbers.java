
class ListNode{

    int val;
    ListNode next;


    public ListNode(){}

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    public ListNode(int val, ListNode next){

        this.val = val;
        this.next = next;
    }


}


class SingleLinkedList {

    ListNode head;


    public ListNode append(int data){

        ListNode newNode = new ListNode(data);

        if(head==null){
            head = newNode;
            return null;
        }

        ListNode current = head;
        while(current.next != null){
            current = current.next;
        }

        current.next = newNode;

        return head;
    }


    public ListNode reverseAppend(int data){

     
        ListNode newNode = new ListNode(data);

        if(head == null){
            head = newNode;
            return null;
        }

        ListNode current = head;
        newNode.next = current;
        head = newNode;

        return head;
    }


    public int printLinkedList(){

        ListNode l1 = head;

        int val=0;
        while(l1 != null){

            val = val * 10 + l1.val;
            l1 = l1.next;
        
        }

        return val;

    }

    public void printList(ListNode l1){

        while(l1!=null){

            System.out.println(l1.val);
            l1 = l1.next;
        }
    }
}

public class AddTwoNumbers {



    public static void main(String[] args) {

        // ListNode l1 = new ListNode(5);

        // l1.next = new ListNode(8);
        // l1.next.next = new ListNode(4);

        // SingleLinkedList l1 = new SingleLinkedList();

        // l1.append(6);
        // l1.append(0);
        // l1.append(4);
        // System.out.println(l1.printLinkedList());


        SingleLinkedList l1 = new SingleLinkedList();

        l1.reverseAppend(7);
        ListNode value1 =  l1.reverseAppend(4); 
      
        SingleLinkedList l2 = new SingleLinkedList();

        l2.reverseAppend(5);
        l2.reverseAppend(5);
        ListNode value2 =  l2.reverseAppend(6);
    
        
        SingleLinkedList result = new SingleLinkedList();
        int sum=0, carry=0;
      
        ListNode resultHeadNode = null;
        while(value1 != null || value2 !=null){

            int val1 = (value1!=null) ? value1.val : 0;
            int val2 = (value2!=null) ? value2.val : 0;
            sum = val1 + val2 + carry;
            carry = sum / 10;
            sum = sum % 10;

            resultHeadNode = result.append(sum);
            if(value1!=null)
                value1=value1.next;

            if(value2!=null)
                value2=value2.next;
            sum =0;

            // carry=0;

        }

        if(carry>0){
            resultHeadNode = result.append(carry);

        }

        result.printList(resultHeadNode);



        

        


        


        
    }
    
}
