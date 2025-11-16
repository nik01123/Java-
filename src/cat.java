//A pet interface is created which has the method play
//since cat class implements pet, there should be a method play inside the cat class
//else it shows an error
//I did not have to create a constructor for cat class, it automatically created for us
public class cat implements pet {
    public  void play() {
        System.out.println("The cat played");
    }
}
