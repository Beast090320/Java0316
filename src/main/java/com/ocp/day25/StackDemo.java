package com.ocp.day25;

import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {
        //將書本放入箱子中
        Stack<Product> box = new Stack<>();
        box.push(new Product("書-Java", 100));
        box.push(new Product("書-Python", 100));
        box.push(new Product("書-C#", 100));
        System.out.println("箱子裡的書本: " + box);
        //從箱子中取出每一本書
        while (!box.isEmpty()) {
            Product product = box.pop();
            System.out.println("書名: " + product.getName());
        }
        System.out.println("箱子裡的書本: " + box);
    }
}
