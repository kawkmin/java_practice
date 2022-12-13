package lotto.utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PurchaseValidatorTest {
    private final PurchaseValidator purchaseValidator=new PurchaseValidator();

    @DisplayName("구입 금액이 정상적일 때 예외가 발생하지 않는다.")
    @Test
    void testRight(){
        assertThat(purchaseValidator.checkPurchase("5000"));
    }

    @DisplayName("구입 금액이 숫자가 아니면 예외가 발생한다.")
    @Test
    void testNumber() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> purchaseValidator.checkPurchase("abc") );
        assertThat(exception.getMessage()).isEqualTo("[ERROR] 숫자만 입력해 주세요.");
    }

    @DisplayName("구입 금액이 1000단위가 아니면 예외가 발생한다.")
    @Test
    void testUnit() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> purchaseValidator.checkPurchase("10001") );
        assertThat(exception.getMessage()).isEqualTo("[ERROR] 1000원 단위로 입력해 주세요.");
    }
}