package chessLLD.logics;

public class BishopLogic implements PieceLogic{

    @Override
    public boolean isValidMove(String[][] board, int[] sourceIndex, int[] destIndex, boolean whoseMove) {

        int row = sourceIndex[0] ;
        int col = sourceIndex[1] ;
        int destRow = destIndex[0] ;
        int destCol = destIndex[1] ;

        int[] dir = new int[]{0,0};

        int rowDiff =  destRow - row   ;
        int colDiff =  destCol - col  ;

        if(Math.abs(rowDiff)  != Math.abs(colDiff))
            return false ;

        int steps = Math.abs(rowDiff) ;

        dir[0] = rowDiff / steps ;
        dir[1] = colDiff / steps ;


        for(int i = 1 ; i < steps ; i++){
            int nextRow = row + i *dir[0] ;
            int nextCol = col + i *dir[1] ;

            if(!board[nextRow][nextCol].equals("--") )
                return false ;
        }

        return true;
    }
}
