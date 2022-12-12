package baseball.model;

import java.util.ArrayList;
import java.util.List;

public class User {
    private final List<Integer> userNums;

    public User(String userNums) {
        this.userNums=setUserNumsToList(userNums);
    }

    private List<Integer> setUserNumsToList(String userNums){
        List<Integer> tempList=new ArrayList<>();
        for(int i=0;i<userNums.length();i++){
            tempList.add(userNums.charAt(i)-'0');
        }
        return tempList;
    }

    public List<Integer> getUserNums() {
        return userNums;
    }
}
