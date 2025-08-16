package LLD.DesignPatterns.behavioralDP.Iterator;

public class Main {
    public static void main(String[] args) {
      Playlist playlist = new Playlist();
      playlist.addSongs("mun sellada :fav");
      playlist.addSongs("perfect by edsheeran :fav");
      playlist.addSongs("Fight song :fav");
      playlist.addSongs("Unstoppable ");
      playlist.addSongs("Never Giving up");

      PlaylistIterator iterator =playlist.iterator("simple");
      while(iterator.hasNext()){
          System.out.println("Playing "+iterator.next());
      }
       iterator =playlist.iterator("favorite");
      while(iterator.hasNext()){
          System.out.println("Playing "+iterator.next());
      }
       iterator =playlist.iterator("shuffle");
      while(iterator.hasNext()){
          System.out.println("Playing "+iterator.next());
      }
    }
}
