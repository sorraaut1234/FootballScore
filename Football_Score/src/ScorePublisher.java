import java.util.ArrayList;
import java.util.List;

public class ScorePublisher implements PublisherInterface {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer o) {
        observers.add(o);
    }

    @Override
    public void detach(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyUpdate(Score score) {
        for(Observer o: observers) {
            o.update(score.getscoreContent());
        }
    }

    @Override
    public void stop() {
        observers = null;
    }
}
