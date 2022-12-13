package lotto.utils;

import lotto.model.Lotto;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static lotto.utils.ErrorEnum.WIN_LOTTO_DISTINCT_ERROR;
import static lotto.utils.ErrorEnum.WIN_LOTTO_SIZE_ERROR;

public class WinLottoValidator {
    private static final int LOTTO_SIZE=6;

    public WinLottoValidator() {
    }

    public String checkWinLotto(String winLotto){
        checkSize(winLotto);
        checkDistinct(winLotto);
        return winLotto;
    }

    private void checkSize(String winLotto){
        if(winLotto.split(",").length!=LOTTO_SIZE){
            throw new IllegalArgumentException(WIN_LOTTO_SIZE_ERROR.getMessage());
        }
    }

    private void checkDistinct(String winLotto){
        List<String> lotto= Arrays.asList(winLotto.split(","));
        lotto= lotto.stream().distinct().collect(Collectors.toList());

        if(lotto.size()!=LOTTO_SIZE){
            throw new IllegalArgumentException(WIN_LOTTO_DISTINCT_ERROR.getMessage());
        }
    }
}
