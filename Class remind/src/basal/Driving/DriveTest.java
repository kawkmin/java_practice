package basal.Driving;

import java.util.ArrayList;

public class DriveTest {
    public static void main(String[] args) {
        ArrayList<Car> carArrayList=new ArrayList<Car>();
        carArrayList.add(new Avante());
        carArrayList.add(new Genesis());
        carArrayList.add(new Grandeur());
        carArrayList.add(new Sonata());
        for(Car car:carArrayList){
            car.run();
            System.out.println("----------------------");
        }
    }
}
