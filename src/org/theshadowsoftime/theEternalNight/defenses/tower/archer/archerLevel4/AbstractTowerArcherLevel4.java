package org.theshadowsoftime.theEternalNight.defenses.tower.archer.archerLevel4;

import org.theshadowsoftime.theEternalNight.defenses.EnumDefenseType;
import org.theshadowsoftime.theEternalNight.defenses.tower.archer.AbstractTowerArcher;

/**
 * Created by CJ on 6/16/2014.
 * Developed for the The Eternal Night project.
 */
public abstract class AbstractTowerArcherLevel4 extends AbstractTowerArcher {
    protected AbstractTowerArcherLevel4(String name, EnumDefenseType type, boolean hasUpgrades, int cost,
                                        int power, int sps, int range, int health, int id) {
        super(name, type, hasUpgrades, cost, power, sps, range, health, id);
    }
}
