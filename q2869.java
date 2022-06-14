import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class q2869 {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        double a = Integer.parseInt(st.nextToken());
        double b = Integer.parseInt(st.nextToken());
        double c = Integer.parseInt(st.nextToken());

        double result = Math.ceil((c-b)/(a-b));
        int re = (int) result;
        System.out.println(re);
    }
}
