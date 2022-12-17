package chessLLD.logics;

public interface PieceLogic {

     boolean  isValidMove( String[][] board , int[] sourceIndex , int[] destIndex , boolean whoseMove);
}
