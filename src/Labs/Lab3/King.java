package Labs.Lab3;
class King extends Piece{
    final private int DEFAULT_VALUE = 1000;
    public King(){
        setValue(DEFAULT_VALUE);
    }
    @Override
    public void move() { System.out.println("One square"); }
    @Override
    public String toString() { return "King{value='" + getValue() + '\'' + '}'; }
}
