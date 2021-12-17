package com.utm.sdtm_lab3.domain.builder;

import com.utm.sdtm_lab3.domain.DrumKit;
import com.utm.sdtm_lab3.domain.YamahaDrumKit;

public class YamahaDrumKitBuilder extends DrumKitBuilderBase {

    @Override
    public DrumKit build() {
        return new YamahaDrumKit(hasSnare, hasBass, tomTomsCount, cymbalsCount);
    }
}
