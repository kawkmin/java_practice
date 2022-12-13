package lotto.utils;

public enum ErrorEnum {
    MONEY_NUMBER_ERROR("숫자만 입력해 주세요."),
    MONEY_UNIT_ERROR("1000원 단위로 입력해 주세요."),
    ;

    private static final String ERROR="[ERROR] ";
    private String message;

    ErrorEnum(String message) {
        this.message = message;
    }

    public String getMessage() {
        return ERROR+message;
    }
}
