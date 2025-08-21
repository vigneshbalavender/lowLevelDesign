package LLD.DesignPatterns.structuralDP.Proxy;

public class ProxyDemo {
    public static void main(String[] args) {
        VideoService realvideoService=new RealVideoService();
        VideoService proxyVideoService=new ProxyVideoService(realvideoService);

        String premiumVideo = "premium video:thor of Thunder";
        String standardVideo = "standard video:End Game";
        String freeVideo = "free video:Captain America";
        proxyVideoService.playVideo("premium",premiumVideo);
        proxyVideoService.playVideo("standard",premiumVideo);
        proxyVideoService.playVideo("standard",standardVideo);
        proxyVideoService.playVideo("free",standardVideo);
        proxyVideoService.playVideo("free",freeVideo);

    }
}
