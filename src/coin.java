import java.util.Random;

public class coin {
    public final static int H=0;
    public final static int T=1;
    private int faceUp;
    private int cH ;
    private int cT ;

    public coin(){
        flip();
    }

    public void flip() {
        Random rnd = new Random();
            faceUp = rnd.nextInt(2);

    }

    public String fceShow(){
            if(faceUp == H){
                cH += 1;
                return "Head";
                }

            else if(faceUp==T){
                cT+=1;
                return "Tail";
            }
            else{
                return "invalid";}
    }

public void showcount(){
    System.out.println(cH+","+cT);
}



}
