package com.ymoataz;

import com.ymoataz.observers.ShootingObserver;

import java.util.ArrayList;
import java.util.List;

public class MediaDirector {

    private List<ShootingObserver> obersversList = new ArrayList<>();

    public void attachObserver(ShootingObserver obs) {
        obersversList.add(obs);
    }

    public void detachObserver(ShootingObserver obs) {
        obersversList.remove(obs);
    }

    public void notifyObservers(String state) {
        for (ShootingObserver obs : obersversList) {
            obs.update(state);
        }
        System.out.println("--------------------");
    }

}
