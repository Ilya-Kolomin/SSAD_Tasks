package SSAD.BuilderObserverTask;

public class Main {
    public static void main(String[] args) {
        NBAManager manager = new NBAManager();
        manager.subscribeToNBA(new Observer<NBAGame>() {
            @Override
            public void update(NBAGame data) {
                System.out.println(data);
            }
        });
    }
}
