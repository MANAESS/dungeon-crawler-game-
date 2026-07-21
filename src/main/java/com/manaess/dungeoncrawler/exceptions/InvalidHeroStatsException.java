package com.manaess.dungeoncrawler.exception;


public class InvalidHeroStatsException extends IllegalArgumentException {

    /**
     * Creates a new exception with a message describing
     * which stat was invalid and why.
     *
     * @param message a description of the invalid stat
     */
    public InvalidHeroStatsException(String message) {
        super(message);
    }
}