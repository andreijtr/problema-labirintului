package com.sda.problema.labirintului;

public class Position {

    private int indexRow;
    private int indexCol;

    public Position(int indexRow, int indexCol) {
        this.indexRow = indexRow;
        this.indexCol = indexCol;
    }

    public Position() {
    }

    public int getIndexRow() {
        return indexRow;
    }

    public void setIndexRow(int indexRow) {
        this.indexRow = indexRow;
    }

    public int getIndexCol() {
        return indexCol;
    }

    public void setIndexCol(int indexCol) {
        this.indexCol = indexCol;
    }

    @Override
    public String toString() {
        return "(" + this.indexRow + "," + this.indexCol + ")";
    }
}
