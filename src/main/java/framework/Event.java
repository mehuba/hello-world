package framework;

/**
 * Created by Nico on 2/3/17 11:48.
 */
abstract public class Event {
    private long evictTime;

    public Event(long evictTime) {
        this.evictTime = evictTime;
    }

    public boolean ready() {
        return System.currentTimeMillis() >= evictTime;
    }

    abstract public void action();
    abstract public String description();
}
