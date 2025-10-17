
public class SgLinkedList{
    Node head;
    Node tail;

    public SgLinkedList(){
        head = null;
        tail = null;
    }

    public int peak(){
        return head.data;
    }

    public boolean hasNext(){
        if(head != null)
            return true;
    return false;
    }

    public void insert(int data) {

        Node n = new Node(data);
        n.next = null;
        if (head == null) {
            head = n;
            tail = n;
        } else {
            tail.next = n;
            tail = n;
        }


    }
    public int pop(){
        if (head == null)
            return -1;
        int data = head.data;
        head = head.next;
        return data;
    }


}
