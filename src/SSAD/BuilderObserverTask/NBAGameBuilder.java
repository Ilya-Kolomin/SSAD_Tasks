package SSAD.BuilderObserverTask;

public class NBAGameBuilder {
    private String team1;
    private String team2;
    private String date;
    private String score;

    public NBAGameBuilder() {
        team1 = "";
        team2 = "";
        date = "";
        score = "";
    }

    public NBAGameBuilder team1(String data) {
        team1 = data;
        return this;
    }
    public NBAGameBuilder team2(String data) {
        team2 = data;
        return this;
    }
    public NBAGameBuilder date(String data) {
        date = data;
        return this;
    }
    public NBAGameBuilder score(String data) {
        score = data;
        return this;
    }

    public NBAGame build() {
        return new NBAGame(team1, team2, date, score);
    }

}
