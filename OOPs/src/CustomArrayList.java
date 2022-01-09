import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class CustomArrayList {
    private int[] data;
    private int size=0;
    private static int DEFAULT_SIZE=10;

    public CustomArrayList(){
        this.data=new int[DEFAULT_SIZE];
    }
    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++]=num;
    }
    public boolean isFull(){
        return size==data.length;
    }
    public void resize(){
        int[] temp = new int[2*data.length];
        for(int i=0;i<data.length;i++){
            temp[i]=data[i];
        }
        data=temp;
    }
    public int size(){
        return size;
    }
    public int remove(){
        data[size-1]=0;
        return data[size--];

    }
    public int get(int index){
        return data[index];
    }
    public void set(int index,int value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
//        CustomArrayList list = new CustomArrayList();
////        list.add(3);
////        list.add(4);
////        list.add(5);
////        list.add(6);
////        System.out.println(list.toString());
////        list.remove();
////        System.out.println(list.toString());
//        for (int i=0;i<12;i++){
//            list.add(1);
//        }
//        System.out.println(list.toString());
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        System.out.println(list);
//        Consumer<Integer> fun = (item)-> item=item*2;
        list.forEach((item)->item*=2);
        System.out.println(list);


    }
    public class MyException extends Exception{
        public MyException(String message){
            super(message);
        }

    }
}
