package lotto.model;

import lotto.utils.ErrorEnum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class WinLotto {
    private final Lotto winningLotto;
    private final int bonusNumber;

    public WinLotto(String winningLotto, String bonusNumber) {
        this.winningLotto = addWinningLotto(winningLotto);
        this.bonusNumber = checkBonusNumber(Integer.parseInt(bonusNumber));
    }

    public Lotto addWinningLotto(String winningLotto) {
        List<String> winningLottoList = Arrays.asList(winningLotto.split(","));
        List<Integer> LottoNumber = new ArrayList<>();
        winningLottoList.stream()
                .mapToInt(Integer::parseInt)
                .forEach(number -> LottoNumber.add(number));

        return new Lotto(LottoNumber);
    }

    private int checkBonusNumber(int bonusNumber) {
        if (this.winningLotto.getNumbers().stream()
                        .anyMatch(number -> number == bonusNumber))
            throw new IllegalArgumentException(ErrorEnum.WIN_LOTTO_BONUS_DISTINCT_ERROR.getMessage());
        else
            return bonusNumber;
    }
}
