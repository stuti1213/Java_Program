package org.java.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reverse {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<Integer>();
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        li.add(5);
        li.add(6);
        li.add(7);

        System.out.println("Before: "+ li);

        Collections.reverse(li);

        System.out.println("After: " + li);
    }
}
