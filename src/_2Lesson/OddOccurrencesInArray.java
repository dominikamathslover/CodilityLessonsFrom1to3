package _2Lesson;

public class OddOccurrencesInArray {

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 3, 1};
        int[] B = {9, 3, 9, 3, 3, 9, 7, 9};

        System.out.println(solution(A));
        System.out.println(solution(B));
    }

    public static int solution(int[] A) {
        int n = 0;

        for (int i = 0; i < A.length; i++) {
            n ^= A[i];
        }
        return n;
    }

}
