package BackJoon;

import java.util.Scanner;

import static java.lang.Math.max;

public class q10757 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String stra = sc.next();
        String strb = sc.next();

        int max = max(stra.length(), strb.length());
        int [] arra = new int [max+1];
        int [] arrb = new int [max+1];

        for(int i = stra.length()-1, idx=0;i>=0;i--,idx++){
            arra[idx] = stra.charAt(i)-'0';
        }
        for(int i = strb.length()-1,idx=0;i>=0;i--,idx++){
            arrb[idx] = strb.charAt(i)-'0';
        }


        for(int i = 0;i<max;i++){
            int result = arra[i]+arrb[i];
            arra[i] = result%10;
            arra[i+1] += (result/10); //자리수 추가
        }

        StringBuilder sb = new StringBuilder();
        if(arra[max] != 0){
            sb.append(arra[max]);
        }
        for(int i = max-1;i>=0;i--){
            sb.append(arra[i]);
        }
        System.out.println(sb);
    }
}
