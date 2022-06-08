package BackJoon;

import java.util.Scanner;

public class q5622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char [] arr = str.toCharArray();
        int sum = 0;

        for(char c:arr){
            if(c>='A' && c<='C'){
                sum +=3;
            }
            else if(c>='D' && c<='F'){
                sum += 4;
            }
            else if(c>='G' && c<='I'){
                sum += 5;
            }
            else if(c>='J' && c<='L'){
                sum += 6;
            }
            else if(c>='M' && c<='O'){
                sum += 7;
            }
            else if(c>='P' && c<='S'){
                sum += 8;
            }
            else if(c>='T' && c<='V'){
                sum += 9;
            }
            else if(c>='W' && c<='Z'){
                sum += 10;
            }
        }

        System.out.println(sum);
    }
}
