package com.ocp.day36_io;

import java.io.File;
import java.io.FileReader;
import sun.net.ftp.FtpClient;

public class ReadFile_Salary2 {

    public static void main(String[] args) {
        File file = new File("src/main/java/com/ocp/day36_io/files/salary.txt");
        
        //try-with-resiurse (自動關閉檔案)
        //有實作 Closeeable 的類才可以放入
        try (FileReader fr = new FileReader(file)) {

            int ch = 0;
            
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (Exception e) {
        }

    }

}
