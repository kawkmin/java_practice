package baseball.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CreateRandomNumTest {
    @DisplayName("컴퓨터가 3자리로 만들어 내는지 확인")
    @Test
    void checkComputerNumsSize(){
        List<Integer> computerNums=CreateRandomNum.createComputerNums();
        assertThat(computerNums.size()).isEqualTo(3);
    }
}