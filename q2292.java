package BackJoon;

import java.util.Scanner;

public class q2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int total = 1;
        int step = 1;
        while(total < num){
            total += 6*(step++);
        }
        System.out.println(step);
    }
}
