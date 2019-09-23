public class kyndallsPodWork {
    public static void main(String[] args){

    }
    //BONUS FOR PODS

    //multiply without *

    public static int multiplyWithLoop(int num1, int num2){
        int output = 0;
        for(int i = 0; i < num2; i++){
            output += num1;
        }
        return output;
    }


    //get the fractoral of a number

    public static long fractoral(int num){
        long output = 1;
        for(int i = 1; i <= num; i++){
            output *= i;
        }
        return output;
    }



//    codeAcademy

//    practicing double
//    1.
//    As of 2016, Android has 81.7 percent of the market share for mobile operating systems.
//    Create a variable called androidShare that holds this percentage as a double.
//    2.
//    Print out androidShare to the console.
//    public class MarketShare {
//        public static void main(String[] args) {
//            double androidShare = 81.7;
//            System.out.println(androidShare);
//        }
//    }


//    practicing booleans
//    1.
//    Create a variable called intsCanHoldDecimals.
//    Set it to true if the int type can hold a decimal number.
//    Set it to false if the int type cannot do this.
//    2.
//    Print out your intsCanHoldDecimals variable.
//        public class Booleans {
//            public static void main(String[] args) {
//                boolean intsCanHoldDecimals = false;
//                System.out.println(intsCanHoldDecimals);
//            }
//        }


//    practicing char
//    1.
//    Create a variable called expectedGrade of type char.
//    Fill it with a single letter, representing the grade you think you
//    would get in a graded Java course where the grades A, B, C, D and F are possible.
//    2.
//    Print out your expectedGrade variable!
//        public class Char {
//            public static void main(String[] args) {
//                char expectedGrade = 'A';
//                System.out.println(expectedGrade);
//            }
//        }


//    practicing String
//    1.
//    Create a variable called openingLyrics that holds
//    "Yesterday, all my troubles seemed so far away".
//    2.
//    Call System.out.println() to print out openingLyrics.
//        public class Song {
//            public static void main(String[] args) {
//                String openingLyrics = "Yesterday, all my troubles seemed so far away";
//
//                System.out.println(openingLyrics);
//
//            }
//        }


//    deBugging variables

//FROM THIS:
//    public class Mess {
//        public static void main(String[] args) {
//            String year = 2001;
//            double title = "Shrek";
//            int genre = 'C';
//            boolean runtime = 1.58;
//            char isPG = true;
//        }
//    }
//TO THIS:
    //public class Mess {
    //    public static void main(String[] args) {
    //        int year = 2001;
    //        String title = "Shrek";
    //        char genre = 'C';
    //        double runtime = 1.58;
    //        boolean isPG = true;
    //    }
    //}

}
