package lotto.view;

import camp.nextstep.edu.missionutils.Console;
import lotto.utils.PurchaseValidator;

public class InputView {
    private PurchaseValidator purchaseValidator;

    public InputView() {
        purchaseValidator=new PurchaseValidator();
    }

    public String purchaseMoney(){
        return purchaseValidator.checkPurchase(Console.readLine());
    }
}
