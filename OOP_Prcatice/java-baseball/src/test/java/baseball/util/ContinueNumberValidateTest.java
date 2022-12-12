package baseball.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class ContinueNumberValidateTest {
    @DisplayName("재시작 여부 숫자가 1 또는 2일 때 정상적인지 테스트")
    @Test
    void checkContinueNumber(){
        assertThat(ContinueNumberValidate.checkContinueNumber("1"));
        assertThat(ContinueNumberValidate.checkContinueNumber("2"));
    }
}