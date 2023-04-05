package org.java.array;

public class OddEven {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7,8,9,0,9};
        int odd =0;
        int even=0;

        for(int i=0; i<num.length;i++) {

            if(num[i]%2 ==0){
                even++;

            }
            else {
                odd++;
            }
        }

        System.out.println("Total odd " + odd);
        System.out.println("Total even " + even);

    }
}
