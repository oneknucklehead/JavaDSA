public class CheckIfNandItsDoubleExist {
    //O(n) solution
    class Solution {
        public boolean checkIfExist(int[] arr) {

            boolean[] pos = new boolean[ 10001 ] ;
            boolean[] neg = new boolean[ 10001 ] ;
            int zro = 0 ;

            for( int i : arr ){

                if( i < 0 ){
                    neg[ -i*2 ] = true ;
                }

                else if( i > 0 ) {
                    pos[ i*2 ] = true ;
                }
                else{
                    zro++ ;
                    if( zro == 2 ){
                        pos[ i ] = true ;
                    }
                }
            }

            for( int i: arr ){

                if( i >= 0 && pos[ i ] ) {
                    return true ;
                }

                else if( i < 0 && neg[ -i ] ){
                    return true ;
                }
            }
            return false ;
        }
    }
}
