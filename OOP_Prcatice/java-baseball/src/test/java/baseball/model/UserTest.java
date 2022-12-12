package baseball.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @DisplayName("유저가 정상적으로 문자열로 숫자 리스트로 변경하여, 저장하는지 확인")
    @Test
    void checkUserNumbers(){
        User user=new User("123");
        assertThat(user.getUserNums()).isEqualTo(List.of(1,2,3));
    }
}