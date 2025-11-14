import java.awt.*;
public class Car {
    int avgMilesPerGallon;
    String licensePlate;
    Color paintColor;
    boolean areTailingsWorking;

    public Car(int inputAvgMPG,
               String inputLicensePlate,
               Color inputPaintColor,
               boolean inputareTailingsWorking){

        this.avgMilesPerGallon = inputAvgMPG;
        this.licensePlate = inputLicensePlate;
        this.paintColor = inputPaintColor;
        this.areTailingsWorking = inputareTailingsWorking;
    }

    public void changePaintColor(Color inputNewPaintColor){
        this.paintColor = inputNewPaintColor;
    }

    public double speedingUp(double currentSpeed){
        currentSpeed+=100;
        return currentSpeed;
//if func is call by ref, 100 can be added
//if fnc is call by value, then this method can do nothing.
//java is call by value mostly
    }

}
