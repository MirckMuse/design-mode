package com.Singleton.Business;

import com.Singleton.AdvancedMediaPlayer;

/**
 * Created by S.H.I.E.L.D on 2017/3/29 0029.
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String filename) {

    }

    @Override
    public void playMp4(String filename) {
        System.out.println("Playing Mp4 file.Name:" + filename);
    }
}
