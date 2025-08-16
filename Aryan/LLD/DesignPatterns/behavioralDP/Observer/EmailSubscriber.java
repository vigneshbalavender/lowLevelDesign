package LLD.DesignPatterns.behavioralDP.Observer;

public class EmailSubscriber implements Subscriber{
    String email;
    public EmailSubscriber(String email){
        this.email=email;
    }
    @Override
    public void notify(String video) {
        System.out.println("mail sent to "+email+" with updated url of: "+video);
    }
}
