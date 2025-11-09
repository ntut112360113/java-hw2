import java.io.*;

public class Sample2_8 {
    public static void main(String[] args) throws IOException {
        System.out.print("請問要選哪條路線？請輸入整數：");
        int res = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());

        char ans = (res == 1) ? 'A' : 'B';
        System.out.println("選擇了 " + ans + " 路線");
    }
}
