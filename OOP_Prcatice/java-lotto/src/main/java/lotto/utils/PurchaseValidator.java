package lotto.utils;

import static lotto.utils.ErrorEnum.MONEY_NUMBER_ERROR;
import static lotto.utils.ErrorEnum.MONEY_UNIT_ERROR;

public class PurchaseValidator {
    private static final int MONEY_UNIT=1000;
    private int money;

    public PurchaseValidator() {
    }

    public String checkPurchase(String purchaseMoney){
        checkNumber(purchaseMoney);
        checkUnit(money);
        return purchaseMoney;
    }

    private void checkNumber(String purchaseMoney){
        try{
            int money=Integer.parseInt(purchaseMoney);
        }catch (Exception exception){
            throw new IllegalArgumentException(MONEY_NUMBER_ERROR.getMessage());
        }
    }

    private void checkUnit(int money){
        if(money%MONEY_UNIT!=0)
            throw new IllegalArgumentException(MONEY_UNIT_ERROR.getMessage());
    }
}
