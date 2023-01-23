package lotto.utils.validators;

import lotto.utils.ErrorEnum;

import static lotto.utils.ErrorEnum.WIN_LOTTO_MIN_MAX_ERROR;
import static lotto.utils.ErrorEnum.WIN_LOTTO_NUMBER_ERROR;

public class BonusNumberValidator {
    private static final int MAX_NUMBER = 45;
    private static final int MIN_NUMBER = 1;

    public BonusNumberValidator() {
    }

    public String checkBonusNumber(String bonusNumber){
        checkNumber(bonusNumber);
        checkSize(bonusNumber);
        return bonusNumber;
    }

    private void checkNumber(String Number){
        try {
            int temp = Integer.parseInt(Number);
        }
        catch (Exception e){
            throw new IllegalArgumentException(WIN_LOTTO_NUMBER_ERROR.getMessage());
        }
    }

    private void checkSize(String Number){
        if(Integer.parseInt(Number)>MAX_NUMBER || Integer.parseInt(Number)<MIN_NUMBER){
            throw new IllegalArgumentException(WIN_LOTTO_MIN_MAX_ERROR.getMessage());
        }
    }
}
