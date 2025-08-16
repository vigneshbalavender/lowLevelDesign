package LLD.DesignPatterns.behavioralDP.Observer;

public class SMSSubscriber implements Subscriber{
    String userDevice;
    public SMSSubscriber(String deviceName){
        userDevice=deviceName;
    }
    @Override
    public void notify(String video) {
        System.out.println("push notification to user Device :"+userDevice+" about video :"+video);
    }
}
