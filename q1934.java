import java.util.Scanner;

public class q1934 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int testNum = sc.nextInt();
        for(int i=0;i<testNum;i++){

            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a*b/gcd(a,b));

        }
    }
    static int gcd(int a, int b){
        while(b!=0){
            int r = a%b;
            a=b;
            b=r;
        }
        return a;
    }
}
