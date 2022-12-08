package racingcar.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cars {
    private List<Car> carList;

    public Cars() {
        carList=new ArrayList<>();
    }

    public void addCar(String strCars){
        for(String carName:strCars.split(",")){
            carList.add(new Car(carName));
        }
    }

    public List<Car> getCarList() {
        return carList;
    }
}
