package racingcar.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    @DisplayName("객체가 정상적으로 이름을 담는지 확인")
    @Test
    void makeCar(){
        Car car=new Car("pobi");
        assertThat(car.getName()).isEqualTo("pobi");
    }
}