package Tictactoe;

public class PlayerPiece {
    PieceType pieceType;
    PlayerPiece(PieceType pieceType){
        this.pieceType=pieceType;
    }
    public PieceType getType(){
        return pieceType;
    }
}
