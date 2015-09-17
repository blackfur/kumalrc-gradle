package com.shirokuma.musicplayer.playback;

/*
 * This is demo code to accompany the Mobiletuts+ series:
 * Android SDK: Creating a Music Player
 * 
 * Sue Smith - February 2014
 */

import android.graphics.Bitmap;
import com.shirokuma.musicplayer.common.Filter;
import com.shirokuma.musicplayer.common.Music;

public class Song implements Music {
    public long id;
    public String title;
    public String artist;
    public String lrc;
    public String album;
    public String dir;

    public Song(String[] pars) {
        id = Long.valueOf(pars[0]);
        title = pars[1];
        artist = pars[2];
        lrc = pars[3];
        album = pars[4];
        dir = pars[5];
    }

    @Override
    public Bitmap icon() {
        return null;
    }

    @Override
    public String head() {
        return title;
    }

    @Override
    public String subhead() {
        return artist;
    }

    @Override
    public String remark() {
        return null;
    }

    @Override
    public Filter.FilterType type() {
        return Filter.FilterType.Song;
    }
}
