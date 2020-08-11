package com.kevin.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTester {
    public static void main(String[] args) throws IOException {
        File tester = new File("C:\\tester");
        tester.mkdir();
        FileWriter fw = new FileWriter("C:\\tester\\out1.txt");
        fw.write("大家好");
        fw.flush(); //寫完一次送
        fw.close(); //關閉通道
    }
}
