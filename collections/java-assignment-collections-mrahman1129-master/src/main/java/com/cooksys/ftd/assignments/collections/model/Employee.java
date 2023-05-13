package com.cooksys.ftd.assignments.collections.model;

import java.util.List;
import java.util.ArrayList;

/**
 * Parent interface for both {@code Manager} and {@code Worker}.
 * <br><br>
 * It defines several getters and a utility method that must be implemented by its subclasses.
 * <br><br>
 * The getters should return data specific to the {@code Employee} they're called on - every instance of
 * {@code Employee} should have its own name and manager.
 */
public interface Employee {

    /**
     * @return the name of the employee
     */
    String getName();

    /**
     * @return true if the employee has a manager, false otherwise
     */
    boolean hasManager();

    /**
     * @return the employee's direct manager, or null if they have none
     */
    Manager getManager();

    /**
     * Calculates the employee's chain of command as a {@code List<Manager>}, starting with their direct {@code Manager},
     * followed by that {@code Manager}'s {@code Manager}, and so on, until the top of the hierarchy is reached.
     * <br><br>
     * The returned list should never be or contain {@code null}.
     * <br><br>
     * If the employee does not have a {@code Manager}, an empty
     * {@code List<Manager>} should be returned.
     *
     * @return a {@code List<Manager>} that represents the employee's chain of command,
     */ 

    default List<Manager> getChainOfCommand() {
        List<Manager> chainOfCommand = new ArrayList<>();
        Manager manager = getManager();
        while (manager != null) {
            chainOfCommand.add(manager);
            manager = manager.getManager();
        }
        return chainOfCommand;
    }
}











