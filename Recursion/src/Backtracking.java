import java.util.Arrays;

public class Backtracking {
    public static void main(String[] args) {
        boolean[][] board = {
                {true,true,true},
                {true,true,true},
                {true,true,true},

        };
        allPathsDisplay("",board,new int[board.length][board[0].length],0,0,1);
    }
    public static void allPaths(String p,boolean[][] maze ,int r , int c){
        if(r==maze.length-1&&c==maze[0].length-1){
                System.out.println(p);
                return;
            }
            if(!maze[r][c]){
                return;
            }
        maze[r][c]=false;
            if(r<maze.length-1){
                allPaths(p+'D',maze,r+1,c);
            }
            if(c<maze[0].length-1){
                allPaths(p+'R',maze,r,c+1);
            }
        if(r>0){
            allPaths(p+"U",maze,r-1,c);
        }
        if(c>0){
            allPaths(p+"L",maze,r,c-1);
        }
            maze[r][c]=true;
        }
        public static void allPathsDisplay(String p,boolean[][] maze ,int[][] path,int r , int c,int step){
            if(r==maze.length-1&&c==maze[0].length-1){

                path[r][c] =step;
                for (int[] arr:path){
                    System.out.println(Arrays.toString(arr));
                }
                System.out.println(p);
                System.out.println();
                return;
            }
            if(!maze[r][c]){
                return;
            }
            maze[r][c]=false;
            path[r][c] = step;
            if(r<maze.length-1){
                allPathsDisplay(p+'D',maze,path,r+1,c,step+1);
            }
            if(c<maze[0].length-1){
                allPathsDisplay(p+'R',maze,path,r,c+1,step+1);
            }
            if(r>0){
                allPathsDisplay(p+"U",maze,path,r-1,c,step+1);
            }
            if(c>0){
                allPathsDisplay(p+"L",maze, path,r,c-1,step+1);
            }
            maze[r][c]=true;
            path[r][c] = 0;
        }
    }
