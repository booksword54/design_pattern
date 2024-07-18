package structual.adapter.code.advanced_media_player;

import structual.adapter.code.advanced_media_player.abstract_advanced_media_player.AdvancedMediaPlayer;

public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
    }
}
