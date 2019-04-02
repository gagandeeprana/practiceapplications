package linkedlist;

public class LinkedList {
    
    Node head;
    
    static class Node {

        Node next;
        int data;
        
        public Node(int data) {
            this.data = data;
        }
    } 
    
    public static void main(String[] args) {
        
        //created custom linked list
        LinkedList ll = new LinkedList();
        //initialized the (first) head node of custom linked linked
        ll.head = new Node(1);
        //created & initialized the second node
        Node second = new Node(2);
        //created & initialized the third node
        Node third = new Node(3);
        
        //linked second node with first
        ll.head.next = second;
        //linked third node with second
        second.next = third;

//        ll.printList();
        ll.push(4);
//        ll.printList();
        Node newNode = ll.head;
        ll.pushAtAnyLocation(newNode, 5);
        ll.printList();
        ll.pushAtEnd(6);
        ll.printList();
    }
    
    public void printList() {
        
        System.out.println("-----------------------------");
        Node n = head;
        while(n != null) {
            
            System.out.println(n.data);
            n = n.next;
        }
        System.out.println("-----------------------------");
        
    }
    
    public void push(int newData) {
        
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }
    
    public void pushAtAnyLocation(Node prevNode, int newData) {
        
        Node newNode = new Node(newData);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }
    
    public void pushAtEnd(int newData) {
        
        Node newLastNode = new Node(newData);
        
        Node n = head;
        while(n.next != null) {
            n = n.next;
        }
        
        n.next = newLastNode;
    }
}
