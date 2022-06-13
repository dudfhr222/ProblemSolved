package BackJoon;

import java.util.Scanner;

public class q2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        String result = Integer.toString(a*b*c);
        int [] arr = new int [result.length()];
        int [] counting = new int [10];

        for(int i =0;i<result.length();i++){
            arr[i] = result.charAt(i)-'0';

        }

        for(int j = 0;j<10;j++){
            for(int i =0;i<result.length();i++){
                if(j == arr[i]){
                    counting[j]++;
                }
            }
            System.out.println(counting[j]);
        }
    }
}
