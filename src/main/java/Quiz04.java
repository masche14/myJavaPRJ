import java.util.Scanner;

public class Quiz04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b;

        a=s.nextInt();
        b=s.nextInt();

        if (a<=b){
            for (int c=a; c<=b; c++){
                if (c%3==0) {
                    System.out.println(c + " ");
                }
            }
        } else if(a>b) {
            for (int c=a; c>=b; c--){
                if (c%3==0) {
                    System.out.print(c + " ");
                }
            }
        }

    }
}
