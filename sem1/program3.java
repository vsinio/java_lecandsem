import java.util.Scanner;

public class program3 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        String text = "Ваш ответ: ";

        System.out.println("Введите 1 число: ");
        int num1 = Scan.nextInt();
        System.out.println("Введите знак: ");
        String operation = Scan.next();
        System.out.println("Введите 2 число: ");
        int num2 = Scan.nextInt();


    if (num1 / num1 == 1 & num2 / num2 == 1)
        if (operation.equals("+") | operation.equals("-") | operation.equals("*") | operation.equals("/")){
        }else {
            System.out.println("Неверное арифметическое действие");
            }
            if (operation.equals("+")) {
                System.out.println(text + (num1 + num2));
            } else if (operation.equals("-")) {
                System.out.println(text + (num1 - num2));
            } else if (operation.equals("*")) {
                System.out.println(text + (num1 * num2));
            } else if (operation.equals("/")) {
                System.out.println(text + (num1 / num2));
            }

        }}
