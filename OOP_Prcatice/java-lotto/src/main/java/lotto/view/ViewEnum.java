package lotto.view;

public enum ViewEnum {
    INPUT_PURCHASE_MONEY("구입금액을 입력해 주세요."),

    OUTPUT_PURCHASE_LOTTO("\n%d개를 구매했습니다.\n"),
    ;

    private String message;

    ViewEnum(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
