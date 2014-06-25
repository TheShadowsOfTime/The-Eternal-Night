package io.github.cjs07.theEternalNight.mission;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by CJ on 6/14/2014.
 * Developed for the The Eternal Night project.
 */
public abstract class Mission {

    public static Mission[] missions = new Mission[100];

    public String name;
    public String description;
    public Mission prerequisute;
    public int id;

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
            this.prerequisute = prerequisite;
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
                prerequisute = missions[i];
            }
        }
        id = Integer.parseInt(reader.nextLine());
    }
}
