package summer.chessboard;

import java.util.List;

public class Knight extends ChessPiece{
    /**
     * @param row   - row number
     * @param col   - column number
     * @param color - color of piece as String
     * @throws Exception for position
     */
    public Knight(int row, int col, String color) throws Exception {
        super(row, col, color);
    }
    
    @Override
    public List<String> findPossibleMoves(ChessBoard board) {
        return null;
    }
    
    @Override
    public List<String> getOutOfBounds(ChessPiece piece) {
        return null;
    }
    
    @Override
    public List<String> traverseEmptySpaces(ChessPiece piece, ChessBoard board) {
        return null;
    }
    
    /**
     *
     * @return unicode of chess piece based on color
     */
    @Override
    public String toString(){
        if(getColor().toLowerCase() == "white")
            return "\u2658";
        else
            return "\u265E";
    }
}
