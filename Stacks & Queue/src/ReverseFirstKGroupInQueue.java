import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirstKGroupInQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.add(7);
        queue.add(8);
        queue.add(9);
        System.out.println(queue);
        System.out.println(reverse(queue,4));

    }
    public static Queue reverse(Queue<Integer> queue,int k){
        Stack<Integer> st = new Stack<>();
        int n = queue.size();
        //adding first k elements to stack
        for(int i=0;i<k;i++){
            st.push(queue.remove());
        }
        for (int i=0;i<k;i++){
            queue.add(st.pop());
        }
        for (int i=0;i<n-k;i++){
            queue.add(queue.remove());
        }
        return queue;
    }
}
