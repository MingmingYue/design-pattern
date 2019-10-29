package com.design.pattern.adapterPattern;

/**
 * Created by zmm on 2018/12/7
 */
public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //什么也不做
    }
}
