package org.theshadowsoftime.theEternalNight.gui.inGameGUI;

import org.theshadowsoftime.theEternalNight.core.TheEternalNight;

/**
 * A component for the in game GUI system. This component holds information pertaining to the player for the active
 * mission. Several values it will display are: money, lives, current wave, and remaining waves. Occupies
 * BorderLayout.NORTH.
 */
public class InGameGUIComponentStatusBar extends InGameGUIComponent {
    /**
     * Constructs the status bar. Should only be called once per mission.
     * @param game an object of type TheEternalNight. Used to gain access to the variables for changing the open GUI
     * @param name the name of the GUI
     * @param id the id of the GUI. Used for the GUI array that contains all GUIs that are part if the game
     */
    public InGameGUIComponentStatusBar(TheEternalNight game, String name, int id) {
        super(game, name, id);
    }

    /**
     * Called when the thread starts. Revalidates the layout and repaints the component.
     */
    @Override
    public void run() {

    }
}
