package lotto.utils;

import lotto.model.WinLotto;
import lotto.utils.validators.BonusNumberValidator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BonusNumberValidatorTest {
    private BonusNumberValidator bonusNumberValidator=new BonusNumberValidator();
    @DisplayName("보너스 숫자가 정상적일 때, 테스트")
    @Test
    void testRight(){
        assertThat(bonusNumberValidator.checkBonusNumber("3"));
    }

    @DisplayName("보너스 숫자가 숫자가 아닐때, 예외처리 테스트")
    @Test
    void testNumber(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> bonusNumberValidator.checkBonusNumber("abc") );
        assertThat(exception.getMessage()).isEqualTo("[ERROR] 숫자를 입력해 주세요");
    }

    @DisplayName("보너스 숫자가 1에서 45사이가 아닐때, 예외처리 테스트")
    @Test
    void testSize(){
        IllegalArgumentException exception=assertThrows(IllegalArgumentException.class,
                ()-> bonusNumberValidator.checkBonusNumber("46"));
        assertThat(exception.getMessage()).isEqualTo("[ERROR] 1과 45사이의 수만 입력해야합니다");

        IllegalArgumentException exception1=assertThrows(IllegalArgumentException.class,
                ()-> bonusNumberValidator.checkBonusNumber("0"));
        assertThat(exception1.getMessage()).isEqualTo("[ERROR] 1과 45사이의 수만 입력해야합니다");
    }

    @DisplayName("보너스 숫자가 당첨 로또랑 번호가 중복일 때, 예외처리 테스트")
    @Test
    void testDistinct(){
        final WinLotto[] winLotto = new WinLotto[1];
        IllegalArgumentException exception=assertThrows(IllegalArgumentException.class,
                ()-> winLotto[0] =new WinLotto("1,2,3,4,5,6","1"));

        assertThat(exception.getMessage()).isEqualTo("[ERROR] 당첨 로또와 중복되면 안됩니다.");
    }
}