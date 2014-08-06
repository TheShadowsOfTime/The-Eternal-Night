package org.theshadowsoftime.theEternalNight.defenses;

/**
 *
 */
public abstract class AbstractDefense {

    String name;
    EnumDefenseType type;
    boolean hasRange;
    boolean killable;
    int cost; //how much the tower costs, in higher level towers this functions as the upgrade cost
    boolean hasUpgrades;
    int power; //damage dealt per shot
    int sps; //shots per second
    int range;
    int health; //only applies to troops and traps
    int id; //used to track method of creation, 0 is a bought tower, 1 is an upgraded tower, 2 is a preplaced tower

    protected AbstractDefense(String name, EnumDefenseType type, boolean hasUpgrades, int cost, int power, int sps,
                              int range, int health, int id) {
        this.name = name;
        this.type = type;
        hasRange = type.isHasRange();
        killable = type.isKillable();
        this.hasUpgrades = hasUpgrades;
        this.cost = cost;
        this.power = power;
        this.sps = sps;
        this.range = range;
        this.health = health;
        this.id = id;
    }

    public void buy() {}
}
