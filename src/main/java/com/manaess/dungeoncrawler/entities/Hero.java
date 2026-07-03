package com.manaess.dungeoncrawler.entities;

/**
 * Represents the hero controlled by the player.
 * A hero has a name and combat statistics
 * (health points, attack power, defense).
 */
public class Hero {
    private String name;
    private int maxHealth, currentHealth, attackPower, defense;

    /**
     * Creates a new hero with its base statistics.
     * Current health is initialized to the maximum value.
     *
     * @param name the hero's name
     * @param maxHealth the maximum health points
     * @param attackPower the hero's attack power
     * @param defense the hero's defense, reduces incoming damage
     */
    public Hero(String name, int maxHealth, int attackPower, int defense) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.attackPower = attackPower;
        this.defense = defense;
        this.currentHealth = maxHealth;
    }

    /**
     * Returns the hero's current health points.
     *
     * @return the current health points
     */
    public int getCurrentHealth() {
        return currentHealth;
    }


/**
 * Checks whether the hero is still alive.
 *
 * @return true if current health is above zero, false otherwise
 */

    public boolean isAlive() {
        return currentHealth > 0;
         }

}