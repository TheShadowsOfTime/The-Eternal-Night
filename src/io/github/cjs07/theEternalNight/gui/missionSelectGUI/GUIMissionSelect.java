package io.github.cjs07.theEternalNight.gui.missionSelectGUI;

import io.github.cjs07.theEternalNight.core.TheEternalNight;
import io.github.cjs07.theEternalNight.gui.AbstractGUI;
import io.github.cjs07.theEternalNight.mission.Mission;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by CJ on 6/8/2014.
 * Developed for the The Eternal Night project.
 */
public class GUIMissionSelect extends AbstractGUI {

    Thread missionSelectThread = new Thread(this);

    boolean closed = true;

    //GUI logic variables;
    int selectedMission;

    //GUI Components
    JComboBox missionArea;
    JButton start;

    public GUIMissionSelect(TheEternalNight game, String name, int id) {
        super(game, name, id);

        missionArea = new JComboBox();
        start = new JButton("Start Mission");

        add(missionArea);

        for (int i = 0; i < Mission.missions.length; i++) {
            missionArea.addItem("Test " + i);
        }
        missionArea.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedMission = missionArea.getSelectedIndex();
            }
        });
        missionSelectThread.start();
    }

    @Override
    public void paintComponent(Graphics g){
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 650, 400);
        g.setColor(Color.WHITE);
        g.setFont(new Font ("Courier New", Font.BOLD, 24));
        g.drawString("Selected mission is: " + selectedMission, 325, 200);
    }

    @Override
    public void run() {
        while (true) {
            repaint();
            revalidate();
        }
    }
}
