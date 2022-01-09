public class SudokuSolver {
    public static void main(String[] args) {
        int[][] board = new int[][]{
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };
        if(solver(board)){
            display(board);
        }
        else{
            System.out.println("no answers can be found");
        }
    }
    public static boolean solver(int[][] board){
        int n=board.length;
        int row=-1;
        int col=-1;
        boolean emptyLeft=true;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==0){
                    row=i;
                    col=j;
                    emptyLeft=false;
                    break;
                }
            }
            if(!emptyLeft)
                break;
        }
        if(emptyLeft){
            return true;
        }
        for(int number=1;number<=9;number++){
            if(isSafe(board,row,col,number)){
                board[row][col]=number;
                if(solver(board))
                    return true;
                else
                    board[row][col]=0;
            }
        }
        return false;
    }
    public static boolean isSafe(int [][]board,int row, int col, int num){
        for(int i=0;i<board.length;i++){
            if(board[row][i]==num)
                return false;
        }
        for(int i=0;i<board.length;i++){
            if(board[i][col]==num)
                return false;
        }
        int sqrt = (int)Math.sqrt(board.length);
        int start = row-row%3;
        int end=col-col%3;
        for(int i=start;i<start+sqrt;i++){
            for(int j=end;j<end+sqrt;j++){
                if(board[i][j]==num)
                    return false;
            }
        }
        return true;
    }
    public static void display(int[][]board){
        int rowCount=0;
        for(int[] nums:board){
            int colCount=0;
            for (int num:nums){
                colCount++;
                if(colCount%3==0&&colCount!=board.length)
                    System.out.print(num+" | ");
                else
                    System.out.print(num+" ");
            }
            rowCount++;
            if(rowCount%3==0&&rowCount!=board.length)
                System.out.print("\n---------------------");
            System.out.println();
        }
    }
}
