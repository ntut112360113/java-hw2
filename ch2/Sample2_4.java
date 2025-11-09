import java.io.*;

public class Sample2_4 {
    public static void main(String[] args) throws IOException {
        System.out.print("請輸入整數：");
        int num = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());

        if (num == 1)
            System.out.println("輸入的是1");
        else if (num == 2)
            System.out.println("輸入的是2");
        else
            System.out.println("請輸入1或2");
    }
}
