package fop.w7cal;

abstract class Event {
    private int day;
    private String description;
    private String place;

    public Event(int day, String description , String place) {
        this.day = day;
        this.description = description;
        this.place = place;
    }
     public int diff(int day)
     {
         return 0;
     }

    public int getDay() {
        return day;
    }

    public String getDescription() {
        return description;
    }

    public String getPlace() {
        return place;
    }
}
