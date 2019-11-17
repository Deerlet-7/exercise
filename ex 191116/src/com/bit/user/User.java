package com.bit.user;

import com.bit.operation.IOperation;

import java.util.Scanner;
import com.bit.book.BookList;

public abstract class User {
    protected String name;
    protected IOperation[] operations;
    public abstract int menu();
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的姓名：");
        String name = scanner.next();
        System.out.println("请输入你的身份：0：管理员  1：普通用户");
        int choice = scanner.nextInt();
        public void doOperation(int choice, BookList bookList) {
            operations[choice].work(bookList);
        }
    }



}
