package org.java.list;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateInSameOrder {
    public static void main(String[] args) {

        List<Integer>li = new ArrayList<Integer>();
        li.add(1);
        li.add(14);
        li.add(12);
        li.add(11);
        li.add(14);
        li.add(11);
        li.add(12);
        li.add(16);

        System.out.println("Before: " + li);

        Set<Integer> sl = new LinkedHashSet<Integer>(li);
        li.clear();

        li.addAll(sl);

        System.out.println(sl);

    }
}
