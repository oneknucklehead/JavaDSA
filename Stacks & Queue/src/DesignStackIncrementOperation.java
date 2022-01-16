import java.util.*;
public class DesignStackIncrementOperation {
    class CustomStack {

        ArrayList<Integer> arr;
        int size;
        int maxSize;
        public CustomStack(int maxSize) {
            arr = new ArrayList<>(maxSize);
            size=0;
            this.maxSize = maxSize;
        }

        public void push(int x) {
            if(size!=maxSize)
            {arr.add(x);size++;}
        }

        public int pop() {
            if(arr.isEmpty()){
                return -1;
            }
            else{
                int popped = arr.get(arr.size()-1);
                arr.remove(arr.size()-1);
                size--;
                return popped;
            }
        }

        public void increment(int k, int val) {
            for(int i=0;i<k && i<arr.size();i++){
                arr.set(i,arr.get(i)+val);
            }
        }

    }
//    USING STACK
//    class CustomStack {
//        Stack<Integer> st;
//        int maxSize;
//        public CustomStack(int maxSize) {
//            this.st = new Stack<>();
//            this.maxSize = maxSize;
//        }
//
//        public void push(int x) {
//            if(st.size()==maxSize)
//                return;
//            else
//                st.push(x);
//        }
//
//        public int pop() {
//            return st.isEmpty()?-1:st.pop();
//        }
//
//        public void increment(int k, int val) {
//            Stack<Integer> dummy = new Stack<>();
//            while(!st.isEmpty()){
//                dummy.push(st.pop());
//            }
//            for(int i=0;i<k&&i<maxSize&&!dummy.isEmpty();i++){
//                st.push(dummy.pop()+val);
//            }
//            while(!dummy.isEmpty()){
//                st.push(dummy.pop());
//            }
//        }
//    }
}
