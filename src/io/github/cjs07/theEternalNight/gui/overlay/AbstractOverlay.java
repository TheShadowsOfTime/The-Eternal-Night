package io.github.cjs07.theEternalNight.gui.overlay;

import io.github.cjs07.theEternalNight.core.TheEternalNight;
import io.github.cjs07.theEternalNight.gui.AbstractGUI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by CJ on 6/13/2014.
 * Developed for the The Eternal Night project.
 */
public abstract class AbstractOverlay extends AbstractGUI {

    public AbstractOverlay(TheEternalNight game, String name, int id) {
        super(game, name, id);
        setBackground(new Color(0, 0, 0, 0));
    }
}
