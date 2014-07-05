package io.github.cjs07.theEternalNight.gui.overlay;

import io.github.cjs07.theEternalNight.core.TheEternalNight;
import io.github.cjs07.theEternalNight.gui.AbstractGUI;

import javax.swing.*;
import java.awt.*;

/**
 * Represents an overlay. An overlay is a GUI that is drawn over another GUI. An overlay is either opaque or
 * semi-opaque so that the GUI underneath can still be seen.
 */
public abstract class AbstractOverlay extends AbstractGUI {

    /**
     * Constructs a new overlay. Only called by subclasses in their constructors.
     * @param game an object of type TheEternalNight. Used to gain access to the variables for changing the open GUI
     * @param name the name of the GUI
     * @param id the id of the GUI. Used for the GUI array that contains all GUIs that are part if the game
     */
    public AbstractOverlay(TheEternalNight game, String name, int id) {
        super(game, name, id);
        setBackground(new Color(0, 0, 0, 0));
    }
}
