public class Sample2_22 {
    public static void main(String[] args) {
        int[][] test = {
            {80, 60, 22, 50, 75}, // 國語
            {90, 55, 68, 72, 58}  // 數學
        };

        for (int i = 0; i < test[0].length; i++) {
            System.out.println("第 " + (i + 1) + " 個人的國語分數是 " + test[0][i] + " 分");
            System.out.println("第 " + (i + 1) + " 個人的數學分數是 " + test[1][i] + " 分");
        }
    }
}
