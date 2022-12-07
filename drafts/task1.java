package drafts;

import java.util.Scanner;

public class task1 {
    
    public static void main(String[] args) {
        System.out.println("Select your name:");

        Scanner scanner = new Scanner (System.in, "cp866");
        String name = scanner.nextLine();


        System.out.println("Привет, " + name + "!");
        System.out.println((String.format ("Привет, %s!", name)));
        scanner.close();
    }
}