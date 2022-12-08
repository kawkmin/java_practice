package racingcar.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CarsTest {
    @DisplayName(",를 포함한 문자열에서 자동차 리스트로 저장되는지 확인")
    @Test
    void makeCarsTest(){
        Cars cars=new Cars();
        cars.addCar("pobi,woni,jun");
        List<String> carNameList=cars.getCarList().stream().map(s->s.getName())
                                .collect(Collectors.toList());
        assertThat(carNameList).isEqualTo(Arrays.asList("pobi","woni","jun"));
    }
}