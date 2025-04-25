package com.Structural.Adapter;

/*
Client Code
 */
public class AudioPlayer implements com.Structural.Adapter.MediaPlayer {

    com.Structural.Adapter.MP4Player mp4Player = new com.Structural.Adapter.MP4Player();

    @Override
    public void play(String fileName) {
        if(fileName.contains(".mp4")){
            mp4Player.play(fileName);
        }else{
            System.out.println("Playing Audio file-"+fileName);
        }
    }
}
