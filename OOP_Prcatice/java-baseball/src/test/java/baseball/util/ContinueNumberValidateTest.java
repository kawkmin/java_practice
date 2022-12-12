package baseball.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class ContinueNumberValidateTest {
    @DisplayName("재시작 여부 숫자가 1 또는 2일 때 정상적인지 테스트")
    @Test
    void checkRightContinueNumber(){
        assertThat(ContinueNumberValidate.checkContinueNumber("1"));
        assertThat(ContinueNumberValidate.checkContinueNumber("2"));
    }

    @DisplayName("재시작 여부 숫자가 1 또는 2가 아닐 때 예외처리가 되는지 확인")
    @Test
    void checkWrongContinueNumber1(){
        assertThatThrownBy(()->ContinueNumberValidate.checkContinueNumber("4"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("재시작 여부 숫자가 1 또는 2가 아닐 때 예외처리가 되는지 확인")
    @Test
    void checkWrongContinueNumber2(){
        assertThatThrownBy(()->ContinueNumberValidate.checkContinueNumber("a"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("재시작 여부 숫자가 1 또는 2가 아닐 때 예외처리가 되는지 확인")
    @Test
    void checkWrongContinueNumber3(){
        assertThatThrownBy(()->ContinueNumberValidate.checkContinueNumber("12"))
                .isInstanceOf(IllegalArgumentException.class);
    }
}