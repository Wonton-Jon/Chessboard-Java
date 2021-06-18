package summer.chessboard;

public class Position {
    private int row;
    private int col;
    
    /**
     *
     * @param row
     * @param col
     * @throws Exception - if row or column are out of range (1-8)
     */
    public Position(int row, int col) throws Exception{
        ValidationException.checkNumberLimits("Row", row, 1, 8);
        ValidationException.checkNumberLimits("Column", col, 1, 8);
    
        this.row = row;
        this.col = col;
    }
    
    public int getCol() {
        return col;
    }
    
    public int getRow() {
        return row;
    }
    
    public void setCol(byte col) {
        this.col = col;
    }
    
    public void setRow(byte row) {
        this.row = row;
    }
}
