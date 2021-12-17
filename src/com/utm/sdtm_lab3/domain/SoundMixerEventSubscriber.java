package com.utm.sdtm_lab3.domain;

public interface SoundMixerEventSubscriber {
    void handleEvent(String eventName);
}
