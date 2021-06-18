package summer.chessboard;

public class Test {
    public static void main(String[] args) throws Exception {
        ChessBoard board = new ChessBoard();
        board.initialize();
        
        System.out.println(board.toString());
    }
}
