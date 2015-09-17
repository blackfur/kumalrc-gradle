package com.shirokuma.musicplayer.playback;

import android.graphics.Bitmap;
import com.shirokuma.musicplayer.common.Filter;
import com.shirokuma.musicplayer.common.Music;

public class Album implements Music{
    public String album;
    public int numsongs;

    public Album(String[] pars) {
        album= pars[0];
        numsongs = Integer.valueOf(pars[1]);
    }

    @Override
    public Bitmap icon() {
        return null;
    }

    @Override
    public String head() {
        return album;
    }

    @Override
    public String subhead() {
        return String.valueOf(numsongs);
    }

    @Override
    public String remark() {
        return null;
    }

    @Override
    public Filter.FilterType type() {
        return Filter.FilterType.Album;
    }
}
