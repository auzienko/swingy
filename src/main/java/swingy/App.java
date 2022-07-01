package swingy;

import javax.swing.*;
import swingy.views.*;
import swingy.controllers.*;
import swingy.models.*;
public class App {
    public static void main(String[] args) {

        Hero hero = new Hero.HeroBuilder().build();
        GUIController guiController = new GUIController(hero);
        GUIView userView = new GUIView(guiController);
        SwingUtilities.invokeLater(new App.GUIRunner(userView));
    }

    public static class GUIRunner implements Runnable {
        private GUIView userView;

        public GUIRunner(GUIView userView) {
            this.userView = userView;
        }

        public void run() {
            userView.init();
        }
    }
}
