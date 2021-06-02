package day02;

public class assigment {

    /*
consule output should be same order as given below
    First Name : name , ID : number
    Company Name :
    Salary :
 */
        public static void main(String [] args){
//            First Name : name , ID : number   --- this will be on first line
//            Company Name :
//            Salary :
            //before starting you are in first line
            System.out.print("First Name : serhat");
            //after first print still on first line
            System.out.print(" , ");
            //still one first line after second print
            System.out.print("ID : 5673839 ");
            //still in first line after third print


            System.out.println();
            //after printl line will be breaked
            //anything you write after here it will be on second line

            System.out.println("Company Name : Capital One");
            //after this println system will be on next line

            System.out.println(); // this will break line
            System.out.println(); // this will break line

            System.out.println("Salary : 150.000 ");


        }
}
