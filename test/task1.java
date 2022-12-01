package test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

/**
 * task1
 */
public class task1 {
    public static void main(String[] args) {
        System.out.println("Hello World");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy, HH:mm:ss");
        System.out.println(LocalDateTime.now().format(formatter));
    }
    

}