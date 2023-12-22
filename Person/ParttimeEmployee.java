package Person;
public class ParttimeEmployee extends Person {
    private int hour;
    private int rate;
    public ParttimeEmployee(){
        this.hour = 0;
        this.rate = 0;
    }
    public void setHour(int hour){
        this.hour = hour;
    }
    public void setRate(int rate){
        this.rate = rate;
    }
    public int getPay(){
        return hour*rate;
    }
}
