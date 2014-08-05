package org.theshadowsoftime.theEternalNight.defenses;

/**
 * Created by CJ on 6/15/2014.
 * Developed for the The Eternal Night project.
 */
public abstract class AbstractDefense {

    public static AbstractDefense[] defenses = new AbstractDefense[1000];

    String name;
    EnumDefenseType type;
    boolean hasRange;
    boolean hasUpgrades;
    boolean killable;
    int power; //damage dealt per shot
    int sps; //shots per second
    int range;
    int health; //only applies to troops and traps
    int upgradeCost;
    int id;

    protected AbstractDefense(String name, EnumDefenseType type, boolean hasRange,
                              boolean hasUpgrades, boolean killable, int power, int sps,
                              int range, int health, int upgradeCost, int id) {
        this.name = name;
        this.type = type;
        this.hasRange = hasRange;
        this.hasUpgrades = hasUpgrades;
        this.killable = killable;
        this.power = power;
        this.sps = sps;
        this.range = range;
        this.health = health;
        this.upgradeCost = upgradeCost;
        this.id = id;
    }
}
