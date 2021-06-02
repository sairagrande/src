package day10;

import java.util.Scanner;

public class c3_reverseString {

    //Question 1
    //Write a program to print numbers from 1 to 10.
    //Question 2
    //Write a program to calculate the sum of first 10 natural number.
    //Question 3
    //Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number.
    //Question 4
    //Write a program to find the factorial value of any number entered through the keyboard.
    //Question 5
    //Two numbers are entered through the keyboard.
    // Write a program to find the value of one number raised to the power of another.
    // (Do not use Java built-in method)
    //Question 6
    //Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
    //For example, if the input is 12345, the output should be 54321.
    //Question 7
    //Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
    //Question 8
    //Write a program that prompts the user to input a positive integer. It should then output a message indicating whether the number is a prime number.

    //Note : prompt the user to input means : ask user to put input which you need a scanner class

    public static void main(String[] args) {

        //how you can reverse a string
        //input :hello
        //output :olleh

        String str="hello";
        //01234

        String reverse1=""+str.charAt(4)+str.charAt(3)+str.charAt(2)+str.charAt(1)+str.charAt(0);

        System.out.println(reverse1);


        //create a java logic that will reverse the giving string
        //input ; hello
        //output ; olleh


        Scanner input=new Scanner(System.in);

        String word=input.nextLine();
        //reverse ideas is basiccly printing string from backword

        System.out.println("Length of word :"+word.length());

        String result="";

        //starting point : last index of string
            //word.length() -1 this is last index of word
        //ending point : first index of string
            //first index of word which is always 0 for any word
        //iteration  :  i--
        for (int i=word.length() -1 ; i >= 0 ; i--){
            //System.out.println("i is : " + i);
            result += ""+word.charAt(i);
            //System.out.println("result in the loop : "+result);
        }

        ///final result

        System.out.println("Reverse of "+ word + " is " + result);



    }
}
