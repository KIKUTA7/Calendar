package fop.w7cal;

public class RepeatEvent extends InfiniteRepeatEvent {
    private int end;

    public RepeatEvent(int day, String description , String place , int period, int end){
        super(day,description,place,period);
        this.end =day;
}

    public int getEnd() {
        return end;
    }
    @Override
    public int diff(int day)
    {
        if(this.getDay() > end) return end - getDay();
        return diff(this.getDay());
    }
}
