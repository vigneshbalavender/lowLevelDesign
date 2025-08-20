package LLD.DesignPatterns.structuralDP.Facade;

public class HomeTheatreFacade {
       private DVDPlayer dvdPlayer;
       private Projector projector;
       private SoundSystem soundSystem;
       private Screen screen;
      public HomeTheatreFacade(){
          dvdPlayer = new DVDPlayer();
          projector = new Projector();
          soundSystem = new SoundSystem();
          screen =new Screen();
      }
      public HomeTheatreFacade(DVDPlayer dvdPlayer,Projector projector,SoundSystem soundSystem,Screen screen){
          this.dvdPlayer = dvdPlayer;
          this.projector = projector;
          this.soundSystem = soundSystem;
          this.screen = screen;
      }
      public void watchMovie(String movie){
          System.out.println("get ready to watch movie");
          screen.down();
          projector.on();
          projector.setInput("DVD");
          soundSystem.on();
          soundSystem.setVolume(10);
          dvdPlayer.on();
          dvdPlayer.play(movie);
      }
      public void endMovie(){

          System.out.println("shutting movie threatre down");
          dvdPlayer.off();
          soundSystem.off();
          projector.off();
          screen.up();

      }
}
