package SSAD.BuilderObserverTask;

import java.util.Scanner;

public class NBAManager {
    private final NBA nba;

    public NBAManager() {
        nba = new NBA();
    }

    public void subscribeToNBA(Observer<NBAGame> observer) {
        nba.subscribe(observer);
    }

    public void addGame() {
        Scanner in = new Scanner(System.in);
        while(in.hasNextLine()) {
            String team1 = in.next(), team2 = in.next(), date = in.next(), score = in.next();
            NBAGameBuilder builder = new NBAGameBuilder()
                    .team1(team1)
                    .team2(team2)
                    .date(date)
                    .score(score);
            NBAGame game = builder.build();
            nba.publishNBAGame(game);
        }
    }

}
