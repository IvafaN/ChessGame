package ChessGame;

abstract class Piece{
    private int Value = 0;
    private boolean IsWhite = false;
    protected Position position;

    public void setValue(int value)         { Value= value; }
    public void setIsWhite(boolean isWhite) { IsWhite = isWhite; }

    public int getValue()       { return Value; }
    public boolean getIsWhite() { return IsWhite; }

    public abstract void move();
    public abstract String toString();
    public Boolean equals(Piece piece) {
        return (this.Value == piece.Value) && (this.IsWhite == piece.IsWhite);
    }


    public boolean isValidMove(Position newPosition){
        if(newPosition.getRow()>0 && newPosition.getCol()>0
                && newPosition.getRow()<8 && newPosition.getCol()<8){
            return true;
        }
        else{
            return false;
        }
    }

}
