package summer.chessboard;

import java.util.List;

public interface PieceCoordinator {

    List<String> findPossibleMoves(ChessBoard board);

    List<String> getOutOfBounds(ChessPiece piece);

    List<String> traverseEmptySpaces(ChessPiece piece, ChessBoard board);

}
