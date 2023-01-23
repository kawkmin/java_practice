package lotto.model;

import lotto.calculatorHelper;

public class CalculatorRanking {

    private final LottoGenerator lottoGenerator;
    private final WinLotto winLotto;

    private int[] resultRank;

    public CalculatorRanking(LottoGenerator lottoGenerator, WinLotto winLotto) {
        resultRank = new int[calculatorHelper.INDEX_SIZE.getHelpNumber()];
        this.lottoGenerator = lottoGenerator;
        this.winLotto = winLotto;
        calculateRanking();
    }

    private void calculateRanking() {
        for (Lotto lotto : lottoGenerator.getLottos()) {
            int index = calculateDetail(lotto);
            if (index != calculatorHelper.NO_RANK_INDEX.getHelpNumber()) {
                resultRank[index]++;
            }
        }
    }

    private int calculateDetail(Lotto lotto) {
        int index = (int) lotto.getNumbers().stream()
                .filter(number -> winLotto.getWinningLotto().getNumbers().contains(number))
                .count();
        if (index >= calculatorHelper.MIN_RIGHT.getHelpNumber()) {
            return calculateIndex(index, lotto);
        } else
            return calculatorHelper.NO_RANK_INDEX.getHelpNumber();
    }

    private int calculateIndex(int index, Lotto lotto) {
        if (index == calculatorHelper.NEED_CHECK_NUMBER.getHelpNumber())
            return calculateBonus(lotto);
        if (index == calculatorHelper.ALL_RIGHT.getHelpNumber())
            return calculatorHelper.ALL_RIGHT_INDEX.getHelpNumber();
        else
            return index - calculatorHelper.INDEX_ARRAY_HELPER.getHelpNumber();
    }

    private int calculateBonus(Lotto lotto) {
        if (lotto.getNumbers().contains(winLotto.getBonusNumber())) {
            return calculatorHelper.YES_BONUS_INDEX.getHelpNumber();
        } else {
            return calculatorHelper.NO_BONUS_INDEX.getHelpNumber();
        }
    }

    public int[] getResultRank() {
        return resultRank;
    }
}
