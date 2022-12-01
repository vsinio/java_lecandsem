package Homework_1.BubbleSort;
import java.util.Arrays;
import java.util.logging.*;
import java.io.IOException;


public class bubblesort {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(bubblesort.class.getName());
        FileHandler fh = new FileHandler("log.xml");
        logger.addHandler(fh);

        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);

        int[] numbers = new int[] {5, 7, 3, 12, 45, 2, 0};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                    logger.info("Иттерация сортировки " + Arrays.toString(numbers));
                }
            }
        }
    }

}
