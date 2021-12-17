package com.utm.sdtm_lab3.domain.factory;

import com.utm.sdtm_lab3.domain.builder.YamahaDrumKitBuilder;
import com.utm.sdtm_lab3.domain.*;

public class ProfessionalMusicalInstrumentFactory implements MusicalInstrumentFactory {

    @Override
    public Guitar createGuitar() {
        return new YamahaGuitar();
    }

    @Override
    public DrumKit createDrumKit() {
        return new YamahaDrumKitBuilder()
                .addSnare()
                .addBass()
                .addCymbals(5)
                .addTomToms(3)
                .build();
    }

    @Override
    public Piano createPiano() {
        return new YamahaPiano();
    }
}
