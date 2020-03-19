package ChessGame;

public class Position {
    private int row = 0, col = 0;

    public Position(int row, int col) {
        setRow(row);
        setCol(col);
    }

    public void setRow(int row) { this.row = (row>0 && row<8)?this.row=row:row; }
    public void setCol(int col) { this.col = (col>0 && col<8)?this.col=col:col; }
    public int getRow() { return this.row; }
    public int getCol() { return this.col; }
}
