import java.util.Scanner;

public class BonusJavaString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        Create date format converter application.
//                Take in the following format:
//        MM/DD/YYYY
//        Output the following:
//        MonthName DD, YYYY
//        Example:
//        input - 12/01/1999
//        output - December 12, 1999

        System.out.println("enter birthday in this format: MM/DD/YYYY ");
        String date = input.nextLine();

        String month = date.substring(0,2);
        String dayYear = date.substring(3,5) + ", " + date.substring(6);
        System.out.println(month);


        if(month.equals( "01")){
            month = "January ";

        }else if(month.equals( "02")){
            month = "February ";

        }else if(month.equals( "03")){
            month = "March ";

        }else if(month.equals( "04")){
            month = "April ";

        }else if(month.equals("05")){
            month = "May ";

        }else if(month.equals("06")){
            month = "June ";

        }else if(month.equals( "07")){
            month = "July ";

        }else if(month.equals("08")){
            month = "August ";

        }else if(month.equals("09")){
            month = "September ";

        }else if(month.equals("10")){
            month = "October ";

        }else if(month.equals("11")){
            month = "November ";

        }else if(month.equals("12")){
            month = "December ";
        }

        System.out.println(month + dayYear);



        Create an application that allows the user to enter a sentence
        and tells them how many vowels and consonants were used.
        Example:
        input - "The hill are alive."
        output - 5 vowels and 10 consonants

        System.out.println("enter a sentence: ");
        String userSentence = input.nextLine();

        String vowels = "aeiouAEIOU";
        String consonants = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";

        int vowelCount = 0;
        int consonantCount = 0;
        for (int i = 0; i < userSentence.length(); i++){
            char letter = userSentence.charAt(i);
            int x = vowels.indexOf(letter);
            int y = consonants.indexOf(letter);

            if (x != -1){
                vowelCount += 1;
            }else if (y != -1){
                consonantCount += 1;
            }

        }
        System.out.println( vowelCount + " vowels and " + consonantCount + " consonants");


    }
}
