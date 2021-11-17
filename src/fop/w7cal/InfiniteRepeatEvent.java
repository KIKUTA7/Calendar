package fop.w7cal;

public class InfiniteRepeatEvent extends Event{
    private int period;
    public InfiniteRepeatEvent(int day, String description , String place , int period)
    {
        super(day, description, place);
        this.period = period;
    }

    public int getPeriod() {
        return period;
    }
    @Override
    public int diff (int day)
    {
        int k = day/period;
        if(day%period - this.getDay() == 0) return 0;
        return (period*(k+1)+this.getDay() - day);

    }

}
