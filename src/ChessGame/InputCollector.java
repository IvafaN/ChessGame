package ChessGame;

import java.util.Scanner;

public class InputCollector {

    /**
     *
     * @param
     * @return
     */
    void isEmpty(){

    }

    /**
     *
     * @param
     * @return
     */
    void isACoordinate(){

    }

    /**
     *
     * @param
     * @return
     */
    void isAPiece(){

    }

    /**
     *
     * @param
     * @return
     */
    void isInstruction(){

    }
    /**
     * This method reads the user's input
     *
     * @param prep
     * @return what the user typed.
     */
    public static String askInput(String prep) {
        System.out.println(prep);
        Scanner scanner = new Scanner(System.in);
        String prompt = scanner.nextLine();
        return prompt;
    }

    /**
     * Prints the turn's color
     *
     * @param isWhite
     * @return
     */
    public void isWhiteMove(boolean isWhite) {
        if (isWhite) {
            System.out.println("White to move");
        } else {
            System.out.println("Black to move");
        }
    }
}
