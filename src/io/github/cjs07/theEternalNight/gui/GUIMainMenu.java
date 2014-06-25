package io.github.cjs07.theEternalNight.gui;

import io.github.cjs07.theEternalNight.core.TheEternalNight;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by CJ on 6/8/2014.
 * Developed for the The Eternal Night project.
 */
public class GUIMainMenu extends AbstractGUI {

    Thread mainMenuThread = new Thread(this);

    //GUI Components
    JButton start;
    JButton options;
    JButton exit;

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

    @Override
    public void paintComponent(Graphics g) {

    }

    @Override
    public void run() {
        while (true) {
            repaint();
            revalidate();
        }
    }
}
