package com.ocp.day07;

public class StringBuilderDelete {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java cource");
        System.out.println(sb);
        //刪除全部資料
        sb.delete(0, sb.length()); // (0, 11) 從 0 開始到 < 11 的資料全部刪除
        System.out.println("sb = " + sb);
    }   
}
