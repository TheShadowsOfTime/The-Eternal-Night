package defenses;

/**
 * Created by CJ on 6/15/2014.
 * Developed for the The Eternal Night project.
 */
public enum EnumDefenseType {
    TOWER("Tower", true, false, 0),
    TROOP("Troop", true, true, 1),
    TRAP("Trap", true, false, 2);

    String typeName;
    boolean hasRange;
    boolean killable;
    int id;

    EnumDefenseType(String typeName, boolean hasRange, boolean killable, int id) {
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public boolean isHasRange() {
        return hasRange;
    }

    public void setHasRange(boolean hasRange) {
        this.hasRange = hasRange;
    }

    public boolean isKillable() {
        return killable;
    }

    public void setKillable(boolean kkillable) {
        this.killable = kkillable;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
