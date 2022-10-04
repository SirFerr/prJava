package _6pr;

import java.util.Arrays;

public class MergeStudentList {
    private int[] IDNumber1={2,10,100,2,5,6};
    private int[] IDNumber2={3,11,101,3,6,7};
    private int[] result=new int[IDNumber1.length+IDNumber2.length];

    public MergeStudentList(){
        System.out.println("Merge");
        System.out.println(Arrays.toString(IDNumber1));
        System.out.println(Arrays.toString(IDNumber2));
        Merge();
        System.out.println(Arrays.toString(result));
        MergeSort(result,result.length);
        System.out.println(Arrays.toString(result));
    }
    public void Merge(){
        System.arraycopy(IDNumber1, 0, result, 0, IDNumber1.length);
        System.arraycopy(IDNumber2, 0, result, IDNumber1.length, IDNumber2.length);
    }
    public void MergeSort(int[] arr, int n){

        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = arr[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = arr[i];
        }
        MergeSort(l, mid);
        MergeSort(r, n - mid);

        merge(arr, l, r, mid, n - mid);
    };
    public static void merge(
            int[] arr, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                arr[k++] = l[i++];
            }
            else {
                arr[k++] = r[j++];
            }
        }
        while (i < left) {
            arr[k++] = l[i++];
        }
        while (j < right) {
            arr[k++] = r[j++];
        }
    }
}
