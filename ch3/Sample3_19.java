import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sample3_19 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("請輸入字串: ");
        String str1 = br.readLine();

        System.out.print("請輸入要檢索的文字: ");
        char ch = br.readLine().charAt(0);

        int index = str1.indexOf(ch);
        if (index != -1) {
            System.out.println(str1 + " 的第 " + (index + 1) + " 個字就是「" + ch + "」");
        } else {
            System.out.println(str1 + " 中沒有「" + ch + "」這個字");
        }
    }
}
