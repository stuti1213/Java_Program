package org.java.array;

public class ArrayRepeat {

    public static void main(String[] args) {
        int[] n = {1,2,3,4,2,3,5,5,5,1};
        int count = 0;
        int number = 2;

        for(int i =0; i <n.length; i++){
            if(n[i]==number){
                count++;
            }
        }
        System.out.println("Repeat " + number + " ---> " + count + " times");
    }
}
