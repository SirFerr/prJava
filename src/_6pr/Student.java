package _6pr;
import java.util.Arrays;

public class Student {
    private int[] IDNumber={2,10,100,2,5,6};

    public Student(){
        System.out.println("Insertion");
        System.out.println(Arrays.toString(IDNumber));
        insertionSort();
        System.out.println(Arrays.toString(IDNumber));
    }

    public int[] getIDNumber() {
        return IDNumber;
    }

    public int[] insertionSort(){
        for (int left = 0; left < IDNumber.length; left++) {
            int value = IDNumber[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < IDNumber[i]) {
                    IDNumber[i + 1] = IDNumber[i];
                } else {
                    break;
                }
            }
            IDNumber[i + 1] = value;
        }
        return IDNumber;
    }
}
