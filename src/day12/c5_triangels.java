package day12;

public class c5_triangels {
    /*

    *
    * *
    * * *
    ...

     */

    public static void main(String[] args) {


        for (int i =1 ; i <=5 ; i++){ // 1 2 3 4 5

            for (int j = 1 ; j <= i ; j++){

                System.out.print("* ");
            }
            System.out.println();

        }

        //i=1
        //int j = 1 ; j <= 1 ; j++
        //this will run one time
        //*
        //System.out.println();

        //i=2
        //int j = 1 ; j <= 2 ; j++  // 1 ,2
        //this will run 2 times (print)
        //* *
        //System.out.println();

        //i=3
        //int j = 1 ; j <= 3 ; j++  // 1 ,2  ,3
        //this will run 3 times (print)
        //* * *
        //System.out.println();


         /*

             * * * * * * *
             * * * * * *
             * * * * *
              ...

        */

        System.out.println("------------------------------------");

        for (int i =5 ; i>=1 ; i--){ //5 4 3 2 1

            for (int j = 1 ; j <= i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }


        //i=5
        //int j = 1 ; j <= 5 ; j++  1 2 3 4 5
        //this will run 5 times
        //* * * * *
        //System.out.println(); breaks the line

        //i=4
        //int j = 1 ; j <= 4 ; j++  // 1 ,2 ,3 ,4
        //this will run 4 times (print)
        //* * * *
        //System.out.println();

        //i=3
        //int j = 1 ; j <= 3 ; j++  // 1 ,2  ,3
        //this will run 3 times (print)
        //* * *
        //System.out.println();

        //...



        //we will print all alpahets in triangle
        /*
            a
            a b
            a b c
            a b c d
            a b c d e

            ......
            a  .......     z

         */




    }

}
