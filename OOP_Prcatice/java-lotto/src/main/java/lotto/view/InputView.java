package lotto.view;

import camp.nextstep.edu.missionutils.Console;
import lotto.utils.validators.BonusNumberValidator;
import lotto.utils.validators.PurchaseValidator;
import lotto.utils.validators.WinLottoValidator;

import static lotto.view.ViewEnum.*;

public class InputView {
    private PurchaseValidator purchaseValidator;
    private WinLottoValidator winLottoValidator;
    private BonusNumberValidator bonusNumberValidator;

    public InputView() {
        purchaseValidator=new PurchaseValidator();
        winLottoValidator=new WinLottoValidator();
        bonusNumberValidator=new BonusNumberValidator();
    }

    public String readPurchaseMoney(){
        System.out.println(INPUT_PURCHASE_MONEY.getMessage());
        return purchaseValidator.checkPurchase(Console.readLine());
    }

    public String readWinLotto(){
        System.out.println(INPUT_WIN_LOTTO.getMessage());
        return winLottoValidator.checkWinLotto(Console.readLine());
    }

    public String readWinLottoOfBonusNumber(){
        System.out.println(INPUT_BONUS_NUMBER.getMessage());
        return bonusNumberValidator.checkBonusNumber(Console.readLine());
    }
}
