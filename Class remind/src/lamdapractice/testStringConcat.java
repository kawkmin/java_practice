package lamdapractice;

public class testStringConcat {
    public static void main(String[] args) {
        impStringconcat sa=new impStringconcat();
        sa.makeString("hello","world");

        StringConcat concat=(s,v)-> System.out.println(s+","+v);
        concat.makeString("hello","world");

        StringConcat concat2=new StringConcat() { //람다식 생략전
            @Override
            public void makeString(String s1, String s2) {
                System.out.println(s1+","+s2);
            }
        };
        concat2.makeString("hello","world");
    }
}
