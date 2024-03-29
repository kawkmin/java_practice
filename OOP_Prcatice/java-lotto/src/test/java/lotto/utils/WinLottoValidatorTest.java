package lotto.utils;

import lotto.utils.validators.WinLottoValidator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class WinLottoValidatorTest {
    private WinLottoValidator winLottoValidator=new WinLottoValidator();

    @DisplayName("당첨 번호가 정상적일 때 테스트")
    @Test
    void testRight(){
        assertThat(winLottoValidator.checkWinLotto("1,23,4,6,45,7"));
    }

    @DisplayName("당첨 번호가 6개가 아니면 예외처리 되는지 테스트")
    @Test
    void testSize(){
        IllegalArgumentException exception=assertThrows(IllegalArgumentException.class,
                ()-> winLottoValidator.checkWinLotto("1,2,3,4,5,6,7"));
        assertThat(exception.getMessage()).isEqualTo("[ERROR] 6개를 입력해 주세요");
    }

    @DisplayName("당첨 번호가 중복이 있으면 예외처리 되는지 테스트")
    @Test
    void testDistinct(){
        IllegalArgumentException exception=assertThrows(IllegalArgumentException.class,
                ()-> winLottoValidator.checkWinLotto("1,2,3,4,5,5"));
        assertThat(exception.getMessage()).isEqualTo("[ERROR] 중복된 숫자는 입력할 수 없습니다");
    }

    @DisplayName("당첨 번호가 숫자가 아니면 예외처리 되는지 테스트")
    @Test
    void testNumber(){
        IllegalArgumentException exception=assertThrows(IllegalArgumentException.class,
                ()-> winLottoValidator.checkWinLotto("1,2,3,b,5,a"));
        assertThat(exception.getMessage()).isEqualTo("[ERROR] 숫자를 입력해 주세요");
    }

    @DisplayName("당첨 번호가 1과 45사이가 아니면 예외처리 되는지 테스트")
    @Test
    void testMinMax(){
        IllegalArgumentException exception=assertThrows(IllegalArgumentException.class,
                ()-> winLottoValidator.checkWinLotto("1,2,3,100,4,5"));
        assertThat(exception.getMessage()).isEqualTo("[ERROR] 1과 45사이의 수만 입력해야합니다");

        IllegalArgumentException exception1=assertThrows(IllegalArgumentException.class,
                ()-> winLottoValidator.checkWinLotto("1,2,3,0,4,5"));
        assertThat(exception1.getMessage()).isEqualTo("[ERROR] 1과 45사이의 수만 입력해야합니다");
    }
}