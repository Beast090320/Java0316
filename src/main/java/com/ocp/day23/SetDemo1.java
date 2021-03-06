package com.ocp.day23;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo1 {

    public static void main(String[] args) {
        Set subjects = new LinkedHashSet();
        subjects.add("國");//string
        subjects.add("英");//string
        subjects.add(null);//null
        subjects.add("數");//string
        subjects.add(100);// Integer
        System.out.println(subjects);
        // 走訪每一個元素
        Iterator iter = subjects.iterator();
        while (iter.hasNext()) {
            Object next = iter.next();
            //System.out.println(next);
            if (next == null) {
                iter.remove();
                continue;
            }
            if (next instanceof Integer) {
                if(((Integer)next) == 100){
                    iter.remove();
                }
            }
        }
        System.out.println(subjects);

    }
}
