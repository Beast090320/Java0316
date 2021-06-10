package com.ocp.day36_io;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
// Download 讀取 -> 寫檔

public class DownlaodImage_via_http {

    public static void main(String[] args) throws Exception {
        String frompath = "https://ichef.bbci.co.uk/news/976/cpsprodpb/C448/production/_117684205_lotus.jpg";
        URL url = new URL(frompath);
        
        String savepath = "src/main/java/com/ocp/day36_io/files/car.jpg";
        
        try (InputStream is = url.openConnection().getInputStream();
                FileOutputStream fos = new FileOutputStream(savepath, false);) {
            int ch = 0;
            //邊讀邊寫
            while ((ch = is.read()) != -1) {
                System.out.println(ch);
                fos.write(ch);
            }
        } catch (Exception e) {
        }
    }
}
