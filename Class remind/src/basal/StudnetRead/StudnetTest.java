package basal.StudnetRead;

public class StudnetTest {
    public static void main(String[] args) {
        Student lee=new Student("lee");
        Student Kim=new Student("kim");
        Student cho=new Student("cho");

        lee.addBook("태백산맥 1");
        lee.addBook("태백산맥 2");
        Kim.addBook("토지 1");
        Kim.addBook("토지 2");
        Kim.addBook("토지 3");
        cho.addBook("해리포터 1");
        cho.addBook("해리포터 2");
        cho.addBook("해리포터 3");
        cho.addBook("해리포터 4");
        cho.addBook("해리포터 5");
        cho.addBook("해리포터 6");
        lee.show();
        Kim.show();
        cho.show();
    }
}
