In this assignment, we consider three types of events:

one-time events
events which occur every nnn days (for ever)
events which occur within a fixed time span every nnn days
These types, we want to realize by means of inheritance:



For simplicity, we assume that all time points (begin as well as end of time spans) are specified in days counted from some start day onward.

Realize the given Event hierarchy. The constructors should initialize all attributes and expect corresponding parameters in the order as listed in the diagram, starting with the parameters for initializing the attributes of the highest super-class.

The method diff should determine in how many days relative to the given time point day the event will next take place. In case of past or single events, a negative number may be returned. Examples:

For a infinitely repeating event t which, since day 25 is repeated every week, the call t.diff(27) returns the number 5.
For an event which, in the time span from the 2. to the 32 day, repeats every 3 days, i.e., on days (2,5,…,26,29,32)(2, 5, \ldots, 26, 29, 32)(2,5,…,26,29,32), the call t.diff(27) returns the number 2. The call t.diff(33), on the other hand, should return -1 (the closest event occured the previous day).
Now realize the class Calendar which maintains a set of events in a list of events. The implementation of the list is already available within the template, familiarize yourself with that. The calendar provides the following functionality:

addition of new events (addNewEvent(Event event))
Querying of the events of a given day (Event[] eventsAt(int day)) Hint: The events in the array should occur in exactly the same order as in the list.
The next event to happen relative to a given day (Event nextEvent(int day)) In case of multiple events occurring at the same day, the first of these in the list should be returned.
