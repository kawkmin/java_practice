package lotto.utils;

public enum ErrorEnum {
    MONEY_NUMBER_ERROR("숫자만 입력해 주세요."),
    MONEY_UNIT_ERROR("1000원 단위로 입력해 주세요."),

    WIN_LOTTO_SIZE_ERROR("6개를 입력해 주세요"),
    WIN_LOTTO_DISTINCT_ERROR("중복된 숫자는 입력할 수 없습니다"),
    WIN_LOTTO_NUMBER_ERROR("숫자를 입력해 주세요"),
    WIN_LOTTO_MIN_MAX_ERROR("1과 45사이의 수만 입력해야합니다"),

    WIN_LOTTO_BONUS_DISTINCT_ERROR("당첨 로또와 중복되면 안됩니다.")
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
