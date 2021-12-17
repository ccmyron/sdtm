package com.utm.sdtm_lab3.domain;

public class YamahaGuitar extends Guitar {

    @Override
    public MusicalInstrument getCopy() {
        return new YamahaGuitar();
    }

    @Override
    public String getModel() {
        return "Acoustic YAMAHA guitar";
    }
}
