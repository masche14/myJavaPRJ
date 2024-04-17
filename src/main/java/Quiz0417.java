import java.util.Scanner;

public class Quiz0417 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("자료 개수를 입력하세요.");
        int a = s.nextInt();

        int[] arr = new int[a];

        for (int i=0; i<a; i++) {
            System.out.println("자료값을 입력하세요.");
            int b = s.nextInt();

            arr[i] = b;
        }

        for (int i=1; i<arr.length; i++){
            for (int j=0; j<arr.length-i; j++) {
                if (arr[j]>arr[j+1]){
                    int c = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = c;
                }
            }
        }
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
