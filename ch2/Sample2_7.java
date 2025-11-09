import java.io.*;

public class Sample2_7 {
    public static void main(String[] args) throws IOException {
        System.out.print("請問你是男生嗎？請輸入 Y 或 N：");
        char letter = new BufferedReader(new InputStreamReader(System.in)).readLine().charAt(0);

        if (letter == 'Y' || letter == 'y')
            System.out.println("你是男生阿!");
        else if (letter == 'N' || letter == 'n')
            System.out.println("你是女生阿!");
        else
            System.out.println("請輸入 Y 或 N");
    }
}
