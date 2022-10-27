package Driving;

public class Genesis extends Car{
    @Override
    public void start() {
        System.out.println("Gensis 시동을 켭니다");
    }

    @Override
    public void drive() {
        System.out.println("Gensis 달립니다");
    }

    @Override
    public void stop() {
        System.out.println("Gensis 멈춥니다");
    }

    @Override
    public void turnoff() {
        System.out.println("Gensis 시동을 끕니다");
    }
}
