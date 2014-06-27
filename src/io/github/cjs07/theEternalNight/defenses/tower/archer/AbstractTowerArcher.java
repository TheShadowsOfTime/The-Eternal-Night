package io.github.cjs07.theEternalNight.defenses.tower.archer;

import io.github.cjs07.theEternalNight.defenses.EnumDefenseType;
import io.github.cjs07.theEternalNight.defenses.tower.AbstractTower;

/**
 * Created by CJ on 6/16/2014.
 * Developed for the The Eternal Night project.
 */
public abstract class AbstractTowerArcher extends AbstractTower {
    protected AbstractTowerArcher(String name, EnumDefenseType type, boolean hasRange,boolean hasUpgrades,
                                  boolean killable, int power, int sps, int range, int health, int upgradeCost,
                                  int id) {
        super(name, type, hasRange, hasUpgrades, killable, power, sps, range, health, upgradeCost, id);
    }
}
