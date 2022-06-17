import java.util.Scanner;

public class q2798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cardNum = sc.nextInt();
        int targetNum = sc.nextInt();

        int [] arr = new int [cardNum];

        for(int i =0;i<cardNum;i++){
            arr[i] = sc.nextInt();
        }
        int max = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    int sum = arr[i]+arr[j]+arr[k];
                    if(sum == targetNum){
                        System.out.println(sum);
                        return ;
                    }
                    if(sum <= targetNum){
                        max = Math.max(sum,max);
                    }
                }
            }
        }
        System.out.println(max);
    }
}
