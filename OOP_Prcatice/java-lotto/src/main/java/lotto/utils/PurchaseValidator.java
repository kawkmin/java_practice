package lotto.utils;

import static lotto.utils.ErrorEnum.MONEY_NUMBER_ERROR;

public class PurchaseValidator {
    private int money;

    public String checkPurchase(String purchaseMoney){
        checkNumber(purchaseMoney);

        return purchaseMoney;
    }

    private void checkNumber(String purchaseMoney){
        try{
            int money=Integer.parseInt(purchaseMoney);
        }catch (Exception exception){
            throw new IllegalArgumentException(MONEY_NUMBER_ERROR.getMessage());
        }
    }
}
