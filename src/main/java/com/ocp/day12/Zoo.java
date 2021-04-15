package com.ocp.day12;

public class Zoo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.shout();
        //cat2.hinter(); 因為 Cat 裡面沒有 hunter()
        Tiger tiger = new Tiger();
        tiger.shout();
        tiger.hunter();
        Cat cat2 = new Tiger();
        cat2.shout();
        
        
        
    }
}
