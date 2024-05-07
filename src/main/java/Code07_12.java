class Rabbit2 {
    private String shape;
    private int xPos;
    private int yPos;

//    Rabbit2(String shape){
//        this.shape = shape;
//    }

    void setPosition(int xPos, int yPos){
        this.xPos = xPos;
        this.yPos = yPos;

        System.out.printf("xPos : %d / yPos : %d \n", this.xPos, this.yPos);
    }
}
public class Code07_12 {
    public static void main(String[] args) {
        Rabbit2 rabbit = new Rabbit2();

        rabbit.setPosition(100, 200);
    }
}
