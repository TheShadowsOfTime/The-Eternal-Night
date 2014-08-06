package org.theshadowsoftime.theEternalNight.defenses;

import org.theshadowsoftime.theEternalNight.defenses.tower.archer.TowerArcherLevel1;

/**
 *
 */
public class DefenseFactory {

    public static TowerArcherLevel1 createArcher() {
        return new TowerArcherLevel1(0);
    }
}
