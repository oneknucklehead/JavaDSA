import java.util.*;

public class Maze {
    public static void main(String[] args) {
//        System.out.println(mazePathCount(3,3));
//        path("",3,3);
        boolean[][] board = {
                {true,true,true},
                {true,true,false},
                {true,true,true},

        };
        pathRestriction("",board,0,0);
    }
    public static int mazePathCount(int r, int c){
        if(r==1||c==1){
            return 1;
        }
        int left=0,right=0;
         left =  mazePathCount(r-1,c);
         right =  mazePathCount(r,c-1);
         return left+right;
    }
    public static void path(String p,int r, int c){
         if(r==1&&c==1){
             System.out.println(p);
             return;
         }
         if(r>1){
             path(p+"D",r-1,c);
         }
         if (c>1){
             path(p+"R",r,c-1);
         }

    }
    public static ArrayList<String> pathRetList(String p, int r, int c){
        if(r==1&&c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if(r>1){
            ans.addAll(pathRetList(p+"D",r-1,c));
        }
        if (c>1){
            ans.addAll(pathRetList(p+"R",r,c-1));
        }
        return ans;
    }
    public static ArrayList<String> pathRetDiag(String p, int r, int c){
        if(r==1&&c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if(r>1&&c>1){
            ans.addAll(pathRetDiag(p+"D",r-1,c-1));
        }
        if(r>1){
            ans.addAll(pathRetDiag(p+"V",r-1,c));
        }
        if (c>1){
            ans.addAll(pathRetDiag(p+"H",r,c-1));
        }
        return ans;
    }
    public static void pathRestriction(String p, boolean[][] maze,int r, int c){
        if(r==maze.length-1&&c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        if(r<maze.length-1){
            pathRestriction(p+'D',maze,r+1,c);
        }
        if(c<maze[0].length-1){
            pathRestriction(p+'R',maze,r,c+1);
        }
    }
}
