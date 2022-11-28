package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cars {
    private List<Car> carList=new ArrayList<>();

    public void addCar(String carName){
        Arrays.asList(carName.split(",")).stream()
                .forEach(name->carList.add(new Car(name)));
    }
}
