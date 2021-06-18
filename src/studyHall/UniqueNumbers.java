package studyHall;

public class UniqueNumbers {

    //Write a program that returns unique numbers in an array.
    //input : int[] arr = {1,1,1,2,3,2,3,4,5,4,4,6,7,8,9};
    //output : 5,6,7,8,9

    public static void main(String[] args) {

        int[] arr = {1,1,1,2,3,4,5,5,5,55,6,6,67,8,8,0};

        for(int each : arr){  // 1 , 1, 1, 2, 3, 4, 5,5 ,5...

            int count = 0;  // for the frequency of the numbers in the arr

            for(int a : arr){ // for counting the frequency of the numbers
                if(a == each ){
                    count++;
                }
            }

            if(count == 1){  // if it's unique
                System.out.println(each);
            }
        }
    }
}
