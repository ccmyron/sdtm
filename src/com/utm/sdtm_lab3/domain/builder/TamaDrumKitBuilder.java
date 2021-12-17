package com.utm.sdtm_lab3.domain.builder;

import com.utm.sdtm_lab3.domain.DrumKit;
import com.utm.sdtm_lab3.domain.TamaDrumKit;

public class TamaDrumKitBuilder extends DrumKitBuilderBase {

    @Override
    public DrumKit build() {
        return new TamaDrumKit(hasSnare, hasBass, tomTomsCount, cymbalsCount);
    }
}
