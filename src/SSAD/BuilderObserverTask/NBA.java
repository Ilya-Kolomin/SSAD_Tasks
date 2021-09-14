package SSAD.BuilderObserverTask;

import java.util.ArrayList;
import java.util.List;

public class NBA {
    private final List<Observer<NBAGame>> observerList;

    public NBA() {
        observerList = new ArrayList<>();
    }

    void subscribe(Observer<NBAGame> nbaGameObserver) {
        observerList.add(nbaGameObserver);
    }

    void unsubscribe(Observer<NBAGame> nbaGameObserver) {
        observerList.remove(nbaGameObserver);
    }

    void publishNBAGame(NBAGame game) {
        observerList.forEach((nbaGameObserver -> nbaGameObserver.update(game)));
    }
}
