package studyHall;

public class PrintTriangle {

    //Write a program to print out a triangle like below by using for loop:
    // /*
    //            *
    //            * *
    //            * * *
    //            * * * *
    //            * * * * *
    //            * * * * * *
    //            * * * * * * *
    //         */

    public static void main(String[] args) {

        /*
        for(int i = 0; i<=7; i++){

            for(int j = 0; j <= i; j++)


                System.out.print("* ");
                System.out.println();


        }

         */

String result = "";
        int z = 1;
        while(z <= 7){
            z++;
            result += "*";

            System.out.println(result);

        }





    }

}
