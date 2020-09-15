import java.util.ArrayList;
import java.util.List;

public class BlogNotifier {
    private List<IBLogObserver> observers = new ArrayList<IBLogObserver>();
    private int state;

    public int getState(){
        return state;
    }

    public void setState(int state){
        this.state = state;
        notifyAllObservers();
    }

    public void attach(IBLogObserver observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (IBLogObserver observer : observers)
            observer.update();
    }
}
