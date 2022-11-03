package basal.Driving;

public class Grandeur extends Car{
    @Override
    public void start() {
        System.out.println("Graneur 시동을 켭니다");
    }

    @Override
    public void drive() {
        System.out.println("Graneur 달립니다");
    }

    @Override
    public void stop() {
        System.out.println("Graneur 멈춥니다");
    }

    @Override
    public void turnoff() {
        System.out.println("Graneur 시동을 끕니다");
    }
}
