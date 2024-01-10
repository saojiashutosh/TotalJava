package TotalJava.Function;

public class AverageOfThreeNumber {
    public static void main(String[] args){
        averageOfThree(1,2,3);
    }

    private static void averageOfThree(int x, int y, int z) {
        float Avg = (float) (x + y + z) /3;
        System.out.println("Average of Three Number : "+ Avg);
    }
}
