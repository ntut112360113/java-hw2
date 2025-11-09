import java.io.*;

public class Sample2_13 {
    public static void main(String[] args) throws IOException {
        System.out.print("請問要在第幾次處理結束迴圈呢？(1~10)：");
        int res = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());

        for (int i = 1; i <= 10; i++) {
            System.out.println("第 " + i + " 次的處理。");
            if (i == res) break;
        }
    }
}
