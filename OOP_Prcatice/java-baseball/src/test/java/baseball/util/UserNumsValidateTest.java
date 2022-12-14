package baseball.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class UserNumsValidateTest {
    @DisplayName("유저 숫자가 정상적으로 입력했을 때, 예외 처리가 안되는지 확인")
    @Test
    void checkUserNums(){
        assertThat(UserNumsValidate.checkUserNums("123"));
    }

    @DisplayName("유저 숫자가 3개 이상일 때 예외 처리 되는지 확인")
    @Test
    void checkUserNumsSize(){
        assertThatThrownBy(()->UserNumsValidate.checkUserNums("1234"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("유저 숫자가 중복일 때, 예외 처리 되는지 확인")
    @Test
    void checkUserNumsDistinct(){
        assertThatThrownBy(()->UserNumsValidate.checkUserNums("112"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("유저 숫자가 아닐 때, 예외 처리 되는지 확인")
    @Test
    void checkUserNumsRight(){
        assertThatThrownBy(()->UserNumsValidate.checkUserNums("12a"))
                .isInstanceOf(IllegalArgumentException.class);
    }
}