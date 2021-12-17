package com.utm.sdtm_lab3.domain;

public class SoundMixerSpeakersState implements SoundMixerState {

    private final MusicalInstrument musicalInstrument;

    public SoundMixerSpeakersState(MusicalInstrument musicalInstrument) {
        this.musicalInstrument = musicalInstrument;
    }

    @Override
    public void play() {
        musicalInstrument.play();
    }
}
