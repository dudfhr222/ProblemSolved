package BackJoon.NewBee;

import java.util.Scanner;

public class q10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int [] arr = new int [total];

        for (int i = 0;i<total;i++){
            arr[i] = sc.nextInt();
        }
        int findNum = sc.nextInt();
        int count = 0;
        for(int i =0;i< arr.length;i++){
            if(arr[i] == findNum) count++;
        }
        System.out.println(count);
    }
}
