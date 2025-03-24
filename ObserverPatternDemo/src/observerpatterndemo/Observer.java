package observerpatterndemo;

// Abstract Observer class
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
