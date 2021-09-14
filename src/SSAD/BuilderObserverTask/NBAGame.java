package SSAD.BuilderObserverTask;

public class NBAGame {
    private String team1;
    private String team2;
    private String date;
    private String score;

    public NBAGame(String team1, String team2, String date, String score) {
        this.team1 = team1;
        this.team2 = team2;
        this.date = date;
        this.score = score;
    }

    public String getTeam1() {
        return team1;
    }

    public String getTeam2() {
        return team2;
    }

    public String getDate() {
        return date;
    }

    public String getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "NBAGame{" +
                "team1='" + team1 + '\'' +
                ", team2='" + team2 + '\'' +
                ", date='" + date + '\'' +
                ", score='" + score + '\'' +
                '}';
    }
}
