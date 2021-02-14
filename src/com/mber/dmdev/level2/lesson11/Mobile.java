package com.mber.dmdev.level2.lesson11;

public final class Mobile extends Computer{
    public Mobile(Ssd ssd, Ram ram) {
        super(ssd, ram);
    }

    @Override
    public void load() {
        System.out.println("mobile включился");
    }
}

