package com.will.test;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

/**
 * Created by william on 16/8/5.
 */
public class UseTrivial {
    public static void trivailTest() {
        Trivial trivial = new Trivial();
        trivial.setName("www");
        trivial.setAge(12);

        String name;
        if ((name = trivial.getName()) != null) {
            System.out.println("name is not null: " + name);
        }
        else {
            System.out.println("name is null: " + name);
        }
    }
}
