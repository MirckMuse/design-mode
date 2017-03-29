package com.Singleton;

import com.Singleton.Adapter.MediaAdapter;

/**
 * Created by S.H.I.E.L.D on 2017/3/29 0029.
 */
public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String filename) {
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file.Name:" + filename);
        } else if (audioType.equalsIgnoreCase("mp4") ||
                audioType.equalsIgnoreCase("vlc")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, filename);
        } else {
            System.out.println("Invalide media." +
                    audioType + "format not supported");
        }
    }
}
