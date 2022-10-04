package _6pr;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortingStudentsByGPA implements Comparator {
    public SortingStudentsByGPA() {
        System.out.println("Quick");
        System.out.println(Arrays.toString(IDNumber));
        quickSort(IDNumber);
        System.out.println(Arrays.toString(IDNumber));
    }

    private Integer[] IDNumber={2,10,100,2,5,6},array;
    public Integer[] getIDNumber() {
        return IDNumber;
    }
    private int num;
    public void quickSort(Integer[] values) {
        if (values ==null || values.length==0){
            return;
        }
        this.array = values;
        num = values.length;
        quickSort(0, num - 1);
    }

    public void quickSort(int low, int high) {
        if (IDNumber.length == 0) {
            return;
        }
        if (low >= high) {
            return;
        }

        int middle = low + (high - low) / 2;
        int base = IDNumber[middle];

        int i = low;
        int j = high;
        while (i <= j) {
            while (IDNumber[i].compareTo(base) > 0) {
                i++;
            }
            while (IDNumber[j].compareTo(base) < 0) {
                j--;
            }
            if (i <= j) {
                int temp = IDNumber[i];
                IDNumber[i] = IDNumber[j];
                IDNumber[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j) {
            quickSort(low, j);
        }
        if (high > i) {
            quickSort(i, high);
        }
    }

}

