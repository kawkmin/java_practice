package lotto.utils;

import lotto.model.Lotto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static lotto.utils.ErrorEnum.*;

public class WinLottoValidator {
    private static final int LOTTO_SIZE = 6;
    private static final int MAX_NUMBER = 45;
    private static final int MIN_NUMBER = 1;

    public WinLottoValidator() {
    }

    public String checkWinLotto(String winLotto) {
        checkNumber(winLotto);
        checkSize(winLotto);
        checkDistinct(winLotto);
        checkMinMax(winLotto);
        return winLotto;
    }

    private void checkNumber(String winLotto) {
        try {
            List<Integer> lotto = new ArrayList<>();
            for (String number : winLotto.split(",")) {
                lotto.add(Integer.parseInt(number));
            }
        } catch (Exception e) {
            throw new IllegalArgumentException(WIN_LOTTO_NUMBER_ERROR.getMessage());
        }
    }

    private void checkSize(String winLotto) {
        if (winLotto.split(",").length != LOTTO_SIZE) {
            throw new IllegalArgumentException(WIN_LOTTO_SIZE_ERROR.getMessage());
        }
    }

    private void checkDistinct(String winLotto) {
        List<String> lotto = Arrays.asList(winLotto.split(","));
        lotto = lotto.stream().distinct().collect(Collectors.toList());

        if (lotto.size() != LOTTO_SIZE) {
            throw new IllegalArgumentException(WIN_LOTTO_DISTINCT_ERROR.getMessage());
        }
    }

    private void checkMinMax(String winLotto) {
        List<String> lotto = Arrays.asList(winLotto.split(","));
        if (lotto.stream().mapToInt(Integer::parseInt)
                .filter(number -> number > MIN_NUMBER && number <= MAX_NUMBER)
                .count() != LOTTO_SIZE) {
            throw new IllegalArgumentException(WIN_LOTTO_MIN_MAX_ERROR.getMessage());
        }
    }
}
