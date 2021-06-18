package summer.chessboard;

public class ChessBoard {
    private ChessPiece[][] board = new ChessPiece[8][8];
    
    /**
     * Initialize board to null
     */
    public ChessBoard(){
        for(int i = 0; i < board.length; i++)
            for(int j = 0; j < board.length; j++)
                board[i][j] = null;
    }
    
    public ChessPiece[][] getBoard() {
        return board;
    }
    
    /**
     * Will initialize all pieces of the chessboard
     */
    public void initialize() throws Exception{
        //==================
        //Initialize PAWNS
        //==================
        for(int i = 0; i < board.length; i++){
            board[1][i] = new Pawn(1, i, "White");
            board[6][i] = new Pawn(6, i, "Black");
        }
        
        //     BLACK
        //7 r n b q k b n r
        //6 p p p p p p p p
        //5 n n n n n n n n
        //4 n n n n n n n n
        //3 n n n n n n n n
        //2 n n n n n n n n
        //1 p p p p p p p p
        //0 r n b q k b n r
        //  a b c d e f g h
        //     WHITE
    
        //==================
        //Initialize ROOKS
        //==================
        board[0][0] = new Rook(0 , 0 , "White");
        board[0][7] = new Rook(0 , 7 , "White");
    
        board[7][0] = new Rook(7 , 0 , "Black");
        board[7][7] = new Rook(7 , 7 , "Black");
    
        //==================
        //Initialize Knights
        //==================
        board[0][1] = new Knight(0 , 1 , "White");
        board[0][6] = new Knight(0 , 6 , "White");
    
        board[7][1] = new Knight(7 , 1 , "Black");
        board[7][6] = new Knight(7 , 6 , "Black");
    
        //==================
        //Initialize Bishops
        //==================
        board[0][2] = new Bishop(0 , 2 , "White");
        board[0][5] = new Bishop(0 , 5 , "White");
    
        board[7][2] = new Bishop(7 , 2 , "Black");
        board[7][5] = new Bishop(7 , 5 , "Black");
    
        //==================
        //Initialize Queens
        //==================
        board[0][3] = new Queen(0 , 3 , "White");
        board[7][3] = new Queen(7 , 3 , "Black");
    
        //==================
        //Initialize Kings
        //==================
        board[0][4] = new King(0 , 4 , "White");
        board[7][4] = new King(7 , 4 , "Black");
    }
    
    /**
     * @param fromPosition - where a piece is moving from
     * @param toPosition - where a piece is trying to move to
     * @return - if the piece was moved or not
     */
    public boolean movePiece(Position fromPosition, Position toPosition){
        return false;
    }
    
    /**
     * @return the chess board printed in the format below
     */
    //     BLACK
    //7 r n b q k b n r
    //6 p p p p p p p p
    //5 n n n n n n n n
    //4 n n n n n n n n
    //3 n n n n n n n n
    //2 n n n n n n n n
    //1 p p p p p p p p
    //0 r n b q k b n r
    //  a b c d e f g h
    //     WHITE
    @Override
    public String toString(){
        StringBuilder boardToString = new StringBuilder();
        int rowNum;
        
        boardToString.append(printColumnLetters());
        
        for (rowNum = board.length; rowNum > 0; rowNum--) {
            boardToString.append(printHorizontalBorder());
            boardToString.append(printSpaces(rowNum));
        }
        boardToString.append(printHorizontalBorder());
        boardToString.append(printColumnLetters());
        
        return boardToString.toString();
    }
    
    /**
     * @return - the row boarders as a string
     */
    private String printHorizontalBorder(){
        StringBuilder border = new StringBuilder();
        
        border.append("  ");
        
        for (int colNumber = 0; colNumber < board.length; colNumber++){
            border.append("+--");
        }
        border.append("+ ");
        border.append("\n");
        
        return border.toString();
    }
    
    /**
     * @param rowNumber- row of chessboard
     * @return - the spaces of the board
     */
    private String printSpaces(int rowNumber){
        StringBuilder borders = new StringBuilder();
    
        borders.append(rowNumber);
        borders.append(" ");
    
        for(int colNumber = 0; colNumber < board.length; colNumber++){
            borders.append("|");
            
            //Check if piece is null to print space or print unicode value
            if(board[rowNumber - 1][colNumber] != null)
                borders.append(board[rowNumber - 1][colNumber].toString());
            else
                borders.append("\u2001\u2001");
    
        }
        borders.append("| ");
        borders.append(rowNumber);
        borders.append("\n");
    
        return borders.toString();
    }
    
    /**
     * @return - column letters as a string
     */
    private String printColumnLetters(){
        StringBuilder letters = new StringBuilder();
        
        letters.append("   ");
        
        for(char letter = 'a'; letter <= 'h'; letter++) {
            letters.append(letter);
            letters.append("  ");
        }
        letters.append("\n");
        
        return letters.toString();
    }
    
}
