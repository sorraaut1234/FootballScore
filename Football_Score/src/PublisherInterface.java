public interface PublisherInterface {
    public void attach(Observer o);
    public void detach(Observer o);
    public void notifyUpdate(Score score);
    public void stop();
}
