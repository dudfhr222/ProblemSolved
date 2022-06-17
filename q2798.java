import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
        ArrayList<Integer> sumlist = new ArrayList<>();
        ArrayList<Integer> resultlist = new ArrayList<>();

        Arrays.sort(arr);

        for(int i=cardNum-1; i>=0; i--){
            int largest = arr[i];
            //작은거 2개씩 더함
            int sum = 0;
            int result = 0;
            for(int j=1;j<i;j++){
                sum = arr[j]+arr[j-1] + largest;
                result = targetNum - sum;
                
                sumlist.add(sum); //3개 더한 값
                resultlist.add(result);  //주어진 값에서 3개 더한 수 뺀 값

                if(result >= 0){
                }
                /*else{
                    resultlist.add();  //주어진 값보다 더한 값이 더 클 때
                }*/
            }
        }

        for (int i =0;i<resultlist.size();i++){
            System.out.print(resultlist.get(i) + " ");
        }
        System.out.println();
        for (int i =0;i<sumlist.size();i++){
            System.out.print(sumlist.get(i) + " ");
        }

        /*
        int min = Collections.min(resultlist);
        int minIndex = resultlist.indexOf(min);
        System.out.println();
        System.out.println("mini : " + minIndex);
        System.out.println(sumlist.get(minIndex));
        System.out.println();
        System.out.println();
        */
        /*
        int min = Collections.min(resultlist);
        int minIndex = resultlist.indexOf(min);
        System.out.println(minIndex);
        System.out.print(sumlist.get(minIndex));
         */
    }
}
