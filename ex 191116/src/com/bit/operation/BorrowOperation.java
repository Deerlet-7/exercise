package com.bit.operation;

import com.bit.book.Book;
import com.bit.book.BookList;

public class BorrowOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("请输入需要借阅书籍名称：");
        String name = scanner.next();
        int i = 0;
        for (; i < bookList.getSize(); i++) {
            if(bookList.getBook(i).name.equals(name)){
                break;
            }
        }
        if(i>=bookList.getSize()){
            System.out.println("没有此书籍！");
            return;
        }
        Book book = bookList.getBook(i);
        if(book.isBorrowed){
            System.out.println("已经借出");
        }else {
            book.isBorrowed = true;
            System.out.println("书籍成功借阅！");
        }
    }
}
