package ChessGame;

abstract class Piece{
    private int numMaxMovements = 0;
    private boolean isWhite = false;
    private String symbol = "", player = "";
    protected Position position;

    public Piece() { }
    /**
     * Abstract Setters
     * Update the data of the pieces by overriding those abstract setters
     *
     * @param numMaxMovements, isWhite, position, symbol, player
     * @return
     */
    protected abstract void setNumMaxMovements(int numMaxMovements);
    protected abstract void setIsWhite(boolean isWhite);
    protected abstract void setPosition(Position position);
    protected abstract void setSymbol(String symbol);
    protected abstract void setPlayer(String player);

    /**
     * Abstract Getters
     * Return the data of the pieces by overriding those abstract getters
     *
     * @param
     * @return numMaxMovements, isWhite, position, symbol, player
     */
    public abstract int      getNumMaxMovements();
    public abstract boolean  getIsWhite();
    public abstract Position getPosition();
    public abstract String   getSymbol();
    public abstract String   getPlayer();

    public abstract void move();
    public abstract String toString();

    public abstract Boolean equals(Piece piece);

    /**
     * Check if the Position(newPosition) is a valid move for that piece based on the board's limit
     * and the player's turn
     *
     * @param newPosition, player, board
     * @return true if it's a valid move
     */
    public boolean isValidMove(Position newPosition, String player, Piece[][] board){
        if(newPosition.getRow()>=0 && newPosition.getCol()>=0 &&
           newPosition.getRow()<8 && newPosition.getCol()<8){
            return true;
        }
        else{
            System.out.println("Invalid move, out of the border");
            return false;
        }
    }

}
