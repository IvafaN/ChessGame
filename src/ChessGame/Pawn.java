package ChessGame;
class Pawn extends Piece{
    private int numMaxMovements = 1;
    private boolean isWhite = false, firstMovement = false;
    private String symbol = "", player = "";
    protected Position position;

    // default constructor
    public Pawn(){
        super(); // this will call the parent's constructor
    }
    public Pawn(String player, boolean isWhite, String symbol, Position position){
        setPlayer(player);
        setIsWhite(isWhite);
        setSymbol(symbol);
        setPosition(position);
        setNumMaxMovements(numMaxMovements);
    }

    /**
     * Setters...
     * Change(update) the values of number of movements, the player(String) and color(boolean), the position and the symbol.
     * Attributes of the "Pawn"
     *
     * @param value, isWhite, position, symbol, player
     * @return
     */
    @Override protected void    setNumMaxMovements   (int value) { this.numMaxMovements    = value; }
    @Override protected void    setIsWhite (boolean isWhite)     { this.isWhite  = isWhite; }
    @Override protected void    setPosition(Position position)   { this.position = position; }
    @Override protected void    setSymbol  (String symbol)       { this.symbol   = symbol; }
    @Override protected void    setPlayer  (String player)       { this.player   = player; }

    /**
     * Getters...
     * Return the number of movements, the player(string) and color(boolean), the position and the symbol.
     * Attributes of the "Pawn"
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
     * Print the Pawn's movement based on the Chess's rules
     *
     * @param
     * @return
     */
    @Override public void move() { System.out.println("Forward 1"); }

    /**
     * Return the right symbol for the Pawn
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
     *
     * @param
     * @return
     */
    private boolean blockPiece(Piece[][] board, int movHorizontal, int movVertical, int oldRow, int oldCol, int newRow, int newCol){
        if (board[oldRow][oldCol].getPlayer() == board[newRow][newCol].getPlayer()) return true;
        return false;
    }

    /**
     * Check if the Position(newPosition) is a valid move for the Pawn based on the Chess's rules
     *
     * @param newPosition is the new row and new col of the piece in the board
     * @return true if it's a valid move
     */
    @Override public boolean isValidMove(Position newPosition, String player, Piece[][] board){
        if(!super.isValidMove(position, "",null))return false; // First call the parent's method to check for the board bounds
        // rules
        //	R=R+-1		R=R+-1		R=R+-2
        //		    	C=C+-1		C=C+-1
        if (getPlayer()!=player)                         return false;
        int oldRow = this.position.getRow(), oldCol = this.position.getCol(),
            newRow = newPosition.getRow(),   newCol = newPosition.getCol(),
            movHorizontal = oldCol - newCol,
            movVertical   = oldRow - newRow;

        if (player=="White"){
            if (newRow <= oldRow)                                                          return false; // down movement
            if ((newRow - oldRow) > numMaxMovements+1)                                     return false; // 3 up movements
            if ((newRow - oldRow) == numMaxMovements+1 && firstMovement)                   return false; // 2 movements after first move
        }
        else{
            if (newRow >= oldRow)                                                          return false; // down movement
            if ((oldRow - newRow) > numMaxMovements+1)                                     return false; // 3 up movements
            if ((oldRow - newRow) == numMaxMovements+1 && firstMovement)                   return false; // 2 movements after first move
        }
        if (newCol > oldCol+1 || newCol < oldCol-1)                                        return false; // 2 movements to the left or right
        if (blockPiece(board, movHorizontal, movVertical, oldRow, oldCol, newRow, newCol)) return false;

        setPosition(newPosition);
        firstMovement = true;
        return true;
    }

    //public void setPromoted(Boolean promoted) { this.promoted = promoted; }
    //public void setNewPiece(Piece piece) { this.newPiece = piece; }

    //public boolean getPromoted() { return this.promoted; }
    //public Piece   getNewPiece() { return this.newPiece; }

    //public void promote(Piece newPiece) {
    //    this.setPromoted(true);
    //    this.setNewPiece(newPiece);
    //}
    //@Override public Boolean equals(Piece piece) {
    //    if (!super.equals(piece)) { return false; }
    //    //    return (this.getValue() == this.newPiece.getValue()) && (this.promoted == ((Pawn) piece).getPromoted());
    //};
}
