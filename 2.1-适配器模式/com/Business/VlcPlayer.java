package com.Singleton.Business;

import com.Singleton.AdvancedMediaPlayer;

/**
 * Created by S.H.I.E.L.D on 2017/3/29 0029.
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String filename) {
        System.out.println("Playing vlc file. Name:" + filename);
    }

    @Override
    public void playMp4(String filename) {

    }
}
