package LLD.DesignPatterns.structuralDP.Proxy;

public class ProxyVideoService implements VideoService{
    private VideoService realVideoService;
    public ProxyVideoService(VideoService realVideoService){
        this.realVideoService=realVideoService;
    }
    @Override
    public void playVideo(String userType, String videoName) {
        if(!checkUserAccess(userType,videoName)){
            return ;
        }
        realVideoService.playVideo(userType,videoName);
    }
    private boolean checkUserAccess(String userType,String videoName){
        if("premium".equalsIgnoreCase(userType))return true;
        if("standard".equalsIgnoreCase(userType) && videoName.startsWith("premium")){
            System.out.println("Access Denied: user not previledged to watch premium video ");
            return false;
        }
        if("free".equalsIgnoreCase(userType) && !videoName.startsWith("free")){
            System.out.println("Access Denied: user only can watch free videos");
            return false;
        }
        return true;
    }
}
