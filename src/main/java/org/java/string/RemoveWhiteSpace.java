package org.java.string;

import org.apache.commons.lang3.StringUtils;

public class RemoveWhiteSpace {

    static String str = "       Geeks     for    Geeks   ";
    static String str1 = "Geeks Geeks";


    public static void main(String[] args) {

        System.out.println(str.replaceAll("\\s",""));
        String result = StringUtils.normalizeSpace(str);

        System.out.println(str);
    }
}
