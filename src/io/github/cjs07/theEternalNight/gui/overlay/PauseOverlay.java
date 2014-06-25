package io.github.cjs07.theEternalNight.gui.overlay;

import io.github.cjs07.theEternalNight.core.TheEternalNight;

/**
 * Created by CJ on 6/13/2014.
 * Developed for the The Eternal Night project.
 */
public class PauseOverlay extends AbstractOverlay {

    public PauseOverlay(TheEternalNight game, String name, int id) {
        super(game, name, id);
    }

    @Override
    public void run() {
        while(!closed) {
            revalidate();
        }
    }
}
