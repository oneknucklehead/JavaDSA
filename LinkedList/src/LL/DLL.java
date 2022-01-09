package LL;

public class DLL {
    Node head;
    Node tail;
    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if(head!=null){
            head.prev=node;
        }
        head=node;
    }
    public void insertLast(int value){
        Node node = new Node(value);
        Node last = head;
        node.next = null;

        if(head==null){
            node.prev = null;
            head=node;
            return;
        }
        while(last.next!=null){
            last=last.next;
        }
        node.prev=last;
        last.next=node;

    }
    public void insert(int after,int value){
        Node temp = find(after);
        if(temp==null){
            System.out.println("Not in the list");
            return;
        }
        Node node = new Node(value);
        node.prev=temp;
        node.next = temp.next;
        temp.next=node;
        if(node.next!=null)
            node.next.prev=node;
    }
    public Node find(int value){
        Node node = head;
        while(node!=null){
            if(node.value==value)
                return node;
            node=node.next;
        }
        return null;
    }
    public void display(){
        Node node = head;
        Node last = head;
        while(node!=null){
            System.out.print(node.value+" -> ");
            last = node;
            node=node.next;
        }
        System.out.println("end");
        //Displaying in reverse
        while(last!=null){
            System.out.print(last.value+" -> ");
            last=last.prev;
        }
        System.out.println("start");

    }
    private class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
