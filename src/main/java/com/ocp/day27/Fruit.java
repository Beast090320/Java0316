package com.ocp.day27;

public class Fruit {

    private String name;
    private int qty;

    public Fruit(String name, int qty, double price) {
        this.name = name;
        this.qty = qty;
        this.price = price;
    }
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Fruit{" + "name=" + name + ", qty=" + qty + ", price=" + price + '}';
    }
    
}
