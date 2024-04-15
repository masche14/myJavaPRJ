import java.util.Scanner;

public class Code06_06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b, hap;
        hap=0;

        while (true){
            a = s.nextInt();
            b= s.nextInt();

            if (a<b) {
                for (int i=a; i<=b; i++){
                    if (i%2 != 0) {
                        hap=hap+i;
                    }
                } break;
            }else if (a>b) {
                for (int i=a; i>=b; i--){
                    if (i%2 != 0) {
                        hap=hap+i;
                    }
                } break;
            } else {
                System.out.println("값을 다시 입력하세요.");
            }
        }
        System.out.printf("%d부터 %d까지의 합계 : %d \n", a, b, hap);
    }
}
