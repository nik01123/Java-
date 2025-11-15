public class cricket extends insects {
    double length;
    public cricket(int age, double length) {
        super(age,6);
        this.length = length;

    }

    public void say(){
        System.out.println("CHIRP");
    }

    public void jump(){
        System.out.println("A cricket jumped");
    }

}
