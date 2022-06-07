package BackJoon.NewBee;

import java.util.Scanner;

public class q23037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;

        for(int i = 0;i<5;i++){
            int temp = num;
            int a = temp % 10;
            System.out.println("a = " + a);
            sum += multiple(a);
            System.out.println("sum = " + sum);
            temp = temp / 10;
            System.out.println("temp = " + temp);
        }
        System.out.println("sum = " + sum);
    }
    public static int multiple(int n){
        return n*n*n*n*n;
    }
}
