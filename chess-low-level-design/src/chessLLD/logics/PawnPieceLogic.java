package chessLLD.logics;

public class PawnPieceLogic implements PieceLogic {
    @Override
    public boolean isValidMove(String[][] board, int[] sourceIndex, int[] destIndex, boolean whoseMove) {

        int direction =  whoseMove ? -1:1 ;

        int row = sourceIndex[0] ;
        int col = sourceIndex[1] ;
        int destRow = destIndex[0] ;
        int destCol = destIndex[1] ;

        int frontRow = row + direction ;
        boolean isFrontEmpty = (frontRow >=0 && frontRow <= 8 );
        isFrontEmpty = isFrontEmpty && board[frontRow][col].equals("--" );

        int SecondRow = row + 2*direction ;
        boolean isSecondEmpty = (SecondRow >=0 && SecondRow <= 8 );
        isSecondEmpty = isSecondEmpty && board[SecondRow][col].equals("--" );


        if( col == destCol){

        // check 1 step
            if( destRow  == row + direction && isFrontEmpty)
                return true ;

            // check 2 step
            else if( destRow  == row + 2* direction && isFrontEmpty && isSecondEmpty){

                int startRow = whoseMove? 6:1 ;
                if(row == startRow)
                    return true ;

            }

        }

        if( destRow  == row + direction){

            // check right diagonal , check left diagonal
            if( destCol == col +1 || destCol == col -1){

                String pieceAtDest =  board[destRow][destCol];
                char opponentColor = pieceAtDest.charAt(0);
                char myColor = (whoseMove? 'W':'B') ;

                boolean isOpponent = ( opponentColor != myColor );

                return  isOpponent;

            }




        }




        return false;
    }
}
