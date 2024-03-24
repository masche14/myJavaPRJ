import java.util.Scanner;

public class Study0325 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num1, num2;

        System.out.println("시작 숫자를 입력하세요 ==> ");
        num1 = s.nextInt();
        System.out.println("마지막 숫자를 입력하세요 ==> ");
        num2 = s.nextInt();

        for (int a=num1; a<=num2; a++) {
            System.out.println(a);
        }
    }
}
