package com.Structural.Adapter;

public class MP4Adapter implements com.Structural.Adapter.MediaPlayer {
    private com.Structural.Adapter.MP4Player mp4Player;
    public MP4Adapter(com.Structural.Adapter.MP4Player mp4Player) {
        this.mp4Player = mp4Player;
    }

    @Override
    public void play(String fileName) {
        if(fileName.contains(".mp4")){
            mp4Player.play(fileName);
        }
        else{
           System.out.println("Invalid Audio File");
        }
    }
}
