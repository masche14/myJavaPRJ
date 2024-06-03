import java.util.Scanner;

interface Car{
    void move();
    void color(String color);
}
interface Cannon{
    abstract void fire();
}
class Tank implements Car, Cannon{
    Scanner s = new Scanner(System.in);
    private int xPos, yPos;
    private String color;

    @Override
    public void color(String color) {
        this.color = color;
        System.out.printf("%s 색상의 ", this.color);
    }
    @Override
    public void move() {
        System.out.print("탱크를 이동시킬 좌표를 입력하세요 ==> ");
        this.xPos = s.nextInt();
        this.yPos = s.nextInt();
        System.out.printf("탱크가 [%d, %d] 위치로 이동합니다.", this.xPos, this.yPos);
    }

    @Override
    public void fire() {
        System.out.println("탱크가 발포를 시작합니다.");
    }


}
public class Code08_10 {
    public static void main(String[] args) {

        Tank tank = new Tank();

        tank.color("노란색");
        tank.move();
        tank.fire();

    }
}
