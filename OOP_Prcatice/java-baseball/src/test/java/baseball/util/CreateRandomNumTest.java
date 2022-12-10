package baseball.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CreateRandomNumTest {
    @DisplayName("컴퓨터가 3자리로 만들어 내는지 확인")
    @Test
    void checkComputerNumsSize(){
        List<Integer> computerNums=CreateRandomNum.createComputerNums();
        assertThat(computerNums.size()).isEqualTo(3);
    }

    @DisplayName("컴퓨터가 중복을 포함하는지 확인")
    @Test
    void computerNumsDistinct(){
        for(int i=0;i<100;i++) {
            List<Integer> computerNums = CreateRandomNum.createComputerNums();
            computerNums = computerNums.stream().distinct().collect(Collectors.toList());
            assertThat(computerNums.size()).isEqualTo(3);
        }
    }

    @DisplayName("컴퓨터가 1~9사이의 수로만 되어있는지 확인")
    @Test
    void computerNumsRight(){
        for(int i=0;i<100;i++) {
            List<Integer> computerNums = CreateRandomNum.createComputerNums();
            computerNums = computerNums.stream()
                    .filter(num->num>=1&&num<=9)
                    .collect(Collectors.toList());
            assertThat(computerNums.size()).isEqualTo(3);
        }
    }
}