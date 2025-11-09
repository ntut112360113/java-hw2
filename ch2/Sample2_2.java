import java.io.*;

public class Sample2_2 {
    public static void main(String[] args) throws IOException {
        System.out.print("請輸入整數：");
        int num = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());

        if (num == 1)
            System.out.println("輸入的是1\n選擇的是1");

        System.out.println("結束處理");
    }
}
