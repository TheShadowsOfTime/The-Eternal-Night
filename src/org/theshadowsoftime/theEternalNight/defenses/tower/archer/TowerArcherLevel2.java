package org.theshadowsoftime.theEternalNight.defenses.tower.archer;

import org.theshadowsoftime.theEternalNight.defenses.EnumDefenseType;

/**
 * Created by CJ on 6/16/2014.
 * Developed for the The Eternal Night project.
 */
public class TowerArcherLevel2 extends AbstractTowerArcher {
    protected TowerArcherLevel2(int id) {
        super("Archer Level 2", EnumDefenseType.TOWER, true, 160, 15, 2, 7, 0, id);
        upgrade = new TowerArcherLevel3(1);
    }
}
