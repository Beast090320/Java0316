package com.ocp.day24;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("C");
        list.add(0,"B");
        list.add("C");
        System.out.println(list);
        
        ListIterator<String> iter = list.listIterator();
        while (iter.hasNext()) {
            int nextId = iter.nextIndex();
            String next = iter.next();
            System.out.printf("%d : %s\n",nextId,next);
        }
        while (iter.hasPrevious()){
            int prevId = iter.previousIndex();
            String prev = iter.previous();
            System.out.printf("%d : %s\n", prevId, prev);
        }
    }
}
