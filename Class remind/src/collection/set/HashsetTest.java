package collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetTest {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();
        set.add("이순신");
        set.add("김유신");
        set.add("강감찬");
        set.add("이순신");
        System.out.println(set); //중복 제거 + 자동 중복 삭제
        Iterator<String> ir=set.iterator();
        while(ir.hasNext()){
            System.out.println(ir.next());
        }
    }
}
