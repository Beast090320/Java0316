package com.ocp.day06;

import java.util.Arrays;

/*-------------------------------------------
1.調查五位學生之身高及體重如下，試比較其分散程度。
            身高：172、168、164、170、176(公分)
            體重：62、57、58、64、64(公斤)
-------------------------------------------*/
public class ArrayBMICV {

    public static void main(String[] args) {
        String[] name = {"A", "B", "C", "D", "E"};
        double[] h = {172, 168, 164, 170, 176};
        double[] w = {62, 57, 58, 64, 64};
        Person[] persons = new Person[5];
        

        for (int i = 0; i < persons.length; i++) {
            //建立一個 Person 物件名為 P
            Person p = new Person(name[i], h[i], w[i]);
            //將 Person 物件 p 放入到 persons[0] 中
            persons[i] = p;
            //將 person[0] 印出
            System.out.println(persons[i]);
        }
        //印出 BMI 值
        
        for(Person p : persons){
            System.out.printf("bmi: %.1f\n", p.bmi);
        }
        //建立 double[] bmis 用來存放所有bmi 的資料
        double[] bmis = new double[5];
        for(int i=0;i<persons.length;i++){
            bmis[i] = persons[i].bmi;
        }
        System.out.println(Arrays.toString(bmis));
        //計算 BMI_cv
        double bmi_cv = MyMath.cv(bmis);
        System.out.printf("BMI C.V: %.2f%%\n", bmi_cv*100);
    }
}
