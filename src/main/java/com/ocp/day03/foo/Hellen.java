package com.ocp.day03.foo;

import com.ocp.day03.bar.John;

public class Hellen extends John{ //Hellen 繼承 John 
    public void print(){
        System.out.print("Hellen: ");
        System.out.print(a + ", ");
        System.out.print(b + "\n");
        
    }
}
