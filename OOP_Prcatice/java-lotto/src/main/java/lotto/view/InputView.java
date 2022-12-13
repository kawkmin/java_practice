package lotto.view;

import camp.nextstep.edu.missionutils.Console;
import lotto.utils.PurchaseValidator;

import static lotto.view.ViewEnum.*;

public class InputView {
    private PurchaseValidator purchaseValidator;

    public InputView() {
        purchaseValidator=new PurchaseValidator();
    }

    public String readPurchaseMoney(){
        System.out.println(INPUT_PURCHASE_MONEY.getMessage());
        return purchaseValidator.checkPurchase(Console.readLine());
    }

    public String readWinLotto(){
        System.out.println(INPUT_WIN_LOTTO.getMessage());
        return Console.readLine();
    }
}
