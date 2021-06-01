package com.ocp.day30_thread;

import java.util.Random;

class Account {

    private int balance; // 帳戶餘額

    public Account(int balance) {
        this.balance = balance;
    }

    public synchronized void withdraw(int cash) throws Exception { // 提款方法
        String name = Thread.currentThread().getName(); // 提款人
        System.out.printf("%s 準備提款...\n",name);
        //取得目前帳戶餘額
        int currentBalance = balance;
        if (currentBalance >= cash) { // 是否餘額足夠提款 
            // 開始提款
            Thread.sleep(new Random().nextInt(100)); // 模擬提款所花費的時間
            // 提款成功
            // 回寫帳戶餘額
            balance = balance - cash;
            // 印出交易單
            System.out.printf("%s 提款 NTD$%d 成功 帳戶餘額為: %d\n", name, cash, balance);

        } else {
            System.out.printf("%s 提款 NTD$%d 失敗 帳戶餘額為: %d\n", name, cash, balance);
        }
    }
}

class WithDraw implements Runnable {// 提款執行緒(Runnable)

    private Account account;
    private int cash;

    public WithDraw(Account account, int cash) { 
        this.account = account; // 帳號
        this.cash = cash; // 提款金額
    }
    
    
    @Override
    public void run() {
        try {
            account.withdraw(cash);// 進行提款的作業
        } catch (Exception e) {
        }
    }

}

public class ATM {
    public static void main(String[] args) {
        Account account = new Account(10000);
        Thread t1 = new Thread(new WithDraw(account, 5000), "小明");
        Thread t2 = new Thread(new WithDraw(account, 3000), "小華");
        Thread t3 = new Thread(new WithDraw(account, 4000), "小英");
        t1.start();
        t2.start();
        t3.start();
    }

}
