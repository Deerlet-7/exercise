package com.bit.operation;

import com.bit.book.Book;
import com.bit.book.BookList;

public class DelOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("请输入需要删除书籍名称：");
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
        int pos = i;
        for (int j = pos; j < bookList.getSize()-1; j++) {
            Book nextBook = bookList.getBook(j+1);
            bookList.setBook(j,nextBook);
        }
        bookList.setSize(bookList.getSize()-1);
        System.out.println("删除成功！");
    }
}
