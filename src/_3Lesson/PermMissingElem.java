package _3Lesson;

import java.util.Arrays;

public class PermMissingElem{
    public static void main(String[] args) {
        int[] A = {1};
        System.out.println(missingElement(A));

    }

    public static int missingElement(int[] A) {
        Arrays.sort(A);

        for (int i = 0; i < A.length; i++) {
            if (A[i] != i + 1) {
                return i + 1;
            }
        }
        return A.length + 1;
    }
}


