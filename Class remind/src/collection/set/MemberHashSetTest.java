package collection.set;

public class MemberHashSetTest {
    public static void main(String[] args) {
        MemberHashSet manager=new MemberHashSet();

        Member membreLee=new Member(100,"Lee");
        Member membreKim=new Member(200,"KIM");
        Member membrePark=new Member(300,"PARK");
        Member membrePark2=new Member(300,"PARK2"); //아이디가 같으면 들어가면 안되니까 equals 재정의
                                                                        //원래 hashset은 중복 제거지만 객체가 들어가서 중복인지 판단못함
        manager.addMember(membrePark);
        manager.addMember(membreKim);
        manager.addMember(membreLee);

        manager.shoAllMember();
    }
}
