package org.java.list;

import java.util.*;

public class RemoveDuplicate {
    public static void main(String[] args) {

        List<Integer> li = new ArrayList<>();
        li.add(1);
        li.add(14);
        li.add(12);
        li.add(11);
        li.add(14);
        li.add(11);
        li.add(12);
        li.add(12);

        System.out.println("Before: " + li);

        Set<Integer> sl = new HashSet<>();

        sl.addAll(li);

        System.out.println("After: " + sl);

    }
}
