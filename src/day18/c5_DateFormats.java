package day18;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class c5_DateFormats {

    public static void main(String[] args) {

        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd/MMM/yyyy");

        LocalDate localDate1=LocalDate.now();
        System.out.println(localDate1); //2021-06-16

        System.out.println(localDate1.format(dateTimeFormatter)); //16/Jun/2021

        DateTimeFormatter dateTimeFormatter2=DateTimeFormatter.ofPattern("E MMMM/dd/yy");

        LocalDate localDate2=LocalDate.of(2010,10,05);

        System.out.println(localDate2.format(dateTimeFormatter2));


        //E : day of name
        //MMM jan MMMM january
        //yy :10  yyyy:2010


        LocalDateTime localDateTime1=LocalDateTime.of(2000,9,10,11,24,29);
        System.out.println(localDateTime1);

        DateTimeFormatter dateTimeFormatter3=DateTimeFormatter.ofPattern("EEE, MM/dd hh:mm a");

        String str2=localDateTime1.format(dateTimeFormatter3);
        System.out.println(str2);


    }
}
