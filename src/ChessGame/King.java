package ChessGame;
class King extends Piece{
    final private int DEFAULT_VALUE = 1000;

    // default constructor
    public King(){
        super(); // this will call the parent's constructor
    }

    public King(boolean isWhite){
        setValue(DEFAULT_VALUE);
        setIsWhite(isWhite);
    }
    @Override
    public void move() { System.out.println("One square"); }
    @Override
    public String toString() { return "King{value='" + getValue() + '\'' + '}'; }

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
