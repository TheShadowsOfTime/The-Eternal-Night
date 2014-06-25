package io.github.cjs07.theEternalNight.gui;

import io.github.cjs07.theEternalNight.core.TheEternalNight;

import javax.swing.*;
import java.awt.*;

/**
 * Created by CJ on 6/8/2014.
 * Developed for the The Eternal Night project.
 */
public abstract class AbstractGUI extends JPanel implements Runnable{

    public TheEternalNight game;
    public String name;
    int id;

    public boolean closed = true;

    AbstractGUI[] guis = new AbstractGUI[99];

    public AbstractGUI (TheEternalNight game, String name, int id) {
        if (guis[id] != null) {
            System.out.println("[SEVERE] Error occurred in GUI initialization. Two GUIs initialized at space "
                    + id);
        } else {
            guis[id] = this;

            this.game = game;
            this.name = name;
            this.id = id;

            System.out.println("[GUI Initialization] GUI " + name + " successfully initialized at space " + id +
                    ".");
        }
    }
}
