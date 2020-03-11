package ChessGame;
class Knight extends Piece{
    final private int DEFAULT_VALUE = 2;

    // default constructor
    public Knight(){
        super(); // this will call the parent's constructor
    }

    public Knight(boolean isWhite){
        setValue(DEFAULT_VALUE);
        setIsWhite(isWhite);
    }
    @Override
    public void move() { System.out.println("Like an L"); }
    @Override
    public String toString() { return "Knight{value='" + getValue() + '\'' + '}'; }

    @Override
    public boolean isValidMove(Position newPosition){
        // First call the parent's method to check for the board bounds
        if(!super.isValidMove(position)){
            return false;
        }

        // If we passed the first test then check for the specific rook movement
        if(newPosition.getCol() == this.position.getCol() || newPosition.getRow() == this.position.getCol()){
            return true;
        }
        else{
            return false;
        }
    }
}
