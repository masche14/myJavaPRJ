class Rabbit0513_02{
    protected String shape;
    protected int xPos;
    protected int yPos;

    void move(int x, int y){
        this.xPos=x;
        this.yPos=y;

        System.out.printf("[%d, %d] 위치에 있는 ",this.xPos,this.yPos);
    }

    int get_xPos() {
        return this.xPos;
    }
    int get_yPos() {
        return this.yPos;
    }
}
class HouseRabbit extends Rabbit0513_02{
    String owner;
    void eatFeed(){
        System.out.println("집토끼가 사료를 먹습니다.");
    }
    void move(int x, int y) {
        this.xPos = x;
        this.yPos = y;

        if (this.xPos > 100){
            this.xPos = 100;
        }
        if (this.yPos > 100){
            this.yPos = 100;
        }
        System.out.printf("[%d, %d] 위치에 있는 ",this.xPos,this.yPos);
    }
}

class MountainRabbit extends Rabbit0513_02{
    String mountain;
    void eatWildglass(){
        System.out.println("산토끼가 풀을 먹습니다.");
    }
}
public class Code08_02 {
    public static void main(String[] args) {
        HouseRabbit hr = new HouseRabbit();
        MountainRabbit mr = new MountainRabbit();

        hr.shape="사각형";
        hr.owner="스폰지밥";
        hr.move(500,500);
        System.out.printf("[%s] 모양의 ", hr.shape);
        hr.eatFeed();
//        System.out.printf("집토끼의 위치는 [%d, %d] 입니다.\n",hr.get_xPos(),hr.get_yPos());
        System.out.println();
        mr.shape="삼각형";
        mr.mountain="설악산";
        mr.move(500,500);
        System.out.printf("[%s] 모양의 ", mr.shape);
        mr.eatWildglass();
//        System.out.printf("산토끼의 위치는 [%d, %d] 입니다.\n",mr.get_xPos(),mr.get_yPos());


    }
}
