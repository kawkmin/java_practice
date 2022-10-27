package Driving;

public class Avante extends Car {
    @Override
    public void start() {
        System.out.println("avate 시동을 켭니다");
    }

    @Override
    public void drive() {
        System.out.println("avante 달립니다");
    }

    @Override
    public void stop() {
        System.out.println("avante 멈춥니다");
    }

    @Override
    public void turnoff() {
        System.out.println("avante 시동을 끕니다");
    }
}
