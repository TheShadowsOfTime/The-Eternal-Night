package io.github.cjs07.theEternalNight.gui.inGameGUI;

import io.github.cjs07.theEternalNight.defenses.tower.AbstractTower;

import javax.swing.*;

/**
 *
 */
public class StoreButton extends JButton{

    AbstractTower tower;

    public StoreButton (AbstractTower tower) {
        super();
        this.tower = tower;
    }

    public StoreButton(Icon icon, AbstractTower tower) {
        super(icon);
        this.tower = tower;
    }

    //TODO: When the button is pushed, buy the associated tower
    public void onPush() {

    }

    public AbstractTower getTower() {
        return tower;
    }
}
