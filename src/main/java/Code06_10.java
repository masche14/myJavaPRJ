import java.util.Scanner;

public class Code06_10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("몇단부터 시작할지 입력하세요. ==> ");
        int n = s.nextInt();

        for (int i = n; i <= 9; i++){
            for (int j = 1; j <= 9; j++){
                int c=i*j;
                if (j<9) {
                    System.out.printf("%d X %d = %2d, ", i, j, c);
                } else {
                    System.out.printf("%d X %d = %2d ", i, j, c);
                }
            }
            System.out.println();
        }
    }
}
