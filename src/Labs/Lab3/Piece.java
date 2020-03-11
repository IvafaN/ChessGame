package Labs.Lab3;
abstract class Piece{
    private int Value = 0;
    private boolean IsWhite = false;

    public void setValue(int value)         { Value= value; }
    public void setIsWhite(boolean isWhite) { IsWhite = isWhite; }

    public int getValue()       { return Value; }
    public boolean getIsWhite() { return IsWhite; }

    public abstract void move();
    public abstract String toString();
    public Boolean equals(Piece piece) {
        return (this.Value == piece.Value) && (this.IsWhite == piece.IsWhite);
    }
}
