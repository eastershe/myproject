package com.kevin.many;

import java.util.*;

public class Tester {
    public static void main(String[] args) {
        //map (一筆資料內有key有value，但key不能重複)
        HashMap<String,String> student = new HashMap();
        student.put("a5255832","許凱崴");
        student.put("a5287113","許威凱");
//        student.put("a5255832","許先生");
        System.out.println(student.get("a5255832"));
        System.out.println(student);

        for (String key : student.keySet()){
            System.out.println(student.get(key));
        }

//        set();
//        list();
//        arrayTest();
    }

    private static void set() {
        //set (資料不重複)
        HashSet<Integer> set = new HashSet<>();
        set.add(7);
        set.add(4);
        set.add(5);
        set.add(1);
        set.add(7);
        System.out.println(set);

        for (int i : set){
            System.out.println(i);
        }
    }

    private static void list() {
        ArrayList<Integer> list = new ArrayList();
        list.add(5);
        list.add(3);
        list.add(7);
        list.add(9);
        list.add(7);
        list.add(7);
        System.out.println(list);

        int n1 = list.get(0);
        int n2 = list.get(3);
        System.out.println(list.size());

        List<Integer> scores = Arrays.asList(66, 88, 60, 89, 90);
        for (int score : scores){
            System.out.println(score);
        }
    }

    private static void arrayTest() {
        int[] numbers = new int[5];
        numbers[1] = 0;
        numbers[4] = 9;

        int scores[] = {66, 88, 60, 89, 90};
        System.out.println(scores[3]);
        for (int i=0 ; i< scores.length ; i++){
            System.out.println(scores[i]);
        }
        //for each用法
        for (int n : scores){
            System.out.println(n);
        }
    }
}
