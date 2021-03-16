package com.ocp.day01;
//銀行管理帳戶，主程式在Bank
public class Bank {
    public static void main(String[] args) {
        Account a01 = new Account(); //建立 a01 帳戶物件
        Account a02 = new Account(); //建立 a02 帳戶物件
        Account a03 = new Account(); //建立 a03 帳戶物件
        // 各帳戶第一次存款
        a01.deport(1000);
        a02.deport(2000);
        a03.deport(3000);
        System.out.printf("a01 帳戶餘額: $%,d\n",a01.getBalance());
        System.out.printf("a02 帳戶餘額: $%,d\n",a02.getBalance());
        System.out.printf("a03 帳戶餘額: $%,d\n",a03.getBalance());
        // 存款
        System.out.println("a01 存款 500 元後...");
        a01.deport(500);
        System.out.printf("a01 帳戶餘額: $%,d\n",a01.getBalance());
        // 提款
        System.out.println("a02 提款 800 元後...");
        a02.withdow(800);
        System.out.printf("a02 帳戶餘額: $%,d\n",a02.getBalance());
        System.out.println("a03 存款 -1200 元後...");
        //存款負數不執行
        a03.deport(-1200);
        System.out.printf("a03 帳戶餘額: $%,d\n", a03.getBalance());
        //提款
        System.out.println("a03 提款 -1200 元後...");
        a03.withdow(5000);
        System.out.printf("a03 帳戶餘額: $%,d\n", a03.getBalance());

    }   
        
}
