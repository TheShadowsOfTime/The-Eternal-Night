package org.theshadowsoftime.theEternalNight.gui.inGameGUI;

import org.theshadowsoftime.theEternalNight.core.TheEternalNight;
import org.theshadowsoftime.theEternalNight.gui.AbstractGUI;

/**
 * Represents a part of the in game GUI system.
 */
public abstract class InGameGUIComponent extends AbstractGUI {
    /**
     * Constructs the component. Only called by subclasses in thier constructors.
     * @param game an object of type TheEternalNight. Used to gain access to the variables for changing the open GUI
     * @param name the name of the GUI
     * @param id the id of the GUI. Used for the GUI array that contains all GUIs that are part if the game
     */
    public InGameGUIComponent(TheEternalNight game, String name, int id) {
        super(game, name, id);
    }
}
