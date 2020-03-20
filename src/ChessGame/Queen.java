package ChessGame;
class Queen extends Piece{
    private int numMaxMovements = 7;
    private boolean isWhite = false;
    private String symbol = "", player = "";
    protected Position position;

    // default constructor
    public Queen(){
        super(); // this will call the parent's constructor
    }
    public Queen(String player, boolean isWhite, String symbol, Position position){
        setPlayer(player);
        setIsWhite(isWhite);
        setSymbol(symbol);
        setPosition(position);
        setNumMaxMovements(numMaxMovements);
    }

    /**
     * Setters...
     * Change(update) the values of number of movements, the player(String) and color(boolean), the position and the symbol.
     * Attributes of the "Queen"
     *
     * @param value, isWhite, position, symbol, player
     * @return
     */
    @Override protected void    setNumMaxMovements   (int value) { numMaxMovements    = value; }
    @Override protected void    setIsWhite (boolean isWhite)     { this.isWhite  = isWhite; }
    @Override protected void    setPosition(Position position)   { this.position = position; }
    @Override protected void    setSymbol  (String symbol)       { this.symbol   = symbol; }
    @Override protected void    setPlayer  (String player)       { this.player   = player; }

    /**
     * Getters...
     * Return the number of movements, the player(string) and color(boolean), the position and the symbol.
     * Attributes of the "Queen"
     *
     * @param
     * @return numMaxMovements, isWhite, position, symbol, player
     */
    @Override public    int      getNumMaxMovements() { return this.numMaxMovements; }
    @Override public    boolean  getIsWhite()         { return this.isWhite; }
    @Override public    Position getPosition()        { return this.position; }
    @Override public    String   getSymbol()          { return this.symbol; }
    @Override public    String   getPlayer()          { return this.player; }

    /**
     * Print the Queen's movement based on the Chess's rules
     *
     * @param
     * @return
     */
    @Override public void move() { System.out.println("Like bishop and rook"); }

    /**
     * Return the right symbol for the Queen
     *
     * @param
     * @return symbol(String)
     */
    @Override public String toString() { return getSymbol(); }

    /**
     * Check if one piece is equal to another piece
     *
     * @param piece is the other piece to be verified
     * @return true if they are equal piece(same attributes)
     */
    @Override public Boolean equals(Piece piece) {
        return (this.symbol  == piece.getSymbol()  &&
                this.isWhite == piece.getIsWhite() &&
                this.player  == piece.getPlayer() );
    }

    /**
     *
     * @param
     * @return
     */
    private boolean blockPiece(Piece[][] board, int movHorizontal, int movVertical, int oldRow, int oldCol, int newRow, int newCol){
        int maxMov = 0;
             if ((movHorizontal*-1) == (movVertical*-1)) maxMov = (movHorizontal<0)?(movHorizontal*-1):movHorizontal;
        else if ((movHorizontal*-1)  > (movVertical*-1)) maxMov = (movHorizontal*-1);
        else                                             maxMov = (movVertical  *-1);

             if (movHorizontal>0 && movVertical>0) { // LEFT UP
            for (int i = 1; i <= maxMov; i++)
                if (board[oldRow][oldCol].getPlayer() == board[oldRow - i][oldCol - i].getPlayer())
                    return true;
        }
        else if (movHorizontal>0 && movVertical<0) { // LEFT DOWN
            for (int i = 1; i <= maxMov; i++)
                if (board[oldRow][oldCol].getPlayer() == board[oldRow + i][oldCol - i].getPlayer())
                    return true;
        }
        else if (movHorizontal<0 && movVertical>0) { // RIGHT UP
            for (int i = 1; i <= maxMov; i++)
                if (board[oldRow][oldCol].getPlayer() == board[oldRow - i][oldCol + i].getPlayer())
                    return true;
        }
        else if (movHorizontal<0 && movVertical<0) { // RIGHT DOWN
            for (int i = 1; i <= maxMov; i++)
                if (board[oldRow][oldCol].getPlayer() == board[oldRow + i][oldCol + i].getPlayer())
                    return true;
        }
        else if (movHorizontal>0) { // LEFT
            for (int i = 1; i <= movHorizontal; i++)
                if (board[oldRow][oldCol].getPlayer() == board[oldRow][oldCol - i].getPlayer())
                    return true;
        }
        else if (movHorizontal<0) { // RIGHT
            for (int i = 1; i <= (movHorizontal * -1); i++)
                if (board[oldRow][oldCol].getPlayer() == board[oldRow][oldCol + i].getPlayer())
                    return true;
        }
        else if (movVertical>0) { // UP
            for (int i = 1; i <= movVertical; i++)
                if (board[oldRow][oldCol].getPlayer() == board[oldRow-i][newCol].getPlayer())
                    return true;
        }
        else if (movVertical<0) { // DOWN
            for (int i = 1; i <= (movVertical * -1); i++)
                if (board[oldRow][oldCol].getPlayer() == board[oldRow + i][newCol].getPlayer())
                    return true;
        }

        return false;
    }

    /**
     * Check if the Position(newPosition) is a valid move for the Queen based on the Chess's rules
     *
     * @param newPosition is the new row and new col of the piece in the board
     * @return true if it's a valid move
     */
    @Override public boolean isValidMove(Position newPosition, String player, Piece[][] board){
        if(!super.isValidMove(position, "",null))return false; // First call the parent's method to check for the board bounds
        // rules
        // R=R+-N
        // C=C+-N
        if (getPlayer()!=player)                                                           return false;
        int oldRow = this.position.getRow(), oldCol = this.position.getCol(),
            newRow = newPosition.getRow(),   newCol = newPosition.getCol(),
            movHorizontal = oldCol - newCol,
            movVertical   = oldRow - newRow;
        if (blockPiece(board, movHorizontal, movVertical, oldRow, oldCol, newRow, newCol)) return false;

        setPosition(newPosition);
        return true;
    }
}
