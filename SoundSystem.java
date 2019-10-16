package leuterio;
public interface SoundSystem {
    int MIN_VOLUME = 1;
    int MAX_VOLUME = 10;
    final static int NORMAL_VOLUME = 5;
    
    void setVolume();
    abstract void createPlaylist();
}
