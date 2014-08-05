package org.theshadowsoftime.theEternalNight.gui.inGameGUI;

import org.theshadowsoftime.theEternalNight.core.TheEternalNight;

/**
 * This class represents the component responsible for drawing the primary GUI for the game. This is contained in
 * BorderLayout.CENTER in the InGameGUIComponentPanel. Draws towers, enemies, traps, troops, and the track.
 */
public class InGameGUIComponentScreen extends InGameGUIComponent {
    /**
     * Constructs the screen. Should only be called once per mission.
     * @param game an object of type TheEternalNight. Used to gain access to the variables for changing the open GUI
     * @param name the name of the GUI
     * @param id   the id of the GUI. Used for the GUI array that contains all GUIs that are part if the game
     */
    public InGameGUIComponentScreen(TheEternalNight game, String name, int id) {
        super(game, name, id);
    }

    @Override
    public void run() {

    }
}
