import java.util.Scanner;

public class Code05_02 {
    public static void main(String[] args){
        int a;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();

        if (a<100) {
            System.out.print("100보다 ");
            System.out.print("작습니다.");
        }
    }
}
