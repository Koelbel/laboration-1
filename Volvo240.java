import java.awt.*;

public class Volvo240 extends Car {
    private final static double trimFactor = 1.25;

    public Volvo240(double currentSpeed, double xPos, double yPos, double direction) {
        super(4, 100, currentSpeed, Color.black,
                "Volvo240", xPos, yPos, direction);
        stopEngine();
    }

    public double speedFactor() {
        return enginePower * 0.01 * trimFactor;
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
