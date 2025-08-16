package LLD.DesignPatterns.behavioralDP.Iterator;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private List<String> songs;
    public Playlist(){
        songs = new ArrayList<>();
    }

    public void addSongs(String song){
        if(!songs.contains(song)){
            songs.add(song);
        }
    }
    public List<String> getSongs(){
        return this.songs;
    }

    public PlaylistIterator iterator(String type){
      if("simple".equals(type)){
          return new SimpleIterator(this);
      }else if( "favorite".equals(type)){
          return new FavouriteIterator(this);
      }else if("shuffle".equals(type)){
          return new ShuffleIterator(this);
      }else{
          System.out.println("Unknown iterator requested..");
      }
      return null;
    }
}
