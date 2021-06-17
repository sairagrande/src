package day18;

import java.time.LocalDate;

public class c4_Dates {


    public static void main(String[] args) {
        //localdate class coming from librarry import java.time.LocalDate;
        LocalDate localDate1=LocalDate.of(2021,06,16);

        System.out.println(localDate1);


        LocalDate localDate2=LocalDate.of(2020,07,18);
        System.out.println(localDate2);
        //isAfter ,isBefore
        boolean bool1=localDate1.isAfter(localDate2); //true
        boolean bool2=localDate1.isBefore(localDate2); //false
        boolean bool3=localDate1.isEqual(localDate2); //false

        System.out.println(bool1);
        System.out.println(bool2);
        System.out.println(bool3);


        LocalDate todayDate=LocalDate.now();
        System.out.println("today is : "+todayDate);

        String str1=localDate1.toString();//2021-06-16
        str1= str1.replace("-",".");
        System.out.println(str1);





    }
}
