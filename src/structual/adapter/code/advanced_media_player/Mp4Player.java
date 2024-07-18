package structual.adapter.code.advanced_media_player;

import structual.adapter.code.advanced_media_player.abstract_advanced_media_player.AdvancedMediaPlayer;

public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
