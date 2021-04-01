package com.ocp.day08;

import  static com.ocp.day08.Util.print;
import  static com.ocp.day08.Util.gameOver;
import java.util.Random;
import java.util.Scanner;

public class XOGameEnd {
    public static void main(String[] args) {
        Random r = new Random();
        char[][] ttt = new char[3][3];
        //System.out.println(ttt[0][0] == '\u0000'); //'u0000' 表示 char 的空值
        do{
            //User 遊戲進行
            print(ttt);
            Scanner sc = new Scanner(System.in);
            System.out.print("請輸入選項1-9: ");
            int p = sc.nextInt();
            p -= 1;
            ttt[p/3][p%3] = 'O';

            if(gameOver(ttt)){
                print(ttt);
                break;
            }
            //PC   遊戲進行

            do{
                p = r.nextInt(9);
                //判斷 ttt[p/3][p%3] 是否是 '\u0000'
            }while(ttt[p/3][p%3] != '\u0000');
            ttt[p/3][p%3] = 'X';//將x填入
            
            if(gameOver(ttt)){
                print(ttt);
                break;
            }
            
        }while(true);
        System.out.println("Game Over");
    
    }
}