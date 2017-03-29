package com.Singleton.Adapter;

import com.Singleton.AdvancedMediaPlayer;
import com.Singleton.Business.Mp4Player;
import com.Singleton.Business.VlcPlayer;
import com.Singleton.MediaPlayer;

/**
 * Created by S.H.I.E.L.D on 2017/3/29 0029.
 */
public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String filename) {
        if (audioType.equalsIgnoreCase("VLC")) {
            advancedMediaPlayer.playVlc(filename);
        }else if (audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer.playMp4(filename);
        }
    }
}
