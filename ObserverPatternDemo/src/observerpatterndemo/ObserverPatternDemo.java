package observerpatterndemo;

// Main class to test the observer pattern
public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new BinaryObserver(subject);
        new HexaObserver(subject);
        new OctalObserver(subject);

        System.out.println("Changing state to 15");
        subject.setState(15);
        
        System.out.println("Changing state to 20");
        subject.setState(20);
    }
}
