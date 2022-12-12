package baseball.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class JudgementTest {
    @DisplayName("볼 계산이 정상적인지 확인")
    @Test
    void checkBallCount(){
        User user=new User("123");
        Computer computer=new Computer(List.of(2,1,3));
        Judgement judgement=new Judgement(user,computer);
        judgement.calculator();
        assertThat(judgement.getBallCount()).isEqualTo(2);
    }

    @DisplayName("스트라이크 계산이 정상적인지 확인")
    @Test
    void checkStrikeCount(){
        User user=new User("123");
        Computer computer=new Computer(List.of(2,1,3));
        Judgement judgement=new Judgement(user,computer);
        judgement.calculator();
        assertThat(judgement.getStrikeCount()).isEqualTo(1);
    }
}