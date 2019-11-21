package com.bit.book;

public class Book {
    public String name;
    public String author;
    public int price;
    public String type;
    public boolean isBorrowed;
    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ((isBorrowed == true)?"，已经被借出":"，可借阅")+
//                ", isBorrowed=" + isBorrowed +
                '}';
    }
    public Book(String name, String author, int price, String type) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.type = type;
    }
}
