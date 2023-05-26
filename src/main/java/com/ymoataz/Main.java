package com.ymoataz;

import com.ymoataz.observers.AnnouncerObserver;
import com.ymoataz.observers.CameraManObserver;
import com.ymoataz.observers.ShootingObserver;

public class Main {
    public static void main(String[] args) {

        ShootingObserver cameraManObserver = new CameraManObserver();
        ShootingObserver announcerObserver = new AnnouncerObserver();

        MediaDirector director = new MediaDirector();

        // attach the two observers
        director.attachObserver(cameraManObserver);
        director.attachObserver(announcerObserver);

        // publish the state - two observing
        director.notifyObservers("ready");

        // remove an observer
        director.detachObserver(cameraManObserver);

        // publish the state - only one observes
        director.notifyObservers("done for today");

    }
}