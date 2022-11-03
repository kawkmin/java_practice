package collection.hashmap;

public class MemberHashMapTest {
    public static void main(String[] args) {
        MemberHashMap manager=new MemberHashMap(); //트리맵이면, 키값으로 정렬

        Member membreLee=new Member(100,"Lee");
        Member membreKim=new Member(200,"KIM");
        Member membrePark=new Member(300,"PARK");
        Member membrePark2=new Member(300,"PARK2");

        manager.addMember(membreKim);
        manager.addMember(membreLee);
        manager.addMember(membrePark);
        manager.addMember(membrePark2);

        manager.showAllMember();
        System.out.println();

        manager.removeMember(200);
        manager.showAllMember();
    }
}
