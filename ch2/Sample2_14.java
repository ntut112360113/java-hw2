import java.io.*;

public class Sample2_14 {
    public static void main(String[] args) throws IOException {
        System.out.print("要跳過第幾次的處理呢？(1~10)：");
        int res = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());

        for (int i = 1; i <= 10; i++) {
            if (i == res) continue;
            System.out.println("第 " + i + " 次的處理。");
        }
    }
}
