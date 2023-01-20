import java.awt.*;

import static java.lang.Math.cos;
import static java.lang.Math.sin;

public abstract class Car implements Movable {
    /**
     *
     */
    public int nrDoors; // Number of doors on the car
    public double enginePower; // Engine power of the car
    public double currentSpeed; // The current speed of the car
    public Color color; // Color of the car
    public String modelName; // The car model name

    public double xPos;
    public double yPos;
    public double direction;


    public Car(int nrDoors, double enginePower, double currentSpeed, Color color,
               String modelName, double xPos, double yPos, double direction) {
        this.nrDoors = nrDoors;
        this.enginePower = enginePower;
        this.currentSpeed = currentSpeed;
        this.color = color;
        this.modelName = modelName;
        this.xPos = xPos;
        this.yPos = yPos;
        this.direction = direction;
    }

    public int getNrDoors() {
        return nrDoors;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color clr) {
        color = clr;
    }

    public void startEngine() {
        currentSpeed = 0.1;
    }

    public void stopEngine() {
        currentSpeed = 0;
    }

    public abstract double speedFactor();

    public void incrementSpeed(double amount) {
        currentSpeed = getCurrentSpeed() + speedFactor() * amount;
    }

    public void decrementSpeed(double amount) {
        currentSpeed = getCurrentSpeed() - speedFactor() * amount;
    }

    public double getX() {
        return xPos;
    }

    public double getY() {
        return yPos;
    }

    public double getDir() {
        return direction;
    }
    public void move(){
        double dX = cos(direction) * getCurrentSpeed();
        double dY = -sin(direction) * getCurrentSpeed();
        xPos += dX;
        yPos += dY;
    }
    public void turnLeft(){
        if(direction <= 0){ direction = 360; }
        --direction;
    }
    public void turnRight(){
        if(direction >=360) { direction = 0; }
        ++direction;
    }
}
