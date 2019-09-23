public class IsaiahMethodBonus {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(345));
    }

//    Write a Java method to compute the sum of the digits in an integer.
//    Test Data:
//    Input an integer: 25
//    Expected Output:
//
//    The sum is 7
    public static int sumOfDigits(int num){
        String numAsStr = num + "";

        int total = 0;
        for(int i = 0; i < numAsStr.length(); i++){
            int x = Integer.parseInt(String.valueOf(numAsStr.charAt(i)));
            total += x;

        }
        return total;

    }

}

