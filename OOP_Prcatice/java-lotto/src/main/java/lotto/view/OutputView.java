package lotto.view;

import lotto.model.Lotto;
import lotto.model.LottoGenerator;

import java.util.List;

import static lotto.view.ViewEnum.OUTPUT_PURCHASE_LOTTO;

public class OutputView {
    public OutputView() {
    }

    public void printPurchaseLotto(LottoGenerator lottoGenerator){
        System.out.printf(OUTPUT_PURCHASE_LOTTO.getMessage(),lottoGenerator.getCnt());
        lottoGenerator.getPurchaseLottos().stream()
                .forEach(lotto-> System.out.println(lotto.getNumbers()));
        System.out.println();
    }
}
