package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CarsTest {
    @DisplayName("입력받은 문자열로 정상적으로 CarList에 담아지는지 확인")
    @Test
    void addCarList(){
        Cars cars=new Cars();
        cars.addCar("pobi,woni,jun");
        assertThat(cars.getCarList().stream()
                .map(car->car.getName())
                .collect(Collectors.toList()))
                .isEqualTo(
                        List.of(new Car("pobi").getName(),new Car("woni").getName(),new Car("jun").getName())
                );
    }
}