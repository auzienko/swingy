package swingy.controllers;

import swingy.models.Hero;

public class GUIController {
    private Hero hero;

    public GUIController(Hero hero){
        this.hero = hero;
    }

    public boolean checkPin(int pin){
        return false;
    }
}
