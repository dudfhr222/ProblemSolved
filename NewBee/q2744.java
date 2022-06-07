package BackJoon.NewBee;

import java.util.Scanner;

public class q2744 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String output = "";
        int temp = 0;
        for (int i =0; i<str.length();i++){
            temp = (int)str.charAt(i);
            if(temp>=65 && temp<=90){
                output += (char)(temp+32);
            }else if(temp>=97 && temp<=122){
                output+= (char)(temp-32);
            }
        }
        System.out.println(output);
    }
}
