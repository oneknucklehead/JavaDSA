import java.util.Arrays;

public class CustomGenericArrayList<T> {
    private Object[] data;
    private int size=0;
    private static final int DEFAULT_SIZE=10;

    public CustomGenericArrayList(){
        this.data=new Object[DEFAULT_SIZE];
    }
    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++]=num;
    }
    public boolean isFull(){
        return size==data.length;
    }
    public void resize(){
        Object[] temp = new Object[2*data.length];
        for(int i=0;i<data.length;i++){
            temp[i]=data[i];
        }
        data=temp;
    }
    public int size(){
        return size;
    }
    public T remove(){
        data[size-1]=null;
        return (T)data[size--];

    }
    public T get(int index){
        return (T)data[index];
    }
    public void set(int index,T value){
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
        CustomGenericArrayList<Integer> list = new CustomGenericArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(list.toString());
    }
}
