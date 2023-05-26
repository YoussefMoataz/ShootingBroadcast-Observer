package com.ymoataz.observers;

public class AnnouncerObserver implements ShootingObserver {

    @Override
    public void update(String state) {
        System.out.println("Announcer is " + state);
    }

}
