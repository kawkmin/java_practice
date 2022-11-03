package collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
    private HashSet<Member> hashset;

    public MemberHashSet(){
        hashset=new HashSet<Member>();
    }
    public void addMember(Member member){
        hashset.add(member);
    }
    public boolean removeMember(int memberID){
        Iterator<Member> ir= hashset.iterator();
        while(ir.hasNext()){
            Member member=ir.next();
            if(member.getMemberId()==memberID){
                hashset.remove(member);
                return true;
            }
        }
        System.out.println(memberID+"번호가 존재하지 않습니다");
        return false;
    }
    public void shoAllMember(){
        for(Member member: hashset){
            System.out.println(member);
        }
        System.out.println();
    }
}
