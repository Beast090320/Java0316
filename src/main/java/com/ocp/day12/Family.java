package com.ocp.day12;

/*1.呼叫父建構子
    super(可帶多)
    this ()
    呼叫自己的建構子
  2.spuer()與 this()
    一定要在建構子涵式的第一行
*/
class Father {

    Father() {
        System.out.println("Father");
    }
    
    Father(int x) {
        this();
        System.out.println("Father: " + x);
    }

}

class Son extends Father {
    Son(){
        this(100);
        System.out.println("Son");
    }
    Son(int x){
        super(100);
        System.out.println("Son: " + x);
    }
}

public class Family {
    public static void main(String[] args) {
        Son son = new Son();
        
    }
}
