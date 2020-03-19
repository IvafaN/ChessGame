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
     * Check if the Position(newPosition) is a valid move for the Queen based on the Chess's rules
     *
     * @param newPosition is the new row and new col of the piece in the board
     * @return true if it's a valid move
     */
    @Override public boolean isValidMove(Position newPosition){
        if(!super.isValidMove(position))return false; // First call the parent's method to check for the board bounds

        // rules
        // R=R+-N
        // C=C+-N

        int newRow = newPosition.getRow();   int newCol = newPosition.getCol();
        int oldRow = this.position.getRow(); int oldCol = this.position.getCol();
        int movVertical   = oldCol - newCol;
        int movHorizontal = oldRow - newRow;

        setPosition(newPosition);
        return true;
    }
}
