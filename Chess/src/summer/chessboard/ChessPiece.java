package summer.chessboard;

import java.util.ArrayList;

public abstract class ChessPiece implements PieceCoordinator{
    private String color;
    private Position position;
    private ArrayList<String> legalMoves;
    
    /**
     *
     * @param row - row number
     * @param col - column number
     * @param color - color of piece as String
     * @throws Exception for position
     */
    protected ChessPiece(int row, int col, String color) throws Exception{
        this.color = color;
        this.position = new Position(row, col);
    }
    
    public String getColor() {
        return color;
    }
    
    public Position getPosition() {
        return position;
    }
    
    public ArrayList<String> getLegalMoves() {
        return legalMoves;
    }
    
    public void setLegalMoves(ArrayList<String> legalMoves) {
        this.legalMoves = legalMoves;
    }
    
    public void setPosition(Position position) {
        this.position = position;
    }
}
