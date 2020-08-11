package com.kevin.io;

import java.io.*;

public class ReadTester {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("data.text"));
            String line = br.readLine();
            while(line != null){
                System.out.println(line);
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        fileReader();
//        inoutStream();

    }

    private static void fileReader() {
        try {
            FileReader fr = new FileReader("data.text");
            int n = fr.read();
            while(n != -1){
                System.out.print((char) n);
                n = fr.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void inoutStream() {
        File file = new File("data.text");
        System.out.println(file.exists()); //檔案有無存在
        System.out.println(file.getAbsolutePath()); //路徑位置

        try {
            FileInputStream is = new FileInputStream(file); //輸入檔案
            int n = is.read();
            while(n != -1){
                System.out.print((char) n);
                n = is.read();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("檔案讀取失敗");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();
        System.out.println("檔案讀取成功");
    }
}
