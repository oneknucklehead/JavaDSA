package LL;

public class CLL {
    Node head;
    Node tail;

    public void insertLast(int value){
        Node node = new Node(value);
        if(head==null){
            head=node;
            tail=node;
            return;
        }
        tail.next=node;
        node.next=head;
        tail=node;
    }
    public void delete(int val){
        Node node = head;
        if(node==null){
            return;
        }
        if(node.value==val){
            head=head.next;
            tail.next=head;
            return;
        }
        do{
            Node n= node.next;
            if(n.value==val){
                node.next=n.next;
                break;
            }
            node=node.next;
        }while(node!=head);
    }
    public void display(){
        Node node =head;
        do{
            System.out.print(node.value+" -> ");
            node=node.next;
        }while(node!=head);
        System.out.println("CLL continues");
    }
    public CLL() {
        this.head = null;
        this.tail = null;
    }

    private class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}
