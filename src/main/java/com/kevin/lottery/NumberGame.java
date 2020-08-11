package com.kevin.lottery;

import java.util.HashSet;
import java.util.Set;

public abstract class NumberGame {
    Set<Integer> numbers = new HashSet<>();
    int numberCount = 0;
    //抽象類別，方法不寫完交由實作完成
    public abstract void generate();
    public boolean validate(){
        if (numbers.size() == numberCount)
            return true;
        else
            return false;

    }
}
