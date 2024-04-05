import java.util.Scanner;

public class Study0405 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num, a, b, c;
        String str;
        System.out.print("두 숫자를 띄어쓰기 하여 입력하세요. ==> ");
        str = s.nextLine();

        a=Integer.parseInt(str.split(" ")[0]);
        b=Integer.parseInt(str.split(" ")[1]);
        c=a+b;

        System.out.println(a+"+"+b+"="+c);
    }
}
