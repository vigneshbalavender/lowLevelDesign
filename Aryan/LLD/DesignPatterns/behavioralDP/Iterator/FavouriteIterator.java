package LLD.DesignPatterns.behavioralDP.Iterator;

public class FavouriteIterator implements PlaylistIterator{
     private Playlist playlist;
     private int index;
     public FavouriteIterator(Playlist playlist){
         this.playlist=playlist;
         this.index=0;
     }
    @Override
    public boolean hasNext() {
       while(index<playlist.getSongs().size()){
           if(playlist.getSongs().get(index).contains(":fav")){
               return true;
           }
           index++;
       }
       return false;
    }

    @Override
    public String next() {
       return playlist.getSongs().get(index++);
    }
}
