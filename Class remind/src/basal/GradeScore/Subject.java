package basal.GradeScore;

public class Subject {
    private String Name;
    private int score;

    public String getName() {
        return Name;
    }

    public int getScore() {
        return score;
    }

    public Subject(String name, int score) {
        Name = name;
        this.score = score;
    }
}
