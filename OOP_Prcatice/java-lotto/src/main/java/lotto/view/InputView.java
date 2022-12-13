package lotto.view;

import camp.nextstep.edu.missionutils.Console;
import lotto.utils.PurchaseValidator;

import static lotto.view.ViewEnum.*;

public class InputView {
    private PurchaseValidator purchaseValidator;

    public InputView() {
        purchaseValidator=new PurchaseValidator();
    }

    public String purchaseMoney(){
        System.out.println(INPUT_PURCHASE_MONEY.getMessage());
        return purchaseValidator.checkPurchase(Console.readLine());
    }
}
