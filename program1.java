/**
 * program
 */
import java.util.Scanner;

public class program1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int first_position, result = 0, count = 1;
        long finaly_position;

        System.out.println("Введите до какого треугольного числа по счету вы хотите получить результат: ");
        finaly_position = sc.nextInt();// Считываем первое число
        System.out.println("Ваш результат: ");
        for (first_position = 1; count <= finaly_position; first_position++) {

            result = first_position * (first_position + 1) / 2;

            System.out.println(result);
            count++;
        }

    }
}
    
    
