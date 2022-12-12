package baseball.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ComputerTest {
    @DisplayName("컴퓨터가 정상적으로 숫자 리스트로 저장하는지 확인")
    @Test
    void checkComputerNumbers(){
        Computer computer=new Computer(List.of(1,2,3));
        assertThat(computer.getComputerNums()).isEqualTo(List.of(1,2,3));
    }
}