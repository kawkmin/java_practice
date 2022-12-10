package baseball.model;

import java.util.ArrayList;
import java.util.List;

public class User {
    private List<Integer> userNums;

    public User() {
        userNums=new ArrayList<>();
    }

    public void setUserNumsToList(String userNums){
        for(int i=0;i<userNums.length();i++){
            this.userNums.add(userNums.charAt(i)-'0');
        }
    }
}
