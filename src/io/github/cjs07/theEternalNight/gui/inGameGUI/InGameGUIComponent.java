package io.github.cjs07.theEternalNight.gui.inGameGUI;

import io.github.cjs07.theEternalNight.core.TheEternalNight;
import io.github.cjs07.theEternalNight.gui.AbstractGUI;

/**
 * Created by CJ on 7/2/2014.
 * Developed for the The Eternal Night project.
 */
public abstract class InGameGUIComponent extends AbstractGUI{
    public InGameGUIComponent(TheEternalNight game, String name, int id) {
        super(game, name, id);
    }
}
