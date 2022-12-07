package sem3;

import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {
        int[] array1 = {10, 4, 6, 4, 8, -13, 2, 3, 1, 11};
        int[] result = mergeSort(array1);
        System.out.println(Arrays.toString(result));
    }

    public static int[] mergeSort(int[] array1) {
        int[] Ar = Arrays.copyOf(array1, array1.length);
        int[] Ar2 = new int[array1.length];
        int[] result = mergeSortInner(Ar, Ar2, 0, array1.length);
        return result;
    }

    public static int[] mergeSortInner(int[] Ar, int[] Ar2,
                                       int firstI, int lastI) {
        if (firstI >= lastI - 1) {
            return Ar;
        }

        int middle = firstI + (lastI - firstI) / 2;
        int[] sorted1 = mergeSortInner(Ar, Ar2, firstI, middle);
        int[] sorted2 = mergeSortInner(Ar, Ar2, middle, lastI);

        int index1 = firstI;
        int index2 = middle;
        int destIndex = firstI;
        int[] result = sorted1 == Ar ? Ar2 : Ar;

        while (index1 < middle && index2 < lastI) {
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < lastI) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }
}