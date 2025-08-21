package LLD.DesignPatterns.structuralDP.Proxy;

public class RealVideoService implements VideoService{
    @Override
    public void playVideo(String userType, String videoName) {
        String msg = "Playing video of :"+videoName;
       if("premium".equals(userType))
        System.out.println(msg);
       else if("standard".equals(userType)){
           System.out.println(msg+" with few ADs");
       }else{
           System.out.println(msg+" with ADs for each 5 mins");
       }
    }
}
