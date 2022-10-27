package Driving;

public abstract class Car {
    public void start() {
    }

    public void drive() {
    }

    public void stop() {
    }

    public void turnoff() {
    }

    final void run() {
        start();
        drive();
        stop();
        turnoff();
    }
}
