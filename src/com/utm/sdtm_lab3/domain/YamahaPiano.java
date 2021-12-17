package com.utm.sdtm_lab3.domain;

public class YamahaPiano extends Piano {

    @Override
    public MusicalInstrument getCopy() {
        return new YamahaPiano();
    }

    @Override
    public String getModel() {
        return "Electronic YAMAHA piano";
    }
}
