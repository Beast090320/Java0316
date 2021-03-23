package com.ocp.day03.foo;

import com.ocp.day03.bar.John;
import com.ocp.day03.bar.Mary;

public class Bob {
    public void print(){
        John john = new John();
        System.out.print("Bob:    "); //對 Bob 而言，只有 a 有權限使用(Public)
        System.out.print(john.a + "\n");
      /*System.out.print(john.b);
        System.out.print(john.c);
        System.out.print(john.d);*/
        
    }
}
