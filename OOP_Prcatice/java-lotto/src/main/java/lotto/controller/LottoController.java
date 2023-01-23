package lotto.controller;

import lotto.model.LottoGenerator;
import lotto.model.WinLotto;
import lotto.view.InputView;
import lotto.view.OutputView;

public class LottoController {
    private final InputView inputView;
    private final OutputView outputView;

    private LottoGenerator lottoGenerator;
    private WinLotto winLotto;

    public LottoController() {
        this.inputView = new InputView();
        this.outputView = new OutputView();
    }

    public void start(){
        try {
            buyLotto();
            makeWinLotto();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    private void buyLotto(){
        lottoGenerator=new LottoGenerator(inputView.readPurchaseMoney());
        outputView.printPurchaseLotto(lottoGenerator);
    }

    private void makeWinLotto(){
        String winLottoNumbers=inputView.readWinLotto();
        String winLottoBonusNumber=inputView.readWinLottoOfBonusNumber();
        winLotto=new WinLotto(winLottoNumbers,winLottoBonusNumber);
    }
}
