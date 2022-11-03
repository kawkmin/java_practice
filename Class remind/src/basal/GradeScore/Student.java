package basal.GradeScore;

import java.util.ArrayList;

public class Student {
    String Name;
    ArrayList<Subject> subjectArrayList;

    public Student(String Name){
        this.Name=Name;
        subjectArrayList=new ArrayList<Subject>();
    }

    public void addsubject(String Name,int score){
        Subject subject=new Subject(Name,score);
        subjectArrayList.add(subject);
    }

    public void show(){
        int total=0;
        for(Subject subject:subjectArrayList){
            total+=subject.getScore();
            System.out.println(Name+" 학생의 "+ subject.getName()+" 점수는 "+subject.getScore()+"점 입니다.");
        }
        System.out.println(Name+"학생의 총점은 "+total+"점 입니다");
    }
}
