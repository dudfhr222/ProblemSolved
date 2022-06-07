package BackJoon.NewBee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class q10872 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int num = Integer.parseInt(br.readLine());
//        int sum = factorial(num);
//        System.out.println(sum);
//    }
//    public static int factorial(int num){
//        if(num<1) return 1;
//        return num*factorial(num-1);
//    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int result = 1;
        while(num!=0){
            result *= num;
            num--;
        }
        System.out.println(result);
    }
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        sc.close();
//
//        int sum = 1;
//        while(n!=0){
//            sum*=n;
//            n--;
//        }
//        System.out.println(sum);
//    }
}
