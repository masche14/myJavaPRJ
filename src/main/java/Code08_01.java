class Rabbit0513{
    String shape;
    int xPos;
    int yPos;
    static int count;
    Rabbit0513(){
        count++;
    }
}
public class Code08_01 {
    public static void main(String[] args) {
        System.out.printf("토끼 객체 생성 전 토끼 마리 수 : %d \n", Rabbit0513.count);
        Rabbit0513 rabbit1 = new Rabbit0513();
        System.out.printf("토끼 객체1 생성 후 토끼 마리 수 : %d \n", Rabbit0513.count);
        Rabbit0513 rabbit2 = new Rabbit0513();
        System.out.printf("토끼 객체2 생성 후 토끼 마리 수 : %d \n", Rabbit0513.count);
    }
}
