import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sample3_18 {
    public static void main(String[] args) throws Exception {
        System.out.print("請輸入英文字母: ");
        String str = new BufferedReader(new InputStreamReader(System.in)).readLine();

        System.out.println("轉換成大寫時為 " + str.toUpperCase());
        System.out.println("轉換成小寫時為 " + str.toLowerCase());
    }
}
