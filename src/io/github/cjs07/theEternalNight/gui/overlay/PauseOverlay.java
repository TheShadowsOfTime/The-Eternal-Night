package io.github.cjs07.theEternalNight.gui.overlay;

import io.github.cjs07.theEternalNight.core.TheEternalNight;

/**
 * Represents the overlay that is drawn over the game screen when the game gets paused. This class is also responsible
 * for freezing the threads and keeping track of the necessary variables. This feature has yet to be implemented.
 */
public class PauseOverlay extends AbstractOverlay {

    /**
     * Constructs the overlay. Should only be called once.
     * @param game an object of type TheEternalNight. Used to gain access to the variables for changing the open GUI
     * @param name the name of the GUI
     * @param id the id of the GUI. Used for the GUI array that contains all GUIs that are part if the game
     */
    public PauseOverlay(TheEternalNight game, String name, int id) {
        super(game, name, id);
    }

    /**
     * Called when the thread is started. Constantly revalidates the layout of the panel.
     */
    @Override
    public void run() {
        while(!closed) {
            revalidate();
        }
    }
}
