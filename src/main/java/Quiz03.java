import java.util.Scanner;

public class Quiz03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;
        System.out.print("숫자를 입력 ==> ");
        a=s.nextInt();

        if ((a%3==0)&&(a%5==0)){
            System.out.println("3의 배수 와 5의 배수 모두 만족합니다.");
        } else if (a%3==0){
            System.out.println("3의 배수입니다.");
        } else if (a%5==0){
            System.out.println("5의 배수 입니다.");
        } else {
            System.out.println("3의 배수 5의 배수 모두 아닙니다.");
        }
    }
}
