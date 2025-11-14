public class Spider extends insects {
    boolean isPoisonous;
    public Spider(int age, boolean isPoisonous) {
        super(age, 8);
        this.isPoisonous = isPoisonous;


    }
    
    public void say(){
        System.out.println("HISSS...");
    }
}
