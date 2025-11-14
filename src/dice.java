import java.util.Random;

public class dice {
    private int faceUp1;
    private int faceUp2;
    Random rd;
    public dice() {
         this.rd = new Random();

    }

    public void roll(){
        faceUp1 = this.rd.nextInt(1,7);
        faceUp2 = this.rd.nextInt(1,7);
    }

    public int getFaceUp1() {
        return faceUp1;
    }

    public int getFaceUp2() {
        return faceUp2;
    }
}
