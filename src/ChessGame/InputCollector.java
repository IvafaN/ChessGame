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
    public static String askInput(String prep) {
        System.out.println(prep);
        Scanner scanner = new Scanner(System.in);
        String prompt = scanner.nextLine();
        return prompt;
    }

    public void isWhiteMove(boolean isWhite) {
        if (isWhite) {
            System.out.println("White to move");
        } else {
            System.out.println("Black to move");
        }
    }
}
