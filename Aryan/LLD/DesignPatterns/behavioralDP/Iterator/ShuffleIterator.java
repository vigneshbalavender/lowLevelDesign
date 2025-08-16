package LLD.DesignPatterns.behavioralDP.Iterator;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleIterator implements PlaylistIterator{
    private Playlist playlist;
    private int index;
    private ArrayList<String >shuffledSongs;
    public ShuffleIterator(Playlist playlist){
        this.playlist=playlist;
        this.index=0;
        shuffledSongs = new ArrayList<>(playlist.getSongs());
        Collections.shuffle(shuffledSongs);

    }

    @Override
    public boolean hasNext() {
        return index<shuffledSongs.size();
    }

    @Override
    public String next() {
       return shuffledSongs.get(index++);
    }
}
