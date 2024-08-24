package _1Lesson;

import java.util.*;

public class BinaryGap {


    public static void main(String[] args) {

    result(1200);
    result(32);
    result(1041);
    result(529);
    result(15);

    }

    public static void result(int N){
        System.out.println("The number: " + N);
        System.out.println("The binary representation: " + Integer.toBinaryString(N));
        System.out.println("The longest sequence of zeros in binary representation that is surrounded by ones at both ends: "+solution(N)+"\n");
    }


    public static int solution(int N) {
        String binary = Integer.toBinaryString(N);
        char[] list= binary.toCharArray();
        ArrayList<Integer> arr1 = new ArrayList<Integer>();

        for(int i = 0; i<=list.length-1;i++) {
            if(Character.getNumericValue(list[i]) == 1) {
                arr1.add(i);
            }
        }

        int binaryGap=0;
        int difference = 0;
        for(int i=arr1.size()-1;i>=1;i--) {
            difference = arr1.get(i)-1- arr1.get(i-1);
            if(difference>binaryGap) binaryGap=difference;
        }
        return binaryGap;
    }

}