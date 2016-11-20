package com.jrmd.benkyoshimasu.object;

import java.util.List;

/**
 * Created by julian on 16/11/2016.
 */

public class Kanji {

    private String kanji;
    private String meaning;
    private List<Reading> readings;
    private Integer strokes;

    public Kanji(String kanji, String meaning, List<Reading> readings, Integer strokes) {
        this.kanji = kanji;
        this.meaning = meaning;
        this.readings = readings;
        this.strokes = strokes;
    }

    public Kanji(String kanji, String meaning, Integer strokes) {
        this.kanji = kanji;
        this.meaning = meaning;
        this.strokes = strokes;
    }

    public String getKanji() {
        return kanji;
    }

    public void setKanji(String kanji) {
        this.kanji = kanji;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    public List<Reading> getReadings() {
        return readings;
    }

    public void setReadings(List<Reading> readings) {
        this.readings = readings;
    }

    public Integer getStrokes() {
        return strokes;
    }

    public void setStrokes(Integer strokes) {
        this.strokes = strokes;
    }
}
