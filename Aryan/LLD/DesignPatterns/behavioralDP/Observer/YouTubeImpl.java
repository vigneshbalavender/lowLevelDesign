package LLD.DesignPatterns.behavioralDP.Observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class YouTubeImpl implements YouTube{
     String video;
     List<Subscriber> subscribers = new ArrayList<>();
     public YouTubeImpl(){}
    @Override
    public void uploadvideo(String video) {
         this.video=video;
         notifySubscribers();
    }

    @Override
    public void notifySubscribers() {

         Iterator<Subscriber> subscriberIterator = subscribers.iterator();
         while(subscriberIterator.hasNext()){
             subscriberIterator.next().notify(this.video);
         }

    }
    public void addSubscriber(Subscriber subscriber){
         if(!subscribers.contains(subscriber)){
             subscribers.add(subscriber);
         }
    }
    public void removeSubscriber(Subscriber subscriber){
         for(Subscriber sub:subscribers){
             if(subscriber.equals(sub)){
                 subscribers.remove(sub);
             }
         }
    }
}
