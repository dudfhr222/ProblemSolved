package BackJoon.NewBee;

import java.util.Scanner;

public class q2738 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int [][] suma = new int [a][b];
        int [][] sumb = new int [a][b];
        int [][] total = new int [a][b];
        for (int i =0; i<a;i++){
            for (int j = 0;j<b;j++){
                suma[i][j] = sc.nextInt();
            }
        }
        for (int i =0; i<a;i++){
            for (int j = 0;j<b;j++){
                sumb[i][j] = sc.nextInt();
            }
        }
        for (int i =0; i<a;i++){
            for (int j = 0;j<b;j++){
                total[i][j] = suma[i][j]+sumb[i][j];
                System.out.print(total[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
