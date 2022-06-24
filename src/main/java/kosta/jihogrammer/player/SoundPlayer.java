package kosta.jihogrammer.player;

import java.util.ArrayList;
import java.util.List;

public class SoundPlayer {

    private List<Music> playList;

    public SoundPlayer() {
        playList = new ArrayList<>();
    }

    public void play() {
        for (Music music : playList) {
            System.out.println("PLAY " + music.getType());
        }
    }

    public SoundPlayer registerMusic(Music music) {
        playList.add(music);
        return this;
    }

}
