package org.theshadowsoftime.theEternalNight.gui.inGameGUI;

import org.theshadowsoftime.theEternalNight.core.TheEternalNight;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Represents the in game store. Contains many JButtons representing possible purchases and their prices. Occupies
 * BorderLayout.SOUTH
 */
public class StoreGUI extends InGameGUIComponent {

    private ActionListener buttonAction = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            StoreButton src = (StoreButton) e.getSource();
            src.onPush();
            repaint();
            revalidate();
        }
    };



    /**
     * Constructs the store's GUI. Should only be called once per mission.
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
