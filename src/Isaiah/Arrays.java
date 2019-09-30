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



//        Write a Java program to remove the duplicate elements of a given array and return the new length of the array.
//                Sample array: [20, 20, 30, 40, 50, 50, 50]
//        After removing the duplicate elements the program should return 4 as the new length of the array.

            int numbers3[] = {20, 20, 30, 40, 50, 50, 50};
            System.out.println("Original array length: "+ numbers3.length);
            System.out.println("Array elements are: " + displayNumbers(numbers3));
            System.out.println("\nThe new length of the array is: "+ countOriginals(numbers3));

    }

        public static int countOriginals(int[] nums) {
            int index = 1;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != nums[index-1])
                    nums[index++] = nums[i];
            }
            return index;
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
