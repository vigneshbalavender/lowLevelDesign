package LLD.DesignPatterns.structuralDP.Facade;

public class FacadeDemo {
    public static void main(String[] args) {
       HomeTheatreFacade homeThreatre = new HomeTheatreFacade(new DVDPlayer(),new Projector(),new SoundSystem(),new Screen());

       homeThreatre.watchMovie("Tourist Family");
       homeThreatre.endMovie();
    }
}
