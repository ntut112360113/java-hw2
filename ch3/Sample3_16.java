import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sample3_16 {
    public static void main(String[] args) throws Exception {
        System.out.print("請輸入一個整數: ");
        int num = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        System.out.println("您輸入的數字是: " + num);
    }
}
