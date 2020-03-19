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
     *
     * @param
     * @return
     */
    @Override public void move() { System.out.println("One square"); }
    /**
     *
     * @param
     * @return
     */
    @Override public String toString() { return getSymbol(); }
    /**
     *
     * @param
     * @return
     */
    @Override public Boolean equals(Piece piece) {
        return (this.symbol  == piece.getSymbol()  &&
                this.isWhite == piece.getIsWhite() &&
                this.player  == piece.getPlayer() );
    }
    /**
     *
     * @param newPosition is the new row and new col of the board
     * @return if it's a valid move
     */
    @Override public boolean isValidMove(Position newPosition){
        if(!super.isValidMove(position))return false; // First call the parent's method to check for the board bounds

        // rules
        // R=R+-1
        // C=C+-1

        int newRow = newPosition.getRow();   int newCol = newPosition.getCol();
        int oldRow = this.position.getRow(); int oldCol = this.position.getCol();
        int movVertical   = oldCol - newCol;
        int movHorizontal = oldRow - newRow;

        if ((movHorizontal>1)||(movHorizontal<-1)) return false;
        if ((movVertical>1)||(movVertical<-1)) return false;

        setPosition(newPosition);
        return true;
    }
}
