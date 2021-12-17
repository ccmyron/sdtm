package com.utm.sdtm_lab3.domain;

public class PlaySongCommand implements Command {

    private final MusicPlayer player;

    public PlaySongCommand(MusicPlayer player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.playSong();
    }
}
