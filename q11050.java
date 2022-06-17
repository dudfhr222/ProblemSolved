import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.println(re(a)/(re(a-b)*re(b)));
    }
    //(a!/b!(a-b)!)
    static int re(int num){
        if(num <= 1){
            return 1;
        }
        return num * re(num-1);
    }

}
