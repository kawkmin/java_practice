package baseball.util;

import baseball.view.ViewEnum;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static baseball.util.ErrorEnum.*;

public class UserNumsValidate {
    private static final int USER_NUMS_SIZE=3;
    private static final char MAX_NUM='9';
    private static final char NIM_NUM='1';

    public static String checkUserNums(String userNums){
        checkDistinct(userNums);
        checkRight(userNums);
        checkSize(userNums);
        return userNums;
    }

    private static void checkSize(String userNums){
        if(userNums.length()!=USER_NUMS_SIZE) {
            throw new IllegalArgumentException(USER_SIZE_ERROR.getMessage());
        }
    }

    private static void checkRight(String userNums){
        for(int i=0;i<userNums.length();i++){
            if(userNums.charAt(i)>MAX_NUM||userNums.charAt(i)<NIM_NUM){
                throw new IllegalArgumentException(USER_RIGHT_ERROR.getMessage());
            }
        }
    }

    private static void checkDistinct(String userNums){
        List<String> list= Arrays.asList(userNums.split(""));
        list=list.stream().distinct().collect(Collectors.toList());
        if(list.size()!=USER_NUMS_SIZE){
            throw new IllegalArgumentException(USER_DISTINCT_ERROR.getMessage());
        }
    }
}
