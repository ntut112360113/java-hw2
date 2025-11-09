import java.io.*;

public class Sample2_20 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] test = new int[5];

        System.out.println("請輸入5個人的分數：");
        for (int i = 0; i < test.length; i++)
            test[i] = Integer.parseInt(br.readLine());

        // 由大到小排序
        for (int i = 0; i < test.length - 1; i++)
            for (int j = i + 1; j < test.length; j++)
                if (test[j] > test[i]) {
                    int tmp = test[i];
                    test[i] = test[j];
                    test[j] = tmp;
                }

        for (int i = 0; i < test.length; i++)
            System.out.println("第 " + (i + 1) + " 名的分數是 " + test[i]);
    }
}
