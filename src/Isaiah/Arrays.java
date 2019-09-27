package Isaiah;

public class Arrays {

    public static void main(String[] args) {

//    Write a Java program to calculate the average value of array elements

        int[] numbers = new int[]{2, 35, 26, 5, -18, 32, -10};

        int sum = 0;
        for (int number : numbers)
            sum = sum + number;

        double average = sum / numbers.length;
        System.out.println("Average value of the numbers is : " + average);
    }
}
