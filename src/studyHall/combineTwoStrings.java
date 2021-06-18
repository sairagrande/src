package studyHall;

import java.util.Scanner;

public class combineTwoStrings {
    // #1 - Ask user to enter two words.
    // Then add them together and print.
    // But if the last letter of the first word and the first letter of the last letter is the same,
    // print that character once.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.next();
        String str2 = scan.next();

        // first method -- charAt
        char ch1 = str1.charAt(str1.length()-1); // this will get the last character of first string/ word
        char ch2 = str2.charAt(0); // this will get the first character of second word

        if(ch1 == ch2){
            System.out.println(str1 + str2.substring(1)); // this excludes the first character of the second word
        }else{
            System.out.println(str1+str2);
        }

    }


}
