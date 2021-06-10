package com.ocp.day36_io;

import java.io.File;
import java.io.FileReader;
import sun.net.ftp.FtpClient;

public class ReadFile_Salary {

    public static void main(String[] args) {
        File file = new File("src/main/java/com/ocp/day36_io/files/salary.txt");
        FileReader fr = null;
        try {
            fr = new FileReader(file);
            int ch = 0;
            /*System.out.println(fr.read());
            System.out.println(fr.read());
            System.out.println(fr.read());
            System.out.println(fr.read());*/
            while ((ch = fr.read()) != -1) {
                System.out.print((char)ch);
            }
        } catch (Exception e) {
        } finally{
            try {
                fr.close(); // 關閉檔案
            } catch (Exception e) {
            }
            
        }

    }
}
