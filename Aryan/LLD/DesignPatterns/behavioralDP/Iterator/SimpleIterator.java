package LLD.DesignPatterns.behavioralDP.Iterator;

public class SimpleIterator implements PlaylistIterator{
    Playlist playlist;
    int index;
    public SimpleIterator(Playlist playList){
        this.playlist=playList;
        this.index=0;
    }
    @Override
    public boolean hasNext() {
        return index<playlist.getSongs().size();
    }

    @Override
    public String next() {
        return playlist.getSongs().get(index++);
    }
}
