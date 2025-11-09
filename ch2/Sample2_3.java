import java.io.*;

public class Sample2_3 {
    public static void main(String[] args) throws IOException {
        System.out.print("請輸入整數：");
        int num = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());

        System.out.println(num == 1 ? "輸入的是1" : "選擇的是1以外的數字");
    }
}
