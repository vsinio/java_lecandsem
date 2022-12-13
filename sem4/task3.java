package sem4;


import java.util.Scanner;
import java.util.Stack;

public class task3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введи значение: \n");
        var exp = scan.nextLine().split(" ");

        int res = 0;

        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < exp.length; i++) {
            if(isDigit(exp[i])) {
                st.push(Integer.parseInt(exp[i]));
            }else {
                switch (exp[i]) {
                    case "+":
                        res = st.pop() + st.pop();
                        st.push(res);
                        break;
                    case "-":
                        res = - st.pop() + st.pop();
                        st.push(res);
                        break;
                    case "*":
                        res = st.pop() * st.pop();
                        st.push(res);
                        break;
                    case "/":
                      int n1 = st.pop();
                      res = st.pop() / n1;
                        st.push(res);
                        break;
                    default:
                        break;
                }
            }
        }
        System.out.printf("Результат: %d\n", st.pop());
    }

    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        }catch (NumberFormatException e) {
            return false;
        }
    }
}