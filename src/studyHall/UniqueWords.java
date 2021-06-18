package studyHall;

public class UniqueWords {

    // Write a program that finds unique words in an array

    public static void main(String[] args) {

        String[] words = {"Parvina", "Parvina", "Mahir", "Serhat", "Ceylan", "Burhan", "Burhan" };
        //                     0           1           2       3       4


        for (String each : words) {

            int count = 0;
            for(String a : words){
                if(a.equals(each)){
                    count++;
                }
            }

            if(count == 1){
                System.out.println(each);
            }


        }

        }
    }
