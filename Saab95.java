import java.awt.*;

public class Saab95 extends Car {
    public boolean turboOn;

    public Saab95(double currentSpeed, double xPos, double yPos, double direction) {
        super(2, 125, currentSpeed, Color.red, "Saab95",xPos, yPos, direction);
        turboOn = false;
        stopEngine();
    }


    public void setTurboOn() {
        turboOn = true;
    }

    public void setTurboOff() {
        turboOn = false;
    }

    public double speedFactor() {
        double turbo = 1;
        if (turboOn) turbo = 1.3;
        return enginePower * 0.01 * turbo;
    }



    // TODO fix this method according to lab pm
    public void gas(double amount) {
        incrementSpeed(amount);
    }

    // TODO fix this method according to lab pm
    public void brake(double amount) {
        decrementSpeed(amount);
    }
}
