package Tictactoe;

public class Board {
    int size;
    PlayerPiece[][]grid;
    public Board(int size){
        this.size=size;
        grid=new PlayerPiece[size][size];
    }
}
