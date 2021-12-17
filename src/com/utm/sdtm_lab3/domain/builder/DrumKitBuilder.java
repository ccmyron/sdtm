package com.utm.sdtm_lab3.domain.builder;

import com.utm.sdtm_lab3.domain.DrumKit;

public interface DrumKitBuilder {
    DrumKitBuilder addSnare();
    DrumKitBuilder addBass();
    DrumKitBuilder addCymbals(int count);
    DrumKitBuilder addTomToms(int count);
    DrumKit build();
}
