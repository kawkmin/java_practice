package lotto.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class LottoGeneratorTest {
    private LottoGenerator lottoGenerator;

    @DisplayName("정상적으로 로또 리스트가 저장되는지 확인")
    @Test
    void testRight(){
        lottoGenerator=new LottoGenerator("2000");
        assertThat(lottoGenerator.getPurchaseLottos().size()).isEqualTo(2);
    }
}