package ChessGame;
class Rook extends Piece{
    private int numMaxMovements = 7;
    private boolean isWhite = false;
    private String symbol = "", player = "";
    protected Position position;

    // default constructor
    public Rook(){
        super(); // this will call the parent's constructor
    }
    public Rook(String player, boolean isWhite, String symbol, Position position){
        setPlayer(player);
        setIsWhite(isWhite);
        setSymbol(symbol);
        setPosition(position);
        setNumMaxMovements(numMaxMovements);
    }

    @Override protected void    setNumMaxMovements   (int value) { numMaxMovements    = value; }
    @Override protected void    setIsWhite (boolean isWhite)     { this.isWhite  = isWhite; }
    @Override protected void    setPosition(Position position)   { this.position = position; }
    @Override protected void    setSymbol  (String symbol)       { this.symbol   = symbol; }
    @Override protected void    setPlayer  (String player)       { this.player   = player; }

    @Override public    int      getNumMaxMovements() { return this.numMaxMovements; }
    @Override public    boolean  getIsWhite()         { return this.isWhite; }
    @Override public    Position getPosition()        { return this.position; }
    @Override public    String   getSymbol()          { return this.symbol; }
    @Override public    String   getPlayer()          { return this.player; }

    @Override public void move() { System.out.println("Horizontally or vertically"); }
    @Override public String toString() { return getSymbol(); }
    @Override public Boolean equals(Piece piece) {
        return (this.symbol  == piece.getSymbol()  &&
                this.isWhite == piece.getIsWhite() &&
                this.player  == piece.getPlayer() );
    }
    @Override public boolean isValidMove(Position newPosition){
        if(!super.isValidMove(position))return false; // First call the parent's method to check for the board bounds

        // rules
        //  R=R-N	R=R+N	R=R		R=R
        //  C=C		C=C		C=C-N	C=C+C

        int newRow = newPosition.getRow();   int newCol = newPosition.getCol();
        int oldRow = this.position.getRow(); int oldCol = this.position.getCol();
        int movHorizontal   = oldCol - newCol;
        int movVertical = oldRow - newRow;

        if ((movHorizontal>0 && movVertical>0) ||
            (movHorizontal>0 && movVertical<0) ||

            (movHorizontal<0 && movVertical>0) ||
            (movHorizontal<0 && movVertical<0))
        return false;

        setPosition(newPosition);
        return true;
    }
}