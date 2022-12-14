package lotto.controller;

import lotto.model.LottoGenerator;
import lotto.view.InputView;
import lotto.view.OutputView;

public class LottoController {
    private final InputView inputView;
    private final OutputView outputView;

    private LottoGenerator lottoGenerator;

    public LottoController() {
        this.inputView = new InputView();
        this.outputView = new OutputView();
    }

    public void start(){
        lottoGenerator=new LottoGenerator(inputView.purchaseMoney());
        outputView.printPurchaseLotto(lottoGenerator);
    }
}
