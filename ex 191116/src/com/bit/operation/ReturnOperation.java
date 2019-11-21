package com.bit.operation;

import com.bit.book.Book;
import com.bit.book.BookList;

public class ReturnOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("请输入归还书籍名称：");
        String name = scanner.next();
        int i = 0;
        for (; i < bookList.getSize(); i++) {
            if(bookList.getBook(i).name.equals(name)){
                System.out.println(bookList.getBook(i));
                break;
            }
        }
        if(i>=bookList.getSize()){
            System.out.println("没有此书籍！");
            return;
        }
        Book book = bookList.getBook(i);
        if(book.isBorrowed){
            book.isBorrowed = false;
            System.out.println("书籍归还成功！");
        }else {
            System.out.println("归还失败！");
        }
    }
}
