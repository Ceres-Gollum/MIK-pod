public class MattBonus2 {

    public static void main(String[] args) {
//        System.out.println(multiplyWLoopFunction(4,5)); // 20
//        System.out.println(multiplyWRecursion(5,5)); // 25
        int numArr[] = {1, 6, 4};
        int pickNum = 6;
        System.out.println("Is there a " + pickNum + " in the array?  " + array6(numArr, 0, pickNum)); // true

        int numTwoArray[] = {1,2,3};
        System.out.println("sum2 = " + sum2(numTwoArray)); // 3

    }



//    Recursion Bonus
//    Create your multiplication method without the * operator (Hint: a loop might be helpful).
//    Do the above with recursion.
    public static int multiplyWLoopFunction(int num1, int num2){
        int finalNum = 0;
        for (int i = 0; i < num1; i++){
            finalNum += num2;
        }
        return finalNum;
    }

    public static int multiplyWRecursion(int num1, int num2){
        if(num1 == 0 || num2 == 0){
            return 0;
        }else {

            System.out.println("num1 = " + num1 + " num2 = " + num2);
            return (num1 + multiplyWRecursion(num1, num2 -1));

        }

    }

    //    Code bat recursion practice:
    public static boolean array6(int[] nums, int index, int pickNum) {
        if (index < nums.length){
            if (nums[index] == pickNum){
                return true;
            }else{
                return array6(nums, index+1,pickNum);
            }

        }
        return false;

    }

    // Code bat array practice:
    public static int sum2(int[] nums) {
        if(nums.length == 0){
            return 0;
        }else if(nums.length < 2){
            return nums[0];
        }else{
            return nums[0] + nums[1];
        }


    }




}
