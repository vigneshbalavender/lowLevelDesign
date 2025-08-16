package LLD.DesignPatterns.behavioralDP.Observer;

public class YouTubeSubscriber implements Subscriber{
    String name;
    public YouTubeSubscriber(String name){
        this.name=name;
    }
    @Override
    public void notify(String video) {
        System.out.println("subscriber "+name+" watching video :"+video);
    }
}
