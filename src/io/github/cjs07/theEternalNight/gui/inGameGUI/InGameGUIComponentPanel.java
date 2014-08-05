package io.github.cjs07.theEternalNight.gui.inGameGUI;

import io.github.cjs07.theEternalNight.core.TheEternalNight;

import javax.swing.*;
import java.awt.*;

/**
 * This class represents a subclass of JPanel. This panel is used for holding all the components associated with
 * playing the game. Uses Border Layout to organize the components.
 */
public class InGameGUIComponentPanel extends JPanel {
    /**
     * Constructs the panel. Should only be called once.
     */
    public InGameGUIComponentPanel (TheEternalNight game) {
        setLayout(new BorderLayout());
        add(new InGameGUIComponentStatusBar(game, "Status Bar", 3), BorderLayout.NORTH);
        add(new StoreGUI(game, "Store", 4), BorderLayout.SOUTH);
    }
}
