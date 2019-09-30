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

//        Write a Java program to remove a specific element from an array.


        int[] numbers2 = {2, 4, 7, 10, 9};
        System.out.println(displayNumbers(numbers2));
        int removeIndex = 1;
        for(int i = removeIndex; i < numbers2.length -1; i++){
            numbers2[i] = numbers2[i + 1];
        }

        System.out.println(displayNumbers(numbers2));


    }

    public static String displayNumbers(int[] nums){
        String numStr = "";
        for (int num: nums) {
            numStr += num;
            numStr += ", ";
        }
        return numStr;
    }
}
