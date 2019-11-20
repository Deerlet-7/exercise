package com.bit.book;

public class BookList {
    private Book[] books = new Book[10];
    private int size;//有效数据个数
    public BookList(){
        books[0] = new Book("三国演义","罗贯中",12,"小说");
        books[0] = new Book("西游记","吴承恩",11,"小说");
        books[0] = new Book("红楼梦","曹雪芹",21,"小说");
        this.size = 3;
    }
    public void setBooks(int pos,Book book){
        this.books[pos] = book;
    }
    public Book getBooks(int pos){
        return books[pos];
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
}
