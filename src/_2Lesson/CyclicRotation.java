package _2Lesson;

import java.util.Arrays;

public class CyclicRotation {

    public static void main(String[] args) {
        int[] A = {2,4,5,6,7};
        int K = 42;

        int[] B = {3,8,9,7,6};
        int K2 = 3;

        int[] C ={1,2,3,4};
        int K3 = 4;

        result(A,K);
        result(B,K2);
        result(C,K3);

    }

    public static void result(int[] A, int K){
        System.out.println("Before:\n"+ Arrays.toString(A));
        System.out.println("Rotation of the array where each element is shifted right " +K +" times");
        System.out.println("After : \n"+ Arrays.toString(solution(A,K))+"\n");
    }



    public static int[] solution(int[] A, int K) {
        int[] B = new int[A.length];

        if (A.length == 1) return A;

        if (A.length >= K) {
            for (int i = 0; i < A.length; i++) {
                if (i + K < A.length) {
                    B[i + K] = A[i];
                } else {
                    B[i + K - A.length] = A[i];
                }
            }
            return B;
        } else {
            for (int i = 0; i < A.length; i++) {
                if (i + K % A.length < A.length) {
                    B[i + K % A.length] = A[i];
                } else {
                    B[i + K % A.length - A.length] = A[i];
                }
            }
            return B;
        }
    }


}
