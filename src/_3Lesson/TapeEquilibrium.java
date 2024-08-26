package _3Lesson;

import java.util.ArrayList;

public class TapeEquilibrium {

    public static void main(String[] args) {
        int[] A = {6, 8, 9, 10, 65, 32, 12};

        System.out.println("The minimum absolute difference between the sum of the first part and the sum of the second part is "+minDiff(A));

    }

    public static int minDiff(int[] A) {
        ArrayList<Integer> preSums = new ArrayList<Integer>();
        ArrayList<Integer> postSums = new ArrayList<Integer>();

        int sum = 0;
        for (int i = 0; i < A.length - 1; i++) {
            sum = sum + A[i];
            preSums.add(sum);
        }

        sum = 0;
        for (int i = A.length - 1; i > 0; i--) {
            sum = sum + A[i];
            postSums.add(sum);
        }

        int[] differences = new int[preSums.size()];

        int min = differences[0] = Math.abs(preSums.get(0) - postSums.get(preSums.size() - 1));
        for (int i = 1; i < preSums.size(); i++) {
            differences[i] = Math.abs(preSums.get(i) - postSums.get(preSums.size() - i - 1));
            if (min > differences[i]) min = differences[i];
        }

        return min;
    }
}




