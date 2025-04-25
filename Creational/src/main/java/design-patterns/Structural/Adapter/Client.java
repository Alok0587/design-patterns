package com.Structural.Adapter;

/*
Client Code testing
 */
public class Client {
    public static void main(String[] args) {
        com.Structural.Adapter.AudioPlayer audioPlayer = new com.Structural.Adapter.AudioPlayer();
        audioPlayer.play("audio.mp4");
        audioPlayer.play("audio.mp3");
    }
}
