package fop.w7cal;

public class Calendar {
    EventList events;
    public Calendar (EventList events)
    {
        this.events = events;
    }
    public void addNewEvent (Event event)
    {
        events = events.add(event);
    }
    public Event[] eventsAt(int day)
    {
        int size =0;
        for (EventList t =events;t!=null;t=t.getNext())
        {
            if(t.getEvent().diff(day)==0) size++;
        }
        Event [] ev = new Event[size];
        size=0;
        for (EventList t =events;t!=null;t=t.getNext())
        {
            if(t.getEvent().diff(day)==0) ev[size]=events.getEvent();
        }
        return ev;
    }
    public Event nextEvent (int day)
    {
        Event ev = null;
        int Mx = Integer.MAX_VALUE;
        for (EventList t = events;t!=null;t=t.getNext())
        {
            if(t.getEvent().diff(day) < Mx) {Mx = t.getEvent().diff(day); ev = t.getEvent();}
        }
        return ev;
//        int k=1; // es ro rame da event ar iyos chaicikleba
//        while (true){
//        for (EventList t =events;t!=null;t=t.getNext())
//        {
//
//            if(t.getEvent().diff(day) == k) {return t.getEvent();}
//        }
//        k++;}
    }
}
