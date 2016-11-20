package com.jrmd.benkyoshimasu.object;

/**
 * Created by julian on 16/11/2016.
 */

public class Reading {
    private String reading;
    private Boolean kun;

    public Reading(String reading, Boolean kun) {
        this.reading = reading;
        this.kun = kun;
    }

    public String getReading() {
        return reading;
    }

    public void setReading(String reading) {
        this.reading = reading;
    }

    public Boolean getKun() {
        return kun;
    }

    public void setKun(Boolean kun) {
        this.kun = kun;
    }
}
