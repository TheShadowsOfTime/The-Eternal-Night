package io.github.cjs07.theEternalNight.defenses.tower;

import io.github.cjs07.theEternalNight.defenses.AbstractDefense;
import io.github.cjs07.theEternalNight.defenses.EnumDefenseType;

/**
 * Created by CJ on 6/16/2014.
 * Developed for the The Eternal Night project.
 */
public abstract class AbstractTower extends AbstractDefense {
    protected AbstractTower(String name, EnumDefenseType type, boolean hasRange, boolean hasUpgrades,
                            boolean killable, int power, int sps, int range, int health, int upgradeCost, int id) {
        super(name, type, hasRange, hasUpgrades, killable, power, sps, range, health, upgradeCost ,id);
    }
}
