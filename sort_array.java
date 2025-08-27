import java.util.Arrays;
import java.util.Scanner;

class Sort {
    int size;
    int[] arr;

    Sort(int s, int[] a) {
        size = s;
        arr = a;
    }

    void sort012() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

public class sort_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int[] a = new int[s];
        for (int k = 0; k < s; k++) {  // Fixed the loop condition
            a[k] = sc.nextInt();
        }
        Sort st = new Sort(s, a);  // Corrected class name and removed square brackets from 'a'
        st.sort012();
    }
}
