import java.util.Scanner;

public class program2 {

    public static void main(String[] args) {
        // int input = scan.nextInt();
        int input = 1000;
        boolean b = true;
        System.out.println("Все простые числа от 1 до 1000: ");
        for (int started = 2; started <= input; started++) {
            for (int i = 2; i < started; i++) {
                if (started % i == 0) {
                    b = false;
                    break;
                }
            }
            if (b)
                System.out.println(started);
            else
                b = true;
        }
    }
}
