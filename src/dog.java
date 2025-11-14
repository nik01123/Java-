import java.awt.*;

public class dog {
    Color colorOfDog;
    String breedOfDog;
    String nameOfDog;
    String[] fetchedItems = {"stick","bone","ball"};
    int fetchCounter = 0;
    public dog(Color inputColor, String inputBreed, String inputName) {
        this.colorOfDog = inputColor;
        this.breedOfDog = inputBreed;
        this.nameOfDog = inputName;

    }
public void bark(){
    System.out.println("bark");
}

public void fetch(){
    this.fetchCounter = (this.fetchCounter+1)%3;
    String item = this.fetchedItems[this.fetchCounter];
    System.out.println(nameOfDog+" fetched "+item);
}
}
