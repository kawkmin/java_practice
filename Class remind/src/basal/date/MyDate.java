package basal.date;

public class MyDate {
    private int day,month,year;
    public int getter,setter;

    public MyDate(int day,int month,int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }
    public boolean isVaild(){
        if(day>0&&day<32&&month<13&&month>0&&year>0) //간단하게 하기 위해 모두 31일까지 있다고 가정
            return true;
        else
            return false;
    }

}
