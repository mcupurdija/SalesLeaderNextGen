package com.intelisale.core.eventbus;

import org.greenrobot.eventbus.EventBus;

public class EventBusPoster {

    private final EventBus mEventBus;

    public EventBusPoster(EventBus eventBus) {
        mEventBus = eventBus;
    }

    public void post(Object event) {
        mEventBus.post(event);
    }

    public void postSticky(Object event) {
        mEventBus.postSticky(event);
    }
}
