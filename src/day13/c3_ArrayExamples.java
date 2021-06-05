package day13;

public class c3_ArrayExamples {

    //create a condition that will check list of array and it will print even numbers from the list

    public static void main(String[] args) {
        // int [] numbers={-2,-5, 45 , 50 ,60,100,4 }
        //output should be -2 50,60,100,4

        int [] numbers={-2,-5, 45 , 50 ,60,100,4 };
        //loop
        //starting point first index of array
        //endign poitn last index of array
        //iteration

        for (int i=0; i <= numbers.length -1 ; i++){

            if (numbers[i] % 2==0){
                System.out.print(numbers[i]+ " ");
            }

        }
        //-2 50

        System.out.println();


    }
}
