public class ScoreSubscriber implements Observer{
    @Override
    public Score update(String score) {
        Score score1 = new Score(score);
        return score1;
    }
}
