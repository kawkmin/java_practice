package racingcar.Utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InputValidator {
    public void checkCars(String strCars){
        List<String> listCars= Arrays.asList(strCars.split(","));
        for(String carName:listCars){
            if(carName.length()>5) {
                throw new IllegalArgumentException("5자 이하의 이름만 가능합니다");
            }
            if(carName.length()==0)
                throw new IllegalArgumentException("1자 이상의 이름만 가능합니다");
        }
    }
}
