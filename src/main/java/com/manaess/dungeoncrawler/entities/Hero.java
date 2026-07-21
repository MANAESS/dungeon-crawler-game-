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


/**
 * Applies damage to the hero, reduced by their defense.
 * The actual damage dealt is never negative, and current health
 * never drops below zero.
 *
 * @param amount the raw amount of damage inflicted
 */

public void takeDamage(int amount){
            int actualDamage = Math.max(amount-defense,0);
            currentHealth = Math.max(currentHealth - actualDamage,0);
     }


/**
 * Heals the hero, increasing current health.
 * Current health never exceeds the hero's maximum health.
 *
 * @param amount the amount of health to restore
 */ 

public void heal( int amount) {
            currentHealth = Math.min(currentHealth + amount,maxHealth);
     }

   }