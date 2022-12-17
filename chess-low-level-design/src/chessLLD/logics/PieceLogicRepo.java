package chessLLD.logics;

public class PieceLogicRepo {


    PieceLogic pawnPieceLogic ;

    PieceLogic rookLogic ;
    PieceLogic knightLogic ;
    PieceLogic bishopLogic ;
    PieceLogic queenLogic ;
    PieceLogic kingLogic ;

    public PieceLogicRepo(){
        pawnPieceLogic = new PawnPieceLogic();
        rookLogic = new RookLogic();
        knightLogic = new KnightLogic();
        bishopLogic = new BishopLogic();
        queenLogic = new QueenLogic();
        kingLogic = new KingLogic();
    }

    public PieceLogic getPieceLogic ( char pieceChar){

        switch (pieceChar){

            case 'P' :
                return pawnPieceLogic ;
            case 'R' :
                return rookLogic ;
            case 'N' :
                return knightLogic ;
            case 'B' :
                return bishopLogic ;
            case 'Q' :
                return queenLogic ;
            case 'K' :
                return kingLogic ;
        }

        return null ;
    }


}
