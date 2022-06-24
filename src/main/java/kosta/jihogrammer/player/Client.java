package kosta.jihogrammer.player;

public class Client {

    public static void main(String[] args) {
        SoundPlayer player = new SoundPlayer();
        Music mp3Music = new MP3();
        Music wavMusic = new WAV();

        player
                .registerMusic(mp3Music)
                .registerMusic(wavMusic)
                .play();
    }

}
