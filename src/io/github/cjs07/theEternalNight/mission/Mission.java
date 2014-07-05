package io.github.cjs07.theEternalNight.mission;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * An abstract class used for constructing missions. This class can be used to access the information pertinent to a
 * mission. Mission details can be inputted as parameters to constructor, or read from a file.
 */
public abstract class Mission {

    public static Mission[] missions = new Mission[100];

    /**The name of the mission*/
    private String name;
    /**The missions description.*/
    private String description;
    /**An object of type Mission. The mission that must be completed in order to unlock this mission. This CANNOT be
     * changed after construction*/
    private Mission prerequisite;

    /**An integer used to store data in the missions array.*/
    private int id;
    /**Whether or not this mission is completed*/
    private boolean completed = false;
    /**Whether or not the mission is unlocked*/
    private boolean unlocked = false;

    /**A file containing the data for constructing the mission.*/
    File data;
    /**A Scanner object used for reading the data from the files*/
    Scanner reader;

    //TODO: ADD PARAM FOR ALLOWED TOWERS, WEAPONS, TRAPS, TROOPS, ETC.
    /**
     * Constructs a new mission with the specified parameters.
     * @param name a String representing the name of the mission
     * @param description a String representing the description off the mission. Displayed on mission select screen.
     *                    Beware the length of this String, as they can become very long.
     * @param prerequisite an Object of type Mission, the mission that must be completed before the mission being
     *                     constructed can be attempted.
     * @param id an int representing the id of the mission. Used for registering mission data in the missions array.
     */
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

    /**
     * Constructs a mission with parameters from the specified file.
     * @param data a File containing the data for the construction of a mission. Each value is on a new line. Order
     *             for values is name, description, prerequisite, id
     */
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

    /**
     * Returns the name of the mission. Useful for display components.
     * @return the name of the mission
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the mission.
     * @param name the new name of the mission
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the description of the mission. This method generally returns lengthy Strings.
     * @return the description of the mission
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description for the mission. Should only be used in a special case for the mission that requires an
     * altered description.
     * @param description the new description for the mission
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Returns the mission that has to be completed to unlock this mission.
     * @return the prerequisite mission.
     */
    public Mission getPrerequisite() {
        return prerequisite;
    }

    /**
     * Returns the id of the mission. Can be used to gain access to the rest of the data through the missions array.
     * @return the id of the mission
     */
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

    /**
     * Returns whether or not the mission is completed. Useful in determining whether or not a mission is unlocked.
     * @return whether or not the mission is completed
     */
    public boolean isCompleted() {
        return completed;
    }

    /**
     * Sets whether or not the mission is completed. Should always be called upon successful completion of a mission.
     * @param completed whether or not the mission is completed
     */
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    /**
     * Returns whether or not the mission is unlocked. Should always be called when a mission start request is sent.
     * @return whether or not the mission is unlocked
     */
    public boolean isUnlocked() {
        return unlocked;
    }

    /**
     * Sets whether or not the mission is unlocked. This method is automatically called when a mission is completed,
     * if the completed mission is the prerequisite for that mission.
     * @param unlocked whether or not the mission is unlocked
     */
    public void setUnlocked(boolean unlocked) {
        this.unlocked = unlocked;
    }
}
