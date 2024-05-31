import java.util.Scanner;

interface Notification{
    abstract void write();
    abstract String load();
    abstract String delete();
}
class imp_Notification implements Notification{
    Scanner s = new Scanner(System.in);
    private String topic;

    @Override
    public void write() {
        this.topic=s.nextLine();
    }

    @Override
    public String load() {
        return this.topic;
    }

    @Override
    public String delete() {
        return null;
    }
}
public class Code08_09 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        imp_Notification imNoti = new imp_Notification();
        String topic;
        int select;

        while (true) {
            System.out.println("본문을 입력하세요.");
            imNoti.write();
            topic = imNoti.load();
            System.out.println("입력한 본문 내용은 다음과 같습니다.");
            System.out.println(topic);

            System.out.print("<1>삭제 <2>수정 <3>종료 ==> ");
            select = s.nextInt();

            if (select == 1){
                topic = imNoti.delete();
                System.out.println("본문을 삭제합니다.");
                break;
            }
            else if (select == 2){
                System.out.println("본문을 수정합니다.");
                System.out.print("수정할 ");
                continue;
            } else {
                break;
            }
        }


    }
}
