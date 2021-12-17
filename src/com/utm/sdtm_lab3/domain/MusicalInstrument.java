package com.utm.sdtm_lab3.domain;

public interface MusicalInstrument {

    /** Get a copy of this instrument with the same configuration */
    MusicalInstrument getCopy();

    /** Get the full model of the instrument */
    String getModel();

    /** Play on this instrument */
    void play();
}
