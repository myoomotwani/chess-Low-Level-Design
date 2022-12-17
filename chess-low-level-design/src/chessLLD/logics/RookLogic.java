package chessLLD.logics;

public class RookLogic implements PieceLogic {
    @Override
    public boolean isValidMove(String[][] board, int[] sourceIndex, int[] destIndex, boolean whoseMove) {

        int row = sourceIndex[0] ;
        int col = sourceIndex[1] ;
        int destRow = destIndex[0] ;
        int destCol = destIndex[1] ;

        int[] dir = new int[]{0,0};

        int rowDiff =  destRow - row   ;
        int colDiff =  destCol - col  ;

        if(rowDiff != 0 && colDiff != 0)
            return false ;

        int steps = 0 ;
        if( colDiff == 0 ){
            dir[0] = rowDiff / Math.abs(rowDiff) ;
            steps = Math.abs(rowDiff);
        }


        if( rowDiff == 0 ){
            dir[1] = colDiff / Math.abs(colDiff) ;
            steps = Math.abs(colDiff);
        }

        for(int i = 1 ; i < steps ; i++){
            int nextRow = row + i *dir[0] ;
            int nextCol = col + i *dir[1] ;

            if(!board[nextRow][nextCol].equals("--") )
                return false ;
        }

        return true;
    }
}
