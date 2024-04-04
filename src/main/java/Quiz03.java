import java.util.Scanner;

public class Quiz03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // 임의의 숫자를 입력받기 위해 Scanner 사용
        int a;
        System.out.print("숫자를 입력 ==> ");
        a=s.nextInt(); // 숫자 입력받기

        if ((a%3==0)&&(a%7==0)){ // 배수란 해당 숫자로 나눈 값의 나머지가 0이기 때문에 3과 7로 나눈 나머지 값이 모두 0인 수는 3과 7의 배수임
            System.out.println("3의 배수 와 7의 배수 모두 만족합니다.");
        } else if (a%3==0){ // 3으로 나눈 나머지 값만 0인 경우 3의 배수임
            System.out.println("3의 배수입니다.");
        } else if (a%7==0){ // 7로 나눈 나머지 값만 0인 경우 7의 배수임
            System.out.println("7의 배수 입니다.");
        } else { // 3과 7로 나눈 나머지 값이 둘다 0이 아닌 경우 그 어떤 수의 배수도 아님
            System.out.println("3의 배수 7의 배수 모두 아닙니다.");
        }
    }
}
