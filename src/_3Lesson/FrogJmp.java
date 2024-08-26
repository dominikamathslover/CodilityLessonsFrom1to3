package _3Lesson;

import java.util.SortedMap;

public class FrogJmp {
    public static void main(String[] args){
        int X =10;
        int Y= 85;
        int D= 30;

        System.out.println("The result of dividing 75/30 rounding down to a smaller integer "+ 75/30);
        System.out.println("The result of dividing 75/30d gives a decimal number " + 75/30d);
        System.out.println("A small frog wants to get to the other side of the road. \n" +
                "The frog is currently located at position X=" +X+ " and wants to get to a position greater than or equal to Y="+Y +
                "\nThe small frog always jumps a fixed distance, D= "+D + "\nThe minimal number of jumps that the small frog must perform to reach its target is "+solution(X,Y,D));

    }

    public static int solution(int X, int Y, int D){
        double difference = Y-X;
        double c= (difference)/D;
        return (int)Math.ceil(c);
    }


}
