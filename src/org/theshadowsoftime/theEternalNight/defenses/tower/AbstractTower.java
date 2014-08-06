package org.theshadowsoftime.theEternalNight.defenses.tower;

import org.theshadowsoftime.theEternalNight.defenses.AbstractDefense;
import org.theshadowsoftime.theEternalNight.defenses.EnumDefenseType;

/**
 *
 */
public abstract class AbstractTower extends AbstractDefense {

    protected AbstractTower upgrade;

    protected AbstractTower(String name, EnumDefenseType type, boolean hasUpgrades, int cost, int power, int sps,
                            int range, int health, int id) {
        super(name, type, hasUpgrades, cost, power, sps, range, health, id);
    }

    public AbstractTower upgrade(){
        return upgrade;
    }

    public Class<? extends AbstractTower> getUpgradeAsClass() {
        return upgrade.getClass();
    }
}
