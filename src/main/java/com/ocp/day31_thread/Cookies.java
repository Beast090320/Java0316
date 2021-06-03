package com.ocp.day31_thread;

public class Cookies {
    private boolean empty = true;
    public synchronized void eat(int i){
        while(empty == true){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //小狗開吃
        System.out.printf("小狗吃了第 %d 塊餅乾\n", i);
        //吃完之後
        empty = true;
        notifyAll();//呼叫主人
    }
    public synchronized void put(int i){
        while(empty == false){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //主人放飯
        System.out.printf("主人放了第 %d 塊餅乾\n", i);
        //主人開飯;
        empty = false;
        notifyAll();//呼叫狗狗
    }
}
