package org.theshadowsoftime.theEternalNight.defenses.tower.archer;

import org.theshadowsoftime.theEternalNight.defenses.EnumDefenseType;

/**
 * Created by CJ on 6/16/2014.
 * Developed for the The Eternal Night project.
 */
public class TowerArcherLevel1 extends AbstractTowerArcher {
    public TowerArcherLevel1 (int id) {
        super("Archer Level 1", EnumDefenseType.TOWER, true, 100, 7, 1, 6, 0, id);
        upgrade = new TowerArcherLevel2(1);
    }
}
