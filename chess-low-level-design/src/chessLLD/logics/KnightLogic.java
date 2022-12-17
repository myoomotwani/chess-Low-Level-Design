package chessLLD.logics;

public class KnightLogic implements PieceLogic {
    @Override
    public boolean isValidMove(String[][] board, int[] sourceIndex, int[] destIndex, boolean whoseMove) {

        int row = sourceIndex[0] ;
        int col = sourceIndex[1] ;
        int destRow = destIndex[0] ;
        int destCol = destIndex[1] ;

        int rowDiff = Math.abs( destRow - row )  ;
        int colDiff = Math.abs( destCol - col ) ;

        if(rowDiff == 1 && colDiff == 2)
            return true ;
        if(rowDiff == 2 && colDiff == 1)
            return true ;


        return false;
    }
}
