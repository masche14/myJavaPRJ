import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Code09_08 {
    public static void main(String[] args) {
        int[] ary = {33,99,11,77,22,88,66,44};
        Arrays.sort(ary);
        for (int data : ary){
            System.out.print(data+" ");
        }
        System.out.println();

        String[] strAry = {"한빛","아카데미","난생","처음","자바","열공"};
        Arrays.sort(strAry, Collections.reverseOrder());
        for (String data : strAry){
            System.out.print(data+" ");
        }
        System.out.println();

        List<Integer> arrayList = new ArrayList<>();

        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);
        arrayList.add(400);
        arrayList.add(500);


        System.out.println(arrayList.size());
        AtomicInteger hap= new AtomicInteger();

        arrayList.forEach(num -> hap.addAndGet(num));
        System.out.println(hap.get());

    }
}
