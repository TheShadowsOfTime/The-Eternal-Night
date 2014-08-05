package io.github.cjs07.theEternalNight.core;

import io.github.cjs07.theEternalNight.gui.AbstractGUI;
import io.github.cjs07.theEternalNight.gui.GUIMainMenu;
import io.github.cjs07.theEternalNight.gui.missionSelectGUI.GUIMissionSelect;

import javax.swing.*;
import java.awt.*;

/**
 * Created by CJ on 6/8/2014.
 * Developed for the The Eternal Night project.
 */
public class TheEternalNight extends JFrame {

    public static AbstractGUI mainMenu;
    public static AbstractGUI missionSelect;

    public TheEternalNight () {
        setTitle("The Eternal Night");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(new Dimension(650, 400));
        setLayout(new FlowLayout());
        setVisible(true);

        mainMenu = new GUIMainMenu(this, "Main Menu", 0);
        missionSelect = new GUIMissionSelect(this, "Mission Select", 1);

        loadGUI(mainMenu);
    }

    /**
     * Adds a GUI to the frame. After initial call, should always be called in combination with the removeGUI method.
     * @param gui an object of type AbstractGUI. Used to identify the GUI being added. This object is set as the
     *            content pane of the frame.
     */
    public void loadGUI(AbstractGUI gui) {
        setContentPane(gui);
        gui.closed = false;
        System.out.println("[Display] GUI \"" + gui.name + "\" successfully loaded.");
    }

    /**
     * Removes a GUI from the frame. Should always be called in combination with the loadGUI method, so the GUI that
     * is being removed is actually removed from the frame.
     * @param gui an object of type AbstractGUI. Used to identify the GUI being removed.
     */
    public void closeGUI (AbstractGUI gui) {
        gui.closed = true;
        System.out.println("[Display] GUI \"" + gui.name + "\" successfully closed.");
        repaint();
        revalidate();
    }

    public static void main (String[] args) {
        TheEternalNight game = new TheEternalNight();
    }
}
