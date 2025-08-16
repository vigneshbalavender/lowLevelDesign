package LLD.DesignPatterns.behavioralDP.Observer;

public class Main {
    public static void main(String[] args) {
     YouTubeImpl channel= new YouTubeImpl();
      Subscriber sandyYoutube = new YouTubeSubscriber("sandy");
      Subscriber saroEmail = new EmailSubscriber("saro@gmail.com");
      Subscriber vikiDevice = new SMSSubscriber("viki android mobile");

      channel.addSubscriber(sandyYoutube);
      channel.addSubscriber(saroEmail);
      channel.addSubscriber(vikiDevice);

      channel.uploadvideo("how to Train your Brain");

    }
}
