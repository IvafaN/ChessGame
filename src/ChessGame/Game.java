package ChessGame;
import java.util.ArrayList;

public class Game {
    private ArrayList<Piece> pieces = new ArrayList<>();
    private Piece[][] board;

    public Game(){
        board = new Piece[8][8];
    }

    /**
     *
     * @param
     * @return
     */
    void createPieces(){
        Pawn    pawnA_W   = new Pawn(true);  Pawn    pawnB_W   = new Pawn(true);    Pawn    pawnC_W   = new Pawn(true);   Pawn    pawnD_W   = new Pawn(true);
        Pawn    pawnE_W   = new Pawn(true);  Pawn    pawnF_W   = new Pawn(true);    Pawn    pawnG_W   = new Pawn(true);   Pawn    pawnH_W   = new Pawn(true);
        Rook    rookA_W   = new Rook(true);  Knight  knightB_W = new Knight(true);  Bishop  bishopC_W = new Bishop(true); King    kingD_W   = new King(true);
        Queen   queenE_W  = new Queen(true); Bishop  bishopF_W = new Bishop(true);  Knight  knightG_W = new Knight(true); Rook    rookH_W   = new Rook(true);

        Pawn    pawnA_B   = new Pawn(false);  Pawn    pawnB_B   = new Pawn(false);    Pawn    pawnC_B   = new Pawn(false);   Pawn    pawnD_B   = new Pawn(false);
        Pawn    pawnE_B   = new Pawn(false);  Pawn    pawnF_B   = new Pawn(false);    Pawn    pawnG_B   = new Pawn(false);   Pawn    pawnH_B   = new Pawn(false);
        Rook    rookA_B   = new Rook(false);  Knight  knightB_B = new Knight(false);  Bishop  bishopC_B = new Bishop(false); King    kingD_B   = new King(false);
        Queen   queenE_B  = new Queen(false); Bishop  bishopF_B = new Bishop(false);  Knight  knightG_B = new Knight(false); Rook    rookH_B   = new Rook(false);

        pieces.add(pawnA_W); pieces.add(pawnB_W);   pieces.add(pawnC_W);   pieces.add(pawnD_W); pieces.add(pawnE_W);  pieces.add(pawnF_W);   pieces.add(pawnG_W);   pieces.add(pawnH_W);
        pieces.add(rookA_W); pieces.add(knightB_W); pieces.add(bishopC_W); pieces.add(kingD_W); pieces.add(queenE_W); pieces.add(bishopF_W); pieces.add(knightG_W); pieces.add(rookH_W);

        pieces.add(pawnA_B); pieces.add(pawnB_B);   pieces.add(pawnC_B);   pieces.add(pawnD_B); pieces.add(pawnE_B);  pieces.add(pawnF_B);   pieces.add(pawnG_B);   pieces.add(pawnH_B);
        pieces.add(rookA_B); pieces.add(knightB_B); pieces.add(bishopC_B); pieces.add(kingD_B); pieces.add(queenE_B); pieces.add(bishopF_B); pieces.add(knightG_B); pieces.add(rookH_B);

        Queen queen = new Queen(true);
        Position testPosition = new Position(3,10);
        if(queen.isValidMove(testPosition)){
            System.out.println("Yes, I can move there.");
        }
        else{
            System.out.println("Nope, can't do!");
        }
    }

    /**
     *
     * @param
     * @return
     */
    void createBoard(){
        // Ex.   ->   Exams/Week2/ArrayList
    }
    /**
     *
     * @param
     * @return
     */
    void showBoard(){
        // Ex.   ->   Exams/Week2/ArrayList
    }

    /**
     *
     * @param
     * @return
     */
    void showMenu(){
        // Ex.   ->   MiniProjects/MiniProject_II
    }


    /**
     *
     * @param
     * @return
     */
    String resignPlayer(){
        // Ex.   ->   Exams/Week2/ArrayList
        return "";
    }

    /**
     *
     * @param
     * @return
     */
    String possibleMoves(){
        return "";
    }


    /**
     *
     * @param
     * @return
     */
    String possibleMovesByPiece(){
        return "";
    }

    /**
     *
     * @param
     * @return
     */
    String showHelp(){
        return "";
    }


    /**
     *
     * @param
     * @return
     */
    public void start() {
        createPieces();
        createBoard();
        boolean play = true;
        while(play){
            showMenu();
        }
    }
}