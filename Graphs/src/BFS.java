import java.util.*;

public class BFS {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i=0;i<=7;i++){
            adj.add(new ArrayList<>());
        }
        adj.get(1).add(2);

        adj.get(2).add(1);
        adj.get(2).add(3);
        adj.get(2).add(7);
        adj.get(3).add(2);
        adj.get(3).add(5);
        adj.get(4).add(6);
        adj.get(6).add(4);

        adj.get(5).add(3);
        adj.get(5).add(7);
        adj.get(7).add(2);
        adj.get(7).add(5);
    ArrayList<Integer> res = BFS(7,adj);
        System.out.println(res);
    }
    public static ArrayList<Integer> BFS(int v, ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> resBFS = new ArrayList<>();
        boolean[] vis = new boolean[v+1];
        for(int i=1;i<=v;i++){
            if(!vis[i]){
                //do bfs
                Queue<Integer> queue = new LinkedList<>();
                queue.add(i);
                vis[i]=true;

                //check adjacents
                while(!queue.isEmpty()){
                    int node = queue.poll();
                    resBFS.add(node);
                    for(int el:adj.get(node)){
                        if(!vis[el]){
                            vis[el]=true;
                            queue.add(el);
                        }
                    }
                }

            }
        }
        return resBFS;
    }
}
