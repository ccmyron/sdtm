package com.utm.sdtm_lab3.domain.factory;

import com.utm.sdtm_lab3.domain.DrumKit;
import com.utm.sdtm_lab3.domain.Guitar;
import com.utm.sdtm_lab3.domain.Piano;

public interface MusicalInstrumentFactory {
    Guitar createGuitar();
    DrumKit createDrumKit();
    Piano createPiano();
}
