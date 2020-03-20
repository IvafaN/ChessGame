package ChessGame;
class King extends Piece{
    private int numMaxMovements = 1;
    private boolean isWhite = false;
    private String symbol = "", player = "";
    protected Position position;

    // default constructor
    public King(){
        super(); // this will call the parent's constructor
    }
    public King(String player, boolean isWhite, String symbol, Position position){
        setPlayer(player);
        setIsWhite(isWhite);
        setSymbol(symbol);
        setPosition(position);
        setNumMaxMovements(numMaxMovements);
    }

    /**
     * Setters...
     * Change(update) the values of number of movements, the player(String) and color(boolean), the position and the symbol.
     * Attributes of the "King"
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
     * Attributes of the "King"
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
     * Print the King's movement based on the Chess's rules
     *
     * @param
     * @return
     */
    @Override public void move() { System.out.println("One square"); }

    /**
     * Return the right symbol for the King
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
        if (board[oldRow][oldCol].getPlayer() == board[newRow][newCol].getPlayer()) return true;
        return false;
    }
    private boolean blockPieceRival(Piece[][] board, int movHorizontal, int movVertical, int oldRow, int oldCol, int newRow, int newCol){
        String player = board[oldRow][oldCol].getPlayer(); // Black - White
        if (player.equals("Black")){
            if (board[newRow][newCol].getPlayer() != "" && board[newRow][newCol].getPlayer() == "White")
                return true;
        }
        else{
            if (board[newRow][newCol].getPlayer() != "" && board[newRow][newCol].getPlayer() == "Black")
                return true;
        }
        return false;
    }

    /**
     * Check if the Position(newPosition) is a valid move for the King based on the Chess's rules
     *
     * @param newPosition is the new row and new col of the piece in the board
     * @return true if it's a valid move
     */
    @Override public boolean isValidMove(Position newPosition, String player, Piece[][] board){
        if(!super.isValidMove(position, "",null))return false; // First call the parent's method to check for the board bounds
        // rules
        // R=R+-1
        // C=C+-1
        if (getPlayer()!=player)                                                           return false;
        int oldRow = this.position.getRow(), oldCol = this.position.getCol(),
            newRow = newPosition.getRow(),   newCol = newPosition.getCol(),
            movHorizontal = oldCol - newCol,
            movVertical   = oldRow - newRow;

        if ((movHorizontal>1)||(movHorizontal<-1))                                         return false;
        if ((movVertical>1)||(movVertical<-1))                                             return false;
        if (blockPiece(board, movHorizontal, movVertical, oldRow, oldCol, newRow, newCol)) return false;

        //setPosition(newPosition);
        return true;
    }
}
