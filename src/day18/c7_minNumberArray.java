package day18;

public class c7_minNumberArray {

    // write a return method that can return minumum number from an int array
    //expected output will be number

    public static void main(String[] args) {
        int [] arr1={10,20,2,-1000,95,-1000};
        double [ ]arr2={2.5 , 5.7, 0.2 ,3.5};
        System.out.println(minNumber(arr1));

        System.out.println("++++++++++++++++");
        System.out.println(minNumber(arr1));
        System.out.println(minNumber(arr2));



    }

    public static int minNumber(int [] numbers){ //{10,20,2,-1000,95};
        //first you will assume one number as a minumun number
        int minumum=numbers[0];//10 //2 //-1000

        for (int eachNumber : numbers ){ //{10,20,2,-1000,95};
            if (eachNumber < minumum){
                minumum = eachNumber;
            }
        }

        return minumum;

    }


    //write a return method that will return minnumber from double array
    //applly overloading,, dont use sort method


    //what type of return i should use
    //do i need any parameters inside of my method

    public static double minNumber(double [] arr){

        double minumum=arr[0];

        for (double each : arr){
            if (each < minumum){
                minumum = each;
            }
        }

        return  minumum;
    }

}
