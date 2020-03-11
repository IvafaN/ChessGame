package Labs.Lab3;
import java.lang.reflect.Array;
import java.util.ArrayList;
public class Drive {
    public static void main(String[] args) {
        ArrayList<Piece> pieces = new ArrayList<>();
        Pawn    pawn   = new Pawn();    pieces.add(pawn);
        Knight  knight = new Knight();  pieces.add(knight);
        Bishop  bishop = new Bishop();  pieces.add(bishop);
        Rook    rook   = new Rook();    pieces.add(rook);
        Queen   queen  = new Queen();   pieces.add(queen);
        King    king   = new King();    pieces.add(king);

        for (Piece piece: pieces) { piece.move(); }

        Pawn p1 = new Pawn(); p1.setIsWhite(true); p1.promote(new Queen());
        Pawn p2 = new Pawn(); p2.setIsWhite(true);
        Pawn p3 = new Pawn();
        Pawn p4 = new Pawn(); p4.promote(new Queen());
        Pawn p5 = new Pawn(); p5.setIsWhite(true); p5.promote(new Knight());

        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p4));
        System.out.println(p1.equals(p5));
        System.out.println(p2.equals(p3));
        System.out.println(p4.equals(p5));
    }
}
