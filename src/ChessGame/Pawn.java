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
     *
     * @param
     * @return numMaxMovements, isWhite, position, symbol, player
     */
    @Override public    int      getNumMaxMovements() { return this.numMaxMovements; }
    @Override public    boolean  getIsWhite()         { return this.isWhite; }
    @Override public    Position getPosition()        { return this.position; }
    @Override public    String   getSymbol()          { return this.symbol; }
    @Override public    String   getPlayer()          { return this.player; }

    @Override public void move() { System.out.println("Forward 1"); }
    @Override public String toString() { return getSymbol(); }
    @Override public Boolean equals(Piece piece) {
        return (this.symbol  == piece.getSymbol()  &&
                this.isWhite == piece.getIsWhite() &&
                this.player  == piece.getPlayer() );
    }
    @Override public boolean isValidMove(Position newPosition){
        if(!super.isValidMove(position))return false; // First call the parent's method to check for the board bounds

        // rules
        //	R=R+-1		R=R+-1		R=R+-2
        //		    	C=C+-1		C=C+-1

        int newRow = newPosition.getRow();   int newCol = newPosition.getCol();
        int oldRow = this.position.getRow(); int oldCol = this.position.getCol();

        if (getIsWhite()){
            // Rows
            if (newRow <= oldRow)                                        return false; // down movement
            if ((oldRow - newRow) < numMaxMovements+1)                   return false; // 3 up movements
            // Columns
            if (newCol > oldCol+1 || newCol < oldCol-1)                  return false; // 2 movements to the left or right
        }else{
            // Rows
            if (newRow >= oldRow)                                        return false; // down movement
            if ((oldRow - newRow) > numMaxMovements+1)                   return false; // 3 up movements
            // Columns
        }
        if (newCol > oldCol+1 || newCol < oldCol-1)               return false; // 2 movements to the left or right
        if ((oldRow - newRow) == numMaxMovements+1 && firstMovement) return false; // 2 movements after first move
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
