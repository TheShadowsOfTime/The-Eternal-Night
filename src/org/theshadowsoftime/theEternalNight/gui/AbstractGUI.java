package org.theshadowsoftime.theEternalNight.gui;

import org.theshadowsoftime.theEternalNight.core.TheEternalNight;

import javax.swing.*;

/**
 * An abstract representation of a GUI. This class is a subclass of JPanel to gain access to component methods and
 * variables, and implements Runnable to allow for threads to be created around the class. Meant to be extended to
 * add more specific functionality and components.
 */
public abstract class AbstractGUI extends JPanel implements Runnable{

    public TheEternalNight game;
    public String name;
    int id;

    public boolean closed = true;

    AbstractGUI[] guis = new AbstractGUI[99];

    /**
     * Constructs a new GUI. Only called by subclasses in their constructors.
     * @param game an object of type TheEternalNight. Used to gain access to the variables for changing the open GUI
     * @param name the name of the GUI
     * @param id the id of the GUI. Used for the GUI array that contains all GUIs that are part if the game
     */
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
