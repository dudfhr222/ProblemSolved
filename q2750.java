package BackJoon;

import java.util.Arrays;
import java.util.Scanner;

public class q2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int [] arr = new int [num];
        for (int i =0;i<num;i++){
            int a = sc.nextInt();
            arr[i] = a;
        }
        Arrays.sort(arr);
        for (int i = 0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
