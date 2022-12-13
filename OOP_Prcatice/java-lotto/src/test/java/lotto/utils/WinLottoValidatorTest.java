package lotto.utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class WinLottoValidatorTest {
    private WinLottoValidator winLottoValidator=new WinLottoValidator();

    @DisplayName("당첨 번호가 6개가 아니면 예외처리 되는지 테스트")
    @Test
    void testSize(){
        IllegalArgumentException exception=assertThrows(IllegalArgumentException.class,
                ()-> winLottoValidator.checkWinLotto("1,2,3,4,5,6,7"));
        assertThat(exception.getMessage()).isEqualTo("[ERROR] 6개를 입력해 주세요");
    }
}