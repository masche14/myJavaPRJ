import java.util.Scanner;

abstract class Rabbit0520{
    public String color;
    private int xPos;
    private int yPos;

    void setPos(int xPos, int yPos){
        this.xPos=xPos;
        this.yPos=yPos;
        System.out.printf("[%d, %d]에 위치한 ", this.xPos, this.yPos);
    }
    abstract void sleep();

}
class HouseRabbit0520 extends Rabbit0520{
    @Override
    void setPos(int xPos, int yPos) {
        if (xPos > 100){
            xPos=100;
        }
        if (yPos > 100){
            yPos=100;
        }
        super.setPos(xPos, yPos);
    }

    @Override
    void sleep() {
        System.out.println("집토끼가 잠을 잡니다.");
    }
}

class MountainRabbit0520 extends Rabbit0520{
    @Override
    void setPos(int xPos, int yPos) {
        super.setPos(xPos, yPos);
    }

    @Override
    void sleep() {
        System.out.println("산토끼가 잠을 잡니다.");
    }
}
public class Code08_08 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        HouseRabbit0520 hr = new HouseRabbit0520();
        MountainRabbit0520 mr = new MountainRabbit0520();

        int xPos, yPos;

        hr.color="노란색";
        System.out.print("위치 좌표를 입력하세요(x y) ==> ");
        xPos = s.nextInt();
        yPos = s.nextInt();
        hr.setPos(xPos, yPos);
        System.out.printf("%s 색상의 ", hr.color);
        hr.sleep();

        mr.color="노란색";
        System.out.print("위치 좌표를 입력하세요(x y) ==> ");
        xPos = s.nextInt();
        yPos = s.nextInt();
        mr.setPos(xPos, yPos);
        System.out.printf("%s 색상의 ", mr.color);
        mr.sleep();
    }
}
