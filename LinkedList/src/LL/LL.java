package LL;

public class LL {
    private Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size=0;
    }
    public void insert(int value,int index){
        if(index<=0){
            insertFirst(value);
            return;
        }
        if(index>=size){
            insertLast(value);
            return;
        }
        Node temp = head;
        while (index!=1){
            temp=temp.next;
            index--;
        }
        Node newNode = new Node(value,temp.next);
        temp.next=newNode;
        size+=1;
    }
    public void insertFirst(int value){
        Node node = new Node(value);
        node.next=head;
        head=node;
        if(tail==null)
            tail=node;
        size+=1;
    }
    public void insertLast(int value){
        if(tail==null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next=node;
        tail=node;
        size+=1;

    }
    public int deleteFirst(){
        int val = head.value;
        if(head.next==null){
            tail=null;
        }
        head=head.next;
        size-=1;
        return val;
    }
    public int delete(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index==size-1){
            return deleteLast();
        }
        Node temp =get(index-1);
        int val = temp.next.value;
        temp.next= temp.next.next;
        size--;
        return val;
    }
    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node temp = get(size-2);
        int val = tail.value;
        tail=temp;
        tail.next=null;
        size--;
        return val;
    }
    private Node get(int index){
        Node temp = head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp;
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
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    private class Node{
        private int value;
        private Node next;
        public Node(int value){
            this.value = value;
        }
        public Node(int value,Node next){
            this.value = value;
            this.next = next;
        }
    }

}
