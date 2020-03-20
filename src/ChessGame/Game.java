package ChessGame;
import java.util.ArrayList;

public class Game {
    private static final int MIN_ROW = 8, MIN_COL = 8;
    private static String player1 = "White", player2 = "Black", turn = "";
    private static int winPlayer1 = 0, winPlayer2 = 0;
    private ArrayList<Piece> pieces, piecesLostWhite, piecesLostBlack;
    private Piece[][] board, boardPrev;

    public Game(){
        board      = new Piece[MIN_ROW][MIN_COL];
        pieces     = new ArrayList<>();
        turn       = player2;
        piecesLostWhite = new ArrayList<>();
        piecesLostBlack = new ArrayList<>();
    }

    /**
     * calls all functions methods setting up the pieces, the board and showing the menu options
     * @param
     * @return
     */
    public void start() {
        setupPieces();
        setupBoard();
        showBoard();
        showMenu();
    }

 /////////////////////////////////////////////////////////////////// SETUP OPTIONS
    /**
     * This method sets the pieces starting every piece in their right positions on the board.
     * Black pieces and White pieces with the •
     * @param
     * @return
     */
    private void setupPieces(){
        pieces.add(new Rook  (player1, true, "♜", new Position(0, 0 )));
        pieces.add(new Knight(player1, true, "♞", new Position(0, 1 )));
        pieces.add(new Bishop(player1, true, "♝", new Position(0, 2 )));
        pieces.add(new Queen (player1, true, "♛", new Position(0, 3 )));
        pieces.add(new King  (player1, true, "♚", new Position(0, 4 )));
        pieces.add(new Bishop(player1, true, "♝", new Position(0, 5 )));
        pieces.add(new Knight(player1, true, "♞", new Position(0, 6 )));
        pieces.add(new Rook  (player1, true, "♜", new Position(0, 7 )));
        for (int i = 0; i < MIN_ROW; i++)   pieces.add(new Pawn      (player1,true, "♟", new Position(1, i )));

        for (int i = 2; i < 6; i++)
            for (int j = 0; j < MIN_COL; j++)
                pieces.add(new NullPiece ("• ", new Position(i, j)));

        for (int i = 0; i < MIN_ROW; i++)   pieces.add(new Pawn      (player2, false, "♙", new Position(6, i )));
        pieces.add(new Rook  (player2, false, "♖", new Position(7, 0 )));
        pieces.add(new Knight(player2, false, "♘", new Position(7, 1 )));
        pieces.add(new Bishop(player2, false, "♗", new Position(7, 2 )));
        pieces.add(new Queen (player2, false, "♕", new Position(7, 3 )));
        pieces.add(new King  (player2, false, "♔", new Position(7, 4 )));
        pieces.add(new Bishop(player2, false, "♗", new Position(7, 5 )));
        pieces.add(new Knight(player2, false, "♘", new Position(7, 6 )));
        pieces.add(new Rook  (player2, false, "♖", new Position(7, 7 )));
    }

    /**
     * Create a 2Dimensional array 8x8 which is the board
     * @param
     * @return
     */
    private void setupBoard(){
        int counter = 0;
        for (int i = 0; i < MIN_ROW; i++) {
            for (int j = 0; j < MIN_COL; j++) {
                board[i][j] = pieces.get(counter);
                counter++;
            }
        }
    }

 /////////////////////////////////////////////////////////////////// MENU OPTIONS
    /**
     * Call the menu options repetitive until the game finishes.
     * @param
     * @return
     */
    private void showMenu(){
        boolean on = true;
        while (on) {
            System.out.println("\n" + turn + " to move");
            String input = InputCollector.askInput("Enter UCI ( Type 'help' for help): ");
            switch (input) {
                case "help":   showHelp();      break;
                case "board":  showBoard();     break;
                case "resign": resignPlayer();  break;
                case "moves":  possibleMoves(); break;
                default:
                    if (getUCI(input)){
                        String winner = (turn==player1)?player2:player1;
                        System.out.printf("Game Over %s won by resignation", winner);
                        on=false;
                    }
                    break;
            }
        }
    }

    /**
     * Print the help options explained.
     * @param
     * @return
     */
    private static void showHelp(){
        System.out.println("* Type 'help' for help");
        System.out.println("* Type 'board' to see the board again");
        System.out.println("* Type 'resign' to surrender and quit the game");
        System.out.println("* Type 'moves' to list all possible moves");
        System.out.println("* Type a square (e.g b1, e2) to list all possible moves for that square");
        System.out.println("* Type UCI (e.g. b1c3, e7e8) to make a move");
    }

