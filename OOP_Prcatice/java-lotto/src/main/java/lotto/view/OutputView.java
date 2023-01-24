package lotto.view;

import lotto.calculatorHelper;
import lotto.model.CalculatorRanking;
import lotto.model.LottoGenerator;

import static lotto.calculatorHelper.*;
import static lotto.view.ViewEnum.*;

public class OutputView {
    private final String[] price = {"5,000", "50,000", "1,500,000", "30,000,000", "2,000,000,000"};

    public OutputView() {
    }

    public void printPurchaseLotto(LottoGenerator lottoGenerator) {
        System.out.printf(OUTPUT_PURCHASE_LOTTO.getMessage(), lottoGenerator.getCnt());
        lottoGenerator.getLottos().stream()
                .forEach(lotto -> System.out.println(lotto.getNumbers()));
        System.out.println();
    }

    public void printResultRanking(CalculatorRanking calculatorRanking) {
        System.out.println(OUTPUT_RESULT_RANKING_MESSAGE.getMessage());
        int[] resultRank = calculatorRanking.getResultRank();
        for (int i = 0; i < resultRank.length; i++) {
            detailResultRanking(resultRank,i);
        }
        System.out.printf(OUTPUT_ADVANCED_RATE.getMessage(),calculatorRanking.getAdvancedRate());
    }

    private void detailResultRanking(int[] resultRank,int i){
        if (i == YES_BONUS_INDEX.getHelpNumber()) {
            System.out.printf(OUTPUT_RESULT_RANKING.getMessage(), NEED_CHECK_BONUS.getHelpNumber(),
                    OUTPUT_BONUS_RESULT_RANKING.getMessage(), price[i], resultRank[i]);
            return;
        }
        if (i == ALL_RIGHT_INDEX.getHelpNumber()) {
            System.out.printf(OUTPUT_RESULT_RANKING.getMessage(), ALL_RIGHT.getHelpNumber(),"", price[i], resultRank[i]);
            return;
        }
        System.out.printf(OUTPUT_RESULT_RANKING.getMessage(), i + INDEX_ARRAY_HELPER.getHelpNumber(), "", price[i], resultRank[i]);
    }

}
