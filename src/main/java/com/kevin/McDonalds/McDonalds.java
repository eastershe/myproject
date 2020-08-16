package com.kevin.McDonalds;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class McDonalds {
    static Map<String,Item> menu = new HashMap<>();
    public McDonalds(){
        //把讀取資料的動作放在空建構子裡面
        File file = new File("mcdonalds.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = br.readLine();
            while (line != null){
                String[] tokens = line.split(",");
                Item item = new Item(
                        tokens[0],
                        tokens[1],
                        Integer.parseInt(tokens[2]),
                        Integer.parseInt(tokens[3]));
                menu.put(item.id, item);
                line = br.readLine();
            }
        } catch (IOException e) {
//            e.printStackTrace();
            System.out.println("資料讀取錯誤!!");
        }
    }
    public void printMenu(){
        System.out.println("菜單如下：(餐點編號/名稱/卡路里/價格)");
        for (Map.Entry<String, Item> itemEntry : menu.entrySet()) {
            System.out.println(itemEntry.getValue());
        }
        System.out.println("---");
    }

    public static void main(String[] args) {
       McDonalds mcDonalds = new McDonalds(); //讀取menu
       mcDonalds.printMenu(); //印出menu
       Scanner scanner = new Scanner(System.in); //輸入點餐
        order(scanner);
    }

    private static void order(Scanner scanner) {
        System.out.print("請輸入你的餐點編號：");
        String no = String.valueOf(scanner.nextInt());
        if(menu.get(no) != null){
            System.out.print("請輸入欲訂購的份數：");
            int amount = scanner.nextInt();
            System.out.println("------");
            System.out.println("你的餐點清單如下："+ menu.get(no).name + "," + amount + "份");
            System.out.println("總價：" + (menu.get(no).price)*amount + "元");
            System.out.println("你所攝取卡路里為：" + (menu.get(no).cal)*amount + "卡，謝謝。");
        }else{
            System.out.println("查無此餐點");
        }
    }

    static class Item{
        String id;
        String name;
        int cal;
        int price;

        @Override
        public String toString() {
            return id + "\t" + name + "\t" + cal + "\t" + price;
        }

        public Item(String id, String name, int cal, int price) {
            this.id = id;
            this.name = name;
            this.cal = cal;
            this.price = price;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getCal() {
            return cal;
        }

        public void setCal(int cal) {
            this.cal = cal;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }
    }
}
