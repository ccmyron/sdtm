package com.utm.sdtm_lab3.domain.factory;

import com.utm.sdtm_lab3.domain.builder.TamaDrumKitBuilder;
import com.utm.sdtm_lab3.domain.*;

public class BeginnerMusicalInstrumentFactory implements MusicalInstrumentFactory {

    @Override
    public Guitar createGuitar() {
        return new YamahaGuitar();
    }

    @Override
    public DrumKit createDrumKit() {
        return new TamaDrumKitBuilder()
                .addSnare()
                .addBass()
                .addCymbals(1)
                .build();
    }

    @Override
    public Piano createPiano() {
        return new YamahaPiano();
    }
}
