package com.mber.topic.core.dmdev.level2.lesson11_modifier_static;

public final class Mobile extends Computer{
    public Mobile(Ssd ssd, Ram ram) {
        super(ssd, ram);
    }

    @Override
    public void load() {
        System.out.println("mobile включился");
    }
}

