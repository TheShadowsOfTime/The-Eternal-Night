package io.github.cjs07.theEternalNight.gui.inGameGUI;

import io.github.cjs07.theEternalNight.core.TheEternalNight;

/**
 * Represents the in game store. Contains many JButtons representing possible purchases and their prices. Occupies
 * BorderLayout.SOUTH
 */
public class StoreGUI extends InGameGUIComponent {
    /**
     * Constructs the GUI. Should only be called once.
     * @param game an object of type TheEternalNight. Used to gain access to the variables for changing the open GUI
     * @param name the name of the GUI
     * @param id the id of the GUI. Used for the GUI array that contains all GUIs that are part if the game
     */
    public StoreGUI(TheEternalNight game, String name, int id) {
        super(game, name, id);
    }

    /**
     * Called when the thread is started. Revalidates the layout.
     */
    @Override
    public void run() {

    }
}
