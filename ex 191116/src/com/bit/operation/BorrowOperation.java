package com.bit.operation;

import com.bit.book.BookList;

public class BorrowOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("BorrowOperation");
        System.out.println("输入需要借阅书籍的名称");
        String name = scanner.next();
        //不会从bookList-》进行删除-》isBorrowed true
        //1、找这本书 是否存在
        //2、他是否被借出   false  可以借
    }
}
