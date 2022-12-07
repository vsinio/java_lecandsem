package drafts;

public class task2 {
    public static void main(String[] args) {
        int maxi = 0;
        int count = 0;
        int[] numbers = { 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0 };
        for (int num : numbers) {
            if (num == 1) {
                count++;
            } else {
                count = 0;
            }
            {
                if (count > maxi) {
                    maxi = count;
                }
            }
        }
        System.out.format("qty 1 = %s", maxi);
    }
}
