package chessLLD;


import chessLLD.logics.PieceLogic;
import chessLLD.logics.PieceLogicRepo;

public class Simulator {

    private String[][] board ;
    private boolean whoseMove ;
    private final static boolean WHITE_MOVE = true ;
    private final static boolean BLACK_MOVE = false ;
    PieceLogicRepo pieceLogicRepo ;

    public static void main(String[] args) {

         Simulator simulator = new Simulator();
         simulator.playTheGame();
    }

    void playTheGame(){

        BoardInitializer boardInitializer = new BoardInitializer();
        board = boardInitializer.initBoard();
        whoseMove = WHITE_MOVE ;

        pieceLogicRepo = new PieceLogicRepo();


        printTheBoard();



        makeAMove( new String[]{ "a2" , "a4"} );
        makeAMove( new String[]{ "a7" , "a6"} );
        makeAMove( new String[]{ "a4" , "a5"} );


        printTheBoard();


    }

    void printTheBoard(){
        System.out.println("Board is " );
        for(int i = 0 ; i < 8 ; i ++){
            for(int j = 0 ; j < 8 ; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println("");
        }


    }



    String[][] makeAMove(String[] move){
        System.out.println("Attempting a move from " + move[0] + " to " + move[1]);
        // if
        int[] sourceIndex = mapAnnotateToIndexes(move[0]);
        int[] destIndex = mapAnnotateToIndexes(move[1]);

        String sourcePiece = board [ sourceIndex[0]][sourceIndex[1]] ;
        String destPiece = board [ destIndex[0]][destIndex[1]] ;

        // if source piece = current move char  && dest piece char != current move char
        char currentMovePlayer =  (whoseMove == WHITE_MOVE ) ? 'W' : 'B' ;
        char sourcePiecePlayer =  sourcePiece.charAt(0);
        char destPiecePlayer =  destPiece.charAt(0);

        if( currentMovePlayer != sourcePiecePlayer || currentMovePlayer == destPiecePlayer )
            return null ;

        PieceLogic pieceLogic = pieceLogicRepo.getPieceLogic(sourcePiece.charAt(1));

        boolean isValidMove = pieceLogic.isValidMove(board , sourceIndex , destIndex ,whoseMove);

         if(!isValidMove)
            return null ;


        board [ destIndex[0]][destIndex[1]] = sourcePiece ;
        board [ sourceIndex[0]][sourceIndex[1]] = "--";
        whoseMove = ! whoseMove ;
        return board ;


    }

    int[] mapAnnotateToIndexes(String boardPos){

        int row = 8 - Integer.parseInt(boardPos.substring(1));
        int column = boardPos.charAt(0) - 'a';

        int[] arr = new int[]{ row , column};

        return  arr ;

    }

}
