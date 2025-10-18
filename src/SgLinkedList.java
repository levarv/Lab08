/**
 * Title: Lab 08
 * Date: 20251017
 * @author Ronald
 */


/*
 the directions call for a singly linked list, the LinkedList
 included in the java SE library is doubly-linked I think
 */
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

    public void add(int data) {

        Node n = new Node(data);
        if (head == null) {
            head = n;
            tail = n;
        } else {
            tail.next = n;
            tail = n;
        }


    }
    public int remove(){
        if (head == null)
            return -1;
        int data = head.data;
        head = head.next;
        return data;
    }


}