    /**
     * Print the board by reading the updated 2D array with all pieces and squares
     * @param
     * @return
     */
    private void showBoard(){
        int rowBoard = 8;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j].toString());
            }
            System.out.println(" "+rowBoard);
            rowBoard--;
        }
        System.out.println("A "+"B "+"C "+"D "+"E "+"F "+"G "+"H ");
    }

    /**
     * Print the winner and ask if you would like to start another chess match
     * @param
     * @return
     */
    private void resignPlayer(){
        System.out.printf("Game Over %s won\n", turn);
    }

    /**
     *
     * @param
     * @return
     */
    private void possibleMoves(){
        System.out.printf("{}");

        //Queen queen = new Queen(true);
        //Position testPosition = new Position(3,10);
        //if(queen.isValidMove(testPosition)) System.out.println("Yes, I can move there.");
        //else                                System.out.println("Nope, can't do!");
    }

 /////////////////////////////////////////////////////////////////// MENU OPTIONS
    /**
     * Call all methods of validations(such a valid's 1 move, valid player's turn and valid piece
     * @param UCI array position
     * @return true if all methods are true
     */
    private boolean mainValidations(int[] UCI){
        if (validateAtLeastOneMovement(UCI) &&
            validateNullPiece(UCI) &&
            validatePlayer())
            return true;
        else
            return false;
    }

    /**
     * Check if you entered at least 2 position(FROM square TO square) the "from" position and the "to" position
     * @param UCI array position
     * @return true if the user typed one movement
     */
    private boolean validateAtLeastOneMovement(int[] UCI){
        if (UCI[0] == UCI[2] && UCI[1] == UCI[3]){
            System.out.println("Invalid input, you didn't at least one movement of the piece\n");
            return false;
        }else return true;
    }

    /**
     *  This method checks if the "position"
     *  you are trying to move exists or it is just a empty square
     *  If it is a valid piece return true
     * @param UCI array position
     * @return true if the position is not empty(exist a piece)
     */
    private boolean validateNullPiece(int[] UCI){
        if (board[UCI[0]][UCI[1]].equals(
                new NullPiece("• ", new Position(UCI[0], UCI[1])))){
            System.out.println("Invalid piece, please try with a valid piece.\n");
            return false;
        }
        else{
            return true;
        }
    }

    /**
     *
     * @param
     * @return
     */
    private boolean validatePlayer(){
        return true; // PENDING
    }

    /**
     * Check if the UCI is a valid option or valid move's coordinates
     * @param UCI is the user typing
     * @return true if the UCI is valid
     */
    private boolean validateUCI(String [] UCI, String option){
        boolean flag1 = false;
        boolean flag2 = false;
        if ( UCI[0].toUpperCase().equals("A") || UCI[0].toUpperCase().equals("B") ||
                UCI[0].toUpperCase().equals("C") || UCI[0].toUpperCase().equals("D") ||
                UCI[0].toUpperCase().equals("E") || UCI[0].toUpperCase().equals("F") ||
                UCI[0].toUpperCase().equals("G") || UCI[0].toUpperCase().equals("H")) {
            if (Integer.parseInt(UCI[1]) <= MIN_ROW)
                flag1 = true;
        }

        if (option == "two-dimensional"){
            if ( UCI[2].toUpperCase().equals("A") || UCI[2].toUpperCase().equals("B") ||
                    UCI[2].toUpperCase().equals("C") || UCI[2].toUpperCase().equals("D") ||
                    UCI[2].toUpperCase().equals("E") || UCI[2].toUpperCase().equals("F") ||
                    UCI[2].toUpperCase().equals("G") || UCI[2].toUpperCase().equals("H")) {
                if (Integer.parseInt(UCI[3]) <= MIN_ROW)
                    flag2 = true;
                else
                    flag2 = false;
            }
            else
                flag2 = false;
        }
        return (flag1 && flag2);
    }
    /**
     *
     * @param
     * @return
     */
    private boolean isPromotePiece() {
        return false;
    }

 /////////////////////////////////// UCI, TURN AND COORDINATE OPTIONS
    /**
     * Read the UCI(letter a number) movement's position and convert to coordinates
     * in 2D array "e.g. a7a6 -> (a7)array[1][0] (a6)array[2][0]
     * @param UCI is the letter and number the user is typing "e.g. b1c4"
     * @return newUCI changed to position in array's number.
     */
    private int[] changeCoordinate(String [] UCI, String option){
        switch (UCI[0].toUpperCase()){
            case "A": UCI[0] = "0"; break; case "E": UCI[0] = "4"; break;
            case "B": UCI[0] = "1"; break; case "F": UCI[0] = "5"; break;
            case "C": UCI[0] = "2"; break; case "G": UCI[0] = "6"; break;
            case "D": UCI[0] = "3"; break; case "H": UCI[0] = "7"; break;
            default: System.out.println("Input out the range");    break;
        }
        switch (UCI[1]){
            case "1": UCI[1] = "7"; break; case "5": UCI[1] = "3"; break;
            case "2": UCI[1] = "6"; break; case "6": UCI[1] = "2"; break;
            case "3": UCI[1] = "5"; break; case "7": UCI[1] = "1"; break;
            case "4": UCI[1] = "4"; break; case "8": UCI[1] = "0"; break;
            default: System.out.println("Input out the range");    break;
        }
        if (option == "two-dimensional"){
            switch (UCI[2].toUpperCase()){
                case "A": UCI[2] = "0"; break; case "E": UCI[2] = "4"; break;
                case "B": UCI[2] = "1"; break; case "F": UCI[2] = "5"; break;
                case "C": UCI[2] = "2"; break; case "G": UCI[2] = "6"; break;
                case "D": UCI[2] = "3"; break; case "H": UCI[2] = "7"; break;
                default: System.out.println("Input out the range");    break;
            }
            switch (UCI[3]){
                case "1": UCI[3] = "7"; break; case "5": UCI[3] = "3"; break;
                case "2": UCI[3] = "6"; break; case "6": UCI[3] = "2"; break;
                case "3": UCI[3] = "5"; break; case "7": UCI[3] = "1"; break;
                case "4": UCI[3] = "4"; break; case "8": UCI[3] = "0"; break;
                default: System.out.println("Input out the range");    break;
            }
        }

        int[] newUCI = new int[UCI.length];
        newUCI[0]=Integer.parseInt(UCI[1]); // A = 0
        newUCI[1]=Integer.parseInt(UCI[0]); // 2 = 6
        newUCI[2]=Integer.parseInt(UCI[3]); // A = 0
        newUCI[3]=Integer.parseInt(UCI[2]); // 3 = 5
        // Ex. UCI = A2A3 / newUCI = 6050
        return newUCI;
    }

    /**
     *
     * @param
     * @return
     */
    private boolean eatPiece(int fromX, int fromY, int toX, int toY){
        if (board[toX][toY].getSymbol() == "♚" || board[toX][toY].getSymbol() == "♔"){
                return true;
        }
        else if (!board[toX][toY].equals(new NullPiece("• ", new Position(toX,toY)))){
            if (turn == player1) piecesLostWhite.add(board[toX][toY]);
            else                 piecesLostBlack.add(board[toX][toY]);
            board[toX][toY] = new NullPiece("• ", new Position(toX,toY));
            return false;
        }
        return false;
    }
    /**
     *
     * @param
     * @return
     */
    private boolean changePiece(int[] UCI){
        int fromX=UCI[0], fromY=UCI[1],
            toX  =UCI[2], toY  =UCI[3];
        if (eatPiece(fromX, fromY, toX, toY)) return true;
        else{
            boardPrev           = new Piece[1][1];
            boardPrev[0][0]     = board[toX][toY];
            board[toX][toY]     = board[fromX][fromY];
            board[fromX][fromY] = boardPrev[0][0];
            return false;
        }
    }

    /**
     * This method updates the player turn, if it's "White player" or "Black player"
     * @param
     * @return
     */
    private void changeTurn(){
        if (turn.equals(player1)) turn = player2;
        else                      turn = player1;
    }

    /**
     * This method validates the user's input by checking if the input has a valid move with the
     * right length of string and also calling the method to check if the input is a valid move for the
     * piece selected
     * It prints an error if it's an invalid input
     *
     * @param input is the user's input
     * @return
     */
    private boolean getUCI(String input) {
        String[] UCI = new String[input.length()];
        int[] newUCI = new int[input.length()];
        for (int i = 0; i < input.length(); i++) UCI[i] = input.substring(i,i+1);

        if (input.length()==4){
            if (!validateUCI(UCI, "two-dimensional")){
                System.out.println("Invalid input, values out range");
                return false;
            }
            newUCI = changeCoordinate(UCI, "two-dimensional");
            int fromX=newUCI[0], fromY=newUCI[1],
                    toX  =newUCI[2], toY  =newUCI[3];

            if (mainValidations(newUCI)){
                if (!board[fromX][fromY].isValidMove(new Position(toX,toY),turn, board)) {
                    System.out.println("Invalid movement, please try again");
                    return false;
                }
                if (changePiece(newUCI)) return true;
                else{
                    changeTurn();
                    showBoard();
                    return false;
                }
            }
        }
        else if(input.length()==2){
            changeCoordinate(UCI, "");
            return false;
        }
        else {
            System.out.println("Invalid input, please try again\n");
            return false;
        }
        return false;
    }
}