
import java.util.Stack;

public class DeleteMiddleElementOfStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(4);
        st.add(5);
        st.add(6);
        st.add(7);
        st.add(8);
        st.add(9);
        deleteMid(st,st.size());
        System.out.println(st);
    }
    public static void deleteMid(Stack<Integer>s,int sizeOfStack){
        Stack<Integer> dummy = new Stack<>();
        int count=0;
        int mid = (int)Math.ceil(sizeOfStack/2);
        while(!s.isEmpty()){
            if(count==mid){
                s.pop();
            }
            else{
                dummy.push(s.peek());
                s.pop();
            }

            count++;
        }
        while(!dummy.isEmpty()){
            s.push(dummy.peek());
            dummy.pop();
        }
    }
}