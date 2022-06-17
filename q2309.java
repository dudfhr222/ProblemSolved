import java.util.Arrays;
import java.util.Scanner;

public class q2309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int [9];
        int sum = 0;
        for(int i =0;i<9;i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        Arrays.sort(arr);
        int numa = 0;
        int numb = 0;
        for(int i=0;i<9;i++){
            for(int j=i+1;j<9;j++){
                if(sum-arr[i]-arr[j]==100){
                    numa = arr[i];
                    numb = arr[j];
                }
            }
        }
        for(int i=0;i<9;i++){
            if(arr[i] == numa || arr[i] == numb){
                continue;
            }
            System.out.println(arr[i]);
        }

    }
}
