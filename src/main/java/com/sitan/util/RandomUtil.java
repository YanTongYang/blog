package com.sitan.util;

import java.util.Random;

public class RandomUtil {

    public static Integer getRandomId(){
        Random r = new Random();
        int i = r.nextInt(899999)+100000;
        return i;
    }
}
