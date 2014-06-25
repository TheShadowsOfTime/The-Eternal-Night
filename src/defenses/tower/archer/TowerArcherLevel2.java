package defenses.tower.archer;

import defenses.EnumDefenseType;
import defenses.tower.archer.AbstractTowerArcher;

/**
 * Created by CJ on 6/16/2014.
 * Developed for the The Eternal Night project.
 */
public class TowerArcherLevel2 extends AbstractTowerArcher {
    protected TowerArcherLevel2(String name, EnumDefenseType type, boolean hasRange, boolean hasUpgrades,
                                boolean killable, int power, int sps, int range, int health, int upgradeCost, int id) {
        super(name, type, hasRange, hasUpgrades, killable, power, sps, range, health, upgradeCost, id);
    }
}
