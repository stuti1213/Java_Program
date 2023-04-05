package org.java.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedArrayList {
    public static void main(String[] args) {
        List<String> li = new ArrayList<String>();
        li.add("RELIANCE");
        li.add("TATA");
        li.add("TECHMAH");
        li.add("HDFC");
        li.add("ICICI");

        li= Collections.synchronizedList(li);

        synchronized (li){
            for(String s: li){
                System.out.println(s);
            }
        }
    }
}
