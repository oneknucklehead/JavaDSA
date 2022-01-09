package LL;

public class Main {
    public static void main(String[] args) {
//        LL linkedList = new LL();
//        linkedList.insertFirst(3);
//        linkedList.insertFirst(6);
//        linkedList.insertFirst(9);
//        linkedList.insertFirst(12);
//        linkedList.insertLast(0);
//        linkedList.display();
//        linkedList.insert(4,3);
//        System.out.println(linkedList.delete(3));
//        linkedList.display();
        CLL list = new CLL();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        list.insertLast(6);
        list.display();
        list.delete(1);
        list.display();

    }
}
