public class WordSearch {
    public boolean exist(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    visited[i][j]=true;
                    if(path(board,visited,i,j,1,word))return true;
                    visited[i][j]=false;
                }
            }
        }
        return false;
    }
    public static boolean path(char[][] board,boolean[][] visited, int row, int col,int index,String s){
        if(index==s.length())
            return true;
        //check up
        if(row>0&&board[row-1][col]==s.charAt(index)&&!visited[row-1][col]){
            visited[row][col]=true;
            if(path(board,visited,row-1,col,index+1,s))return true;
            visited[row][col]=false;
        }
        //check down
        if((row<(board.length-1)) && (board[row+1][col]==s.charAt(index)) && (!visited[row+1][col])){
            visited[row][col]=true;
            if(path(board,visited,row+1,col,index+1,s))return true;
            visited[row][col]=false;
        }
        //check left
        if(col>0&&board[row][col-1]==s.charAt(index)&&!visited[row][col-1]){
            visited[row][col]=true;
            if(path(board,visited,row,col-1,index+1,s))return true;
            visited[row][col]=false;
        }
        //check right
        if((col<board[0].length-1) && (board[row][col+1]==s.charAt(index)) && (!visited[row][col+1])){
            visited[row][col]=true;
            if(path(board,visited,row,col+1,index+1,s))return true;
            visited[row][col]=false;
        }
        return false;
    }
}
