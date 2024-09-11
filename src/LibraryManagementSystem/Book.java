package LibraryManagementSystem;

import java.util.LinkedList;
import java.util.Queue;

public class Book {
    public Book() {
    }

    private String bookName;
    private boolean borrowed;
    private int row;
    private int col;
    private int shelf;
    Queue<User> waiting = new LinkedList<>();

    public Book(String bookName, int row, int col, int shelf) {
        this.bookName = bookName;
        this.row = row;
        this.col = col;
        this.shelf = shelf;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getShelf() {
        return shelf;
    }

    public void setShelf(int shelf) {
        this.shelf = shelf;
    }

    @Override
    public String toString() {
        return bookName+", "+row+", "+col;
    }
}
