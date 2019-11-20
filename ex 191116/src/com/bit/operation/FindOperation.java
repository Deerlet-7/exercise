package com.bit.operation;

import com.bit.book.BookList;

public class FindOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("FindOperation");
    }
}
