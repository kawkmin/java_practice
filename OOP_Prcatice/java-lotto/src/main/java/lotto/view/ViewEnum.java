package lotto.view;

public enum ViewEnum {
    INPUT_PURCHASE_MONEY("구입금액을 입력해 주세요."),;

    private String message;

    ViewEnum(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
