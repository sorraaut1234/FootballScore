import java.util.Scanner;

public class FootballScoreMain {
    public static void main(String[] args) {
        {
            ScoreSubscriber s1 = new ScoreSubscriber();
            ScorePublisher p = new ScorePublisher();
            Scanner sc = new Scanner(System.in);
            String score = sc.next();
            while (score != ""){
                p.notifyUpdate(s1.update(score));
            }
        }
    }
}
