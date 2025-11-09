import java.io.*;

public class Sample2_6 {
    public static void main(String[] args) throws IOException {
        System.out.print("請輸入 a 或 b：");
        char letter = new BufferedReader(new InputStreamReader(System.in)).readLine().charAt(0);

        switch (letter) {
            case 'a' -> System.out.println("輸入的是 a");
            case 'b' -> System.out.println("輸入的是 b");
            default -> System.out.println("請輸入 a 或 b");
        }
    }
}
