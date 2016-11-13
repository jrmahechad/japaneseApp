package com.jrmd.benkyoshimasu.object;

/**
 * Created by julian on 06/11/2016.
 */

public class Word implements Comparable{
    private String spanish;
    private String japanese;
    private String kanji;
    private Integer level;

    public Word(String spanish, String japanese) {
        this.spanish = spanish;
        this.japanese = japanese;
    }

    public Word(String spanish, String japanese, String kanji, Integer level) {
        this.spanish = spanish;
        this.japanese = japanese;
        this.kanji = kanji;
        this.level = level;
    }

    public Word(String spanish, String japanese, String kanji) {
        this.spanish = spanish;
        this.japanese = japanese;
        this.kanji = kanji;
    }

    public Word(String spanish, String japanese, Integer level) {
        this.spanish = spanish;
        this.japanese = japanese;
        this.level = level;
    }

    public String getSpanish() {
        return spanish;
    }

    public void setSpanish(String spanish) {
        this.spanish = spanish;
    }

    public String getJapanese() {
        return japanese;
    }

    public void setJapanese(String japanese) {
        this.japanese = japanese;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getKanji() {
        return kanji;
    }

    public void setKanji(String kanji) {
        this.kanji = kanji;
    }

    @Override
    public int compareTo(Object o) {
        int i = spanish.compareTo(((Word)o).getSpanish());
        if (i != 0) return i;

        return japanese.compareTo(((Word)o).getJapanese());
    }
}
