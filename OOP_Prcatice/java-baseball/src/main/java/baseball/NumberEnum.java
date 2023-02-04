package baseball;

public enum NumberEnum {
  MIN_NUMBER(1),
  MAX_NUMBER(9),
  LIST_SIZE(3),
  ;
  private int limitedNumber;

  NumberEnum(int limitedNumber) {
    this.limitedNumber = limitedNumber;
  }

  public int getLimitedNumber() {
    return limitedNumber;
  }
}
