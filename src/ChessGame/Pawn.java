package ChessGame;
class Pawn extends Piece{
    final private int DEFAULT_VALUE = 1;
    private Boolean promoted = false;
    private Piece newPiece = null;

    // default constructor
    public Pawn(){
        super(); // this will call the parent's constructor
    }

    public Pawn(boolean isWhite){
        setValue(DEFAULT_VALUE);
        setIsWhite(isWhite);
    }
    @Override
    public void move() { System.out.println("Forward 1"); }
    @Override
    public String toString() { return "Pawn{value='" + getValue() + '\'' + '}'; }

    public void setPromoted(Boolean promoted) { this.promoted = promoted; }
    public void setNewPiece(Piece piece) { this.newPiece = piece; }

    public boolean getPromoted() { return this.promoted; }
    public Piece getNewPiece(){ return this.newPiece; }

    public void promote(Piece newPiece) {
        this.setPromoted(true);
        this.setNewPiece(newPiece);
    }
    @Override
    public Boolean equals(Piece piece) {
        if (!super.equals(piece)) { return false; }
        return (this.getValue() == this.newPiece.getValue()) && (this.promoted == ((Pawn) piece).getPromoted());
    };

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
