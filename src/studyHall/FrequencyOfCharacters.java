package studyHall;

public class FrequencyOfCharacters {

    //Write a program that returns frequency of given characters.
    //ex:
    //input: “java”
    //output: “j1a2v1"
    //input: “goodday”
    //output: “g1o2d2a1y1"

    public static void main(String[] args) {

        String str = "aaaabbbbcdeeef";
        String nonDup = ""; // a b c e f

        for(int i = 0; i <= str.length()-1; i++){
             String s = ""+str.charAt(i);
             if(!nonDup.contains(s)){
                 nonDup += s;
             }
        }

        String result = ""; // result of teh count

        for(int j = 0; j <= nonDup.length()-1; j++){

            char ch = nonDup.charAt(j);
            int count = 0;
            for(int i =0; i <= str.length()-1; i++){
                char each = str.charAt(i);
                if(each == ch){
                    count =+ 1;
                }
            }

            result += ""+ch+count;


        }

        System.out.println(result);






    }

}
