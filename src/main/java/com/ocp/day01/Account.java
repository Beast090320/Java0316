package com.ocp.day01;

public class Account {
    private int balance; // 帳戶餘額
    
    //自行撰寫一個查詢帳戶餘額的方法
    int getBalance(){
        return balance; // 方法停止並回傳餘額(balance)
    };
    
    void withdow(int money){ // 提款方法
        if(money <= 0){
            System.out.println("提款金額不符!");
            return;
        }
        //驗證 money 是否大於 balance
        if(money > balance){
            System.out.println("帳戶餘額不足!");
            return;
        }
        balance -= money;
    }
    
    void deport(int money) { // 存款方法
        if(money <= 0){
            System.out.println("存款金額不符!");
            return;
        }
        balance += money;
    }
    
}
