package com.ymoataz.observers;

public class CameraManObserver implements ShootingObserver {

    @Override
    public void update(String state) {
        System.out.println("Camera man is " + state);
    }
}
