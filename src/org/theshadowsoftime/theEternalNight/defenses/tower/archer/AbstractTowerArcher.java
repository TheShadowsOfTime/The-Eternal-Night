package org.theshadowsoftime.theEternalNight.defenses.tower.archer;

import org.theshadowsoftime.theEternalNight.defenses.EnumDefenseType;
import org.theshadowsoftime.theEternalNight.defenses.tower.AbstractTower;

/**
 * Created by CJ on 6/16/2014.
 * Developed for the The Eternal Night project.
 */
public abstract class AbstractTowerArcher extends AbstractTower {
    protected AbstractTowerArcher(String name, EnumDefenseType type,boolean hasUpgrades, int cost, int power,
                                  int sps, int range, int health, int id) {
        super(name, type, hasUpgrades, cost, power, sps, range , health, id);
    }
}
