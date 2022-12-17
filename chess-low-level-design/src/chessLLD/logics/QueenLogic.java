package chessLLD.logics;

public class QueenLogic implements PieceLogic {
    @Override
    public boolean isValidMove(String[][] board, int[] sourceIndex, int[] destIndex, boolean whoseMove) {

        BishopLogic bishopLogic = new BishopLogic();
        RookLogic rookLogic = new RookLogic();

        if( bishopLogic.isValidMove(board , sourceIndex , destIndex ,whoseMove))
            return true ;
        if( rookLogic.isValidMove(board , sourceIndex , destIndex ,whoseMove))
            return true ;

        return false;
    }
}
