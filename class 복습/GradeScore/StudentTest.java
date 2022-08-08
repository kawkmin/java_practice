package GradeScore;

public class StudentTest {
    public static void main(String[] args) {
        Student lee=new Student("lee");
        lee.addsubject("Korean",90);
        lee.addsubject("Math",80);

        Student kim=new Student("Kim");
        kim.addsubject("Korean",90);
        kim.addsubject("Math",90);
        kim.addsubject("English",80);
        lee.show();
        kim.show();
    }
}
