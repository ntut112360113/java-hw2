import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sample3_21 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("請輸入兩個整數");
        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());

        int max = Math.max(num1, num2);
        System.out.println(num1 + " 與 " + num2 + " 中較大的是 " + max);
    }
}
