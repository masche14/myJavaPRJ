import java.util.Scanner;

public class Quiz02 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num;
        num = s.nextInt();
        for (int i=1; i<=num; i=i+2) {
            for (int j=1; j<=num; j++){
                if (j<=(num-i)/2) {
                    System.out.print(" ");
                } else if (j>num-(num-i)/2){
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            } System.out.println();
        }
    }
}
