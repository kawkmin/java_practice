package view;

public enum ViewEnum {
    INPUT_CAR_NAME("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");

    private String message;

    ViewEnum(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
