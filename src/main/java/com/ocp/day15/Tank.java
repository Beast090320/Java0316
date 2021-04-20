package com.ocp.day15;

public class Tank extends Car implements Weapon, oil{

    @Override
    public void move() {
        System.out.println("用履帶走");
    }

    @Override
    public void shoot() {
        System.out.println("穿甲彈");
    }

    public Tank() {
    }

    @Override
    public int spend() {
        return 300;
    }
    
    
}
