package BackJoon.NewBee;

import java.util.Scanner;

public class q9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String output = "";
        for (int i =0; i<num;i++){
            String str = sc.next();
            output += str.charAt(0);
            output += str.charAt(str.length()-1);
            System.out.println(output);
            output ="";
        }
    }
}
