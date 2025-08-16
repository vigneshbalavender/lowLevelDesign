package LLD.DesignPatterns.behavioralDP.Observer;

public interface YouTube {
    public void addSubscriber(Subscriber subscriber);
    public void removeSubscriber(Subscriber subscriber);
    public void uploadvideo(String video);
    public void notifySubscribers();
}
