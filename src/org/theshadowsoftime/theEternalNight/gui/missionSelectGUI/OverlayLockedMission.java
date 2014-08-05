package org.theshadowsoftime.theEternalNight.gui.missionSelectGUI;

import org.theshadowsoftime.theEternalNight.core.TheEternalNight;
import org.theshadowsoftime.theEternalNight.gui.overlay.AbstractOverlay;

/**
 * This class represents an overlay that draws a large lock over locked missions when they are selected.
 */
public class OverlayLockedMission extends AbstractOverlay {

    /**
     * Constructs a new overlay. Should only be called once.
     * @param game an object of type TheEternalNight. Used to gain access to the variables for changing the open GUI
     * @param name the name of the GUI
     * @param id the id of the GUI. Used for the GUI array that contains all GUIs that are part if the game
     */
    public OverlayLockedMission(TheEternalNight game, String name, int id) {
        super(game, name, id);
    }

    /**
     * Called when the thread starts. Revalidates the layout.
     */
    @Override
    public void run() {

    }
}
