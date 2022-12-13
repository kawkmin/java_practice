package lotto.utils;

import java.util.List;

import static lotto.utils.ErrorEnum.WIN_LOTTO_SIZE_ERROR;

public class WinLottoValidator {
    public WinLottoValidator() {
    }

    public String checkWinLotto(String winLotto){
        checkSize(winLotto);
        return winLotto;
    }

    private void checkSize(String winLotto){
        if(winLotto.split(",").length!=6){
            throw new IllegalArgumentException(WIN_LOTTO_SIZE_ERROR.getMessage());
        }
    }
}
