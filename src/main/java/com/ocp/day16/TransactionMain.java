package com.ocp.day16;

public class TransactionMain {
    public static void main(String[] args) {
        Transaction T = (amount , price) -> System.out.println(amount * price);;
        T.print(10, 35);
        
    }
}
