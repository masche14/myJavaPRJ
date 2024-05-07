class Rabbit1 {
    String shape;
    int xPos;
    int yPos;

    Rabbit1(String shape){
        this.shape = shape;
    }

    void setPosition(int xPos, int yPos){
        this.xPos = xPos;
        this.yPos = yPos;

        System.out.printf("xPos : %d / yPos : %d \n", this.xPos, this.yPos);
    }
}
public class Code07_09 {
    public static void main(String[] args) {
        Rabbit1 rabbit1 = new Rabbit1("원");
        Rabbit1 rabbit2 = new Rabbit1("삼각형");
        Rabbit1 rabbit3 = new Rabbit1("토끼");

        rabbit1.setPosition(100,100);
        rabbit2.setPosition(-100,100);
        rabbit3.setPosition(0,-100);

        System.out.printf("rabbit1의 모양은 [%s]입니다.\n", rabbit1.shape);
        System.out.printf("rabbit2의 모양은 [%s]입니다.\n", rabbit2.shape);
        System.out.printf("rabbit3의 모양은 [%s]입니다.\n", rabbit3.shape);

    }
}
