package ChessGame;

abstract class Piece{
    private int numMaxMovements = 0;
    private boolean isWhite = false;
    private String symbol = "", player = "";
    protected Position position;

    public Piece() { }
    protected abstract void setNumMaxMovements(int numMaxMovements);
    protected abstract void setIsWhite(boolean isWhite);
    protected abstract void setPosition(Position position);
    protected abstract void setSymbol(String symbol);
    protected abstract void setPlayer(String player);

    public abstract int      getNumMaxMovements();
    public abstract boolean  getIsWhite();
    public abstract Position getPosition();
    public abstract String   getSymbol();
    public abstract String   getPlayer();

    public abstract void move();
    public abstract String toString();

    public abstract Boolean equals(Piece piece);
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
