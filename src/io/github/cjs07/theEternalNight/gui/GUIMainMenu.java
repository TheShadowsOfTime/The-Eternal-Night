package io.github.cjs07.theEternalNight.gui;

import io.github.cjs07.theEternalNight.core.TheEternalNight;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This subclass of AbstractGUI represents the main menu of the game. Contains three buttons, Start Game, Options, and
 * Exit Game. Start Game opens the Mission Select GUI, Options opens the options menu, and Exit Game calls System.exit.
 * Currently, this GUI cannot be accessed outside of when the game starts.
 */
public class GUIMainMenu extends AbstractGUI {

    Thread mainMenuThread = new Thread(this);

    //GUI Components
    JButton start;
    JButton options;
    JButton exit;

    /**
     * Constructs a new GUI representing the main menu. All variables are initialized here. Should only be called once
     * to prevent an abundance of threads from being created.
     * @param game an object of type TheEternalNight. Used to gain access to the variables for changing the open GUI
     * @param name the name of the GUI
     * @param id the id of the GUI. Used for the GUI array that contains all GUIs that are part if the game
     */
    public GUIMainMenu(final TheEternalNight game, String name, int id) {
        super(game, name, id);

        start = new JButton("Start Game");
        options = new JButton("Options");
        exit = new JButton("Exit Game");

        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                game.closeGUI(game.mainMenu);
                game.loadGUI(game.missionSelect);
            }
        });

        options.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO: OPEN OPTIONS GUI
            }
        });

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        add(start);
        add(options);
        add(exit);

        closed = false;
        mainMenuThread.start();
    }

    /**
     * Called when the thread for the GUI is started. Contains an infinite loop that revalidates the layout of the GUI.
     */
    @Override
    public void run() {
        while (true) {
            revalidate();
        }
    }
}
