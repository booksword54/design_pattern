package structual.adapter.code.adapter;

import structual.adapter.code.advanced_media_player.abstract_advanced_media_player.AdvancedMediaPlayer;
import structual.adapter.code.media_player.abstract_media_player.MediaPlayer;
import structual.adapter.code.advanced_media_player.Mp4Player;
import structual.adapter.code.advanced_media_player.VlcPlayer;

public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMusicPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMusicPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMusicPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMusicPlayer.playMp4(fileName);
        }
    }
}
