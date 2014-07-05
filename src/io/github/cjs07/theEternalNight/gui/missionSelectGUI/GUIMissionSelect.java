package io.github.cjs07.theEternalNight.gui.missionSelectGUI;

import io.github.cjs07.theEternalNight.core.TheEternalNight;
import io.github.cjs07.theEternalNight.gui.AbstractGUI;
import io.github.cjs07.theEternalNight.mission.Mission;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This class represents a GUI that allows for the selection of missions. Missions are selected through a drop down
 * menu represented by a JComboBox missionArea. The selected mission is represented by an integer, selectedMission.
 * Contains a second JPanel used for holding components, and a JButton that starts missions.
 */
//TODO: ALTER THIS CLASS TO MAKE GUI A MENU WITH A SCROLLABLE LIST OF MISSIONS ON ONE SIDE
public class GUIMissionSelect extends AbstractGUI {

    Thread missionSelectThread = new Thread(this);

    boolean closed = true;

    //GUI logic variables;
    int selectedMission;

    //GUI Components
    JPanel panel; //JPanel used for holding the components of the GUI

    JComboBox missionArea;
    JButton start;

    /**
     * Constructs a new GUI representing the mission selection GUI. Should only be called once.
     * @param game an object of type TheEternalNight. Used to gain access to the variables for changing the open GUI
     * @param name the name of the GUI
     * @param id the id of the GUI. Used for the GUI array that contains all GUIs that are part if the game
     */
    public GUIMissionSelect(TheEternalNight game, String name, int id) {
        super(game, name, id);

        setLayout(new BorderLayout());

        panel = new JPanel();
        missionArea = new JComboBox();
        start = new JButton("Start Mission");

        panel.add(missionArea);

        for (int i = 0; i < Mission.missions.length; i++) {
            missionArea.addItem("Test " + i);
        }
        missionArea.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedMission = missionArea.getSelectedIndex();
            }
        });

        add(panel, BorderLayout.NORTH);
        panel.setBackground(Color.BLACK);

        missionSelectThread.start();
    }

    /**
     * Paints the component. Called by components manager when repaint() is called.
     * @param g a graphics context used for painting.
     */
    @Override
    public void paintComponent(Graphics g){
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, game.getWidth(), game.getHeight());
        g.setColor(Color.WHITE);
        g.setFont(new Font ("Courier New", Font.BOLD, 24));
        g.drawString("Selected mission is: " + selectedMission, (getWidth() / 2) - (getWidth() / 4),
                getHeight() / 2);
    }

    /**
     * Called when the thread is started. Revalidates the layout and repaints the component.
     */
    @Override
    public void run() {
        while (true) {
            repaint();
            revalidate();
        }
    }
}
