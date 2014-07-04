package io.github.cjs07.theEternalNight.mission;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * An abstract class used for constructing missions. This class can be used to access the information pertinent to a
 * mission. Mission details can be inputted as parameters to constructor, or read from a file.
 * @author cjs07
 */
public abstract class Mission {

    public static Mission[] missions = new Mission[100];

    private String name;
    private String description;
    private Mission prerequisite;

    private int id;

    File data;
    Scanner reader;

    //TODO: ADD PARAM FOR ALLOWED TOWERS, WEAPONS, TRAPS, TROOPS, ETC.
    public Mission (String name, String description, Mission prerequisite, int id) {
        if (missions[id] != null) {
            System.out.println("[SEVERE] Error occurred in mission initialization. Two missions initialized" +
                    "with the same id " + id);
        } else {
            missions[id] = this;
            this.name = name;
            this.description = description;
            this.prerequisite = prerequisite;
            this.id = id;

            System.out.println("[Mission Initialization] Mission " + name + " successfully initialized with " +
                    "id " + id + " and prerequisite " + prerequisite + ".");
        }
    }

    public Mission (File data) {
        this.data = data;
        try {
            reader = new Scanner(data);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        name = reader.nextLine();
        description = reader.nextLine();
        for (int i = 0; i < missions.length; i++) {
            if (reader.nextLine().equals(missions[i].name)) {
                prerequisite = missions[i];
            }
        }
        id = Integer.parseInt(reader.nextLine());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Mission getPrerequisite() {
        return prerequisite;
    }

    public int getId() {
        return id;
    }

    /**
     * Sets the id of the mission. Has no real use since the id of a mission should not be changed.
     * @param id the new id for the mission
     * @throws IllegalArgumentException if the new id is already the id of an existing mission
     */
    @Deprecated
    public void setId(int id) {
        if (missions[id] != null) {
            throw new IllegalArgumentException("Mission with id " + id + " already exists. Two mission cannot have " +
                    "the same id. No changes can be made");
        }
        this.id = id;
    }
}
