package com.bit.operation;

import com.bit.book.BookList;

public class AddOperation implements IOperation{


    @Override
    public void work(BookList bookList) {
        System.out.println("请添加书籍");
        System.out.println("请输入图书名字");
        String name = scanner.next();
        System.out.println("请输入图书的作者");
        String author = scanner.next();
        System.out.println("请输入图书的价格");
        int price = scanner.nextInt();
        System.out.println("请输入图书的类型");
        String type = scanner.next();
        Book book = new Book(name,author,price,type);
    }
}
